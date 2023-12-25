import sys

N, M = map(int, sys.stdin.readline().rstrip().split())

my_list = list(map(int, sys.stdin.readline().rstrip().split()))

my_list.sort()

visited = [False] * N

out = []

def dfs():
    if len(out) == M:
        print(' '.join(map(str, out)))
        return

    for i in range(N):
        if not visited[i]:
            out.append(my_list[i])
            visited[i] = True
            dfs()
            visited[i] = False
            out.pop()

dfs()