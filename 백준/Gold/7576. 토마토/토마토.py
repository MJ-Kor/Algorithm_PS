from collections import deque

cols, rows = map(int, input().split())
tomatoes = []

for row in range(rows):
    tomatoes.append(list(map(int, input().split())))

#print(tomatoes)
flag = False
Q = deque()
# 상하좌우, row: y, col: x
dx = [0, 0, -1, 1]
dy = [-1, 1, 0, 0]

answer = 0

for i in range(rows):
    for j in range(cols):
        if tomatoes[i][j] == 1:
            Q.append((i, j))

while Q:
    y, x = Q.popleft()
    if tomatoes[y][x] > answer:
        answer = tomatoes[y][x]
    for i in range(4):
        nx = x + dx[i]
        ny = y + dy[i]
        if rows > ny >= 0 and cols > nx >= 0 and tomatoes[ny][nx] == 0:
            tomatoes[ny][nx] = tomatoes[y][x] + 1
            Q.append((ny, nx))

for i in range(rows):
    for j in range(cols):
        if tomatoes[i][j] == 0:
            flag = True

if flag:
    print(-1)
else:
    print(answer-1)