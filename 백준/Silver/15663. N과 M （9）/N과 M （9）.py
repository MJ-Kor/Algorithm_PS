import sys
import copy

N, M = map(int, sys.stdin.readline().rstrip().split())

my_list = list(map(int, sys.stdin.readline().rstrip().split()))

my_list.sort()

visited = [False] * N

printed = []

out = []

def dfs():
    if len(out) == M:
        print(' '.join(map(str, out)))
        return
    memory = -1
    for i in range(N):
        if not visited[i] and memory != my_list[i]:
            out.append(my_list[i])
            visited[i] = True
            memory = my_list[i]
            dfs()
            visited[i] = False
            out.pop()

dfs()