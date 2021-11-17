## BFS, DFS 문제 몇번 풀어보고 다시 도전

from collections import deque
from copy import deepcopy

def bfs(i, j, k, dir, max_k):
    s = deque([[i,j,k,dir]])
    togo_list = [[0,1,'R'], [1,0,'D'], [0,-1,'L'], [-1,0,'U']]
    visited = [[0,0]]
    count = 0
    while(s):
        pos = s.popleft()
        if pos[0] == N-1 and pos[1] == N-1:
            cost = (count - pos[2]) * 100 + pos[2] * 500
            answer = min(answer, cost)
        
        if pos[2] > max_k:
            continue
        
        for togo in togo_list:
            new_i = pos[0] + togo[0]
            new_j = pos[1] + togo[1]
            if 0<=new_i<N and 0<=new_j<N:
                if new_board[new_i][new_j] != 1:
                    if pos[3] == togo[2]:

def solution(board):
    
    global new_board, N, answer
    answer = float('inf')
    new_board = deepcopy(board)
    N = len(new_board)

    for k in range(N*N):
        bfs(0,0,0,'R',k)
        bfs(0,0,0,'D',k)
    


    return answer


print(solution([[0,0,0,0,0,0,0,1],[0,0,0,0,0,0,0,0],[0,0,0,0,0,1,0,0],[0,0,0,0,1,0,0,0],
[0,0,0,1,0,0,0,1],[0,0,1,0,0,0,1,0],[0,1,0,0,0,1,0,0],[1,0,0,0,0,0,0,0]]))