from collections import deque

dx = [0, 0, -1, 1]
dy = [-1, 1, 0, 0]
T = int(input())

def bfs(y, x):
    Q = deque()
    Q.append((y, x))
    grid[y][x] = 2
    while Q:
        y, x = Q.popleft()
        for i in range(4):
            nx = x + dx[i]
            ny = y + dy[i]
            if M > nx >=0 and N > ny >= 0 and grid[ny][nx] == 1:
                Q.append((ny, nx))
                grid[ny][nx] = 2

for t in range(T):
    M, N, K = map(int, input().split())
    grid = [[0 for i in range(M)] for j in range(N)]
    for k in range(K):
        x, y = map(int, input().split())
        grid[y][x] = 1
    count = 0
    for row in range(N):
        for col in range(M):
            if grid[row][col] == 1:
                bfs(row, col)
                count += 1
    print(count)