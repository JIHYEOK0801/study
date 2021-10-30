from copy import deepcopy
def is_available(m,i,j,place_li):
    for k in range(place_li):
        if j == place_li[k] or (abs(i-k) == abs(j-place_li[k])):
            return False
    return True

def placement(m,i,place_li):
    copy_place_li = deepcopy(place_li)
    
    for j in range(len(m)):
        if is_available(m,i,j,copy_place_li):
            copy_place_li.append(j)
            placement(m,i+1,copy_place_li)
    
def solution(n):
    answer = 0
    m = [[0] * n for _ in range(len(n))]
    place_li = []
    placement(m,0,place_li)

    return answer

print(solution(5))