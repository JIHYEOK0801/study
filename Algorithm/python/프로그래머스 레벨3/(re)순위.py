## 플로이드 워셜
## 모든 노드에서 다른 노드까지의 최소 거리를 구할때 사용
## 시간복잡도 = O(n^3)

def solution(n, results):
    answer = 0

    ## 2차원 배열 초기화
    arr = [[0] * n for _ in range(n)]

    for i,j in results:
        arr[i-1][j-1] = 1
        arr[j-1][i-1] = -1

    ## 플로이드-워셜 알고리즘 응용
    for k in range(n):
        for i in range(n):
            for j in range(n):
                if arr[i][j] == 0:
                    if arr[i][k] == 1 and arr[k][j] == 1:
                        arr[i][j] = 1
                    elif arr[i][k] == -1 and arr[k][j] == -1:
                        arr[i][j] = -1

    ## 본인 제외 나머지 노드들에 대한 승패가 결정난 것만 셈
    for li in arr:
        if li.count(0) == 1:
            answer += 1

    print(arr)

    return answer

##print(solution(5, [[4, 3], [4, 2], [3, 2], [1, 2], [2, 5]]))
print(solution(5, [[1, 2], [2, 3], [3, 4], [4,5]]))