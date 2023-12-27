import sys

N, M = map(int, sys.stdin.readline().rstrip().split())

my_list = list(map(int, sys.stdin.readline().rstrip().split()))

my_list.sort()


out = []

def dfs():
    if len(out) == M:
        print(' '.join(map(str, out)))
        return
    memory = -1
    for i in range(N):
        if len(out) != 0 and out[-1] > my_list[i]:
            continue
        if memory != my_list[i]:
            out.append(my_list[i])
            memory = my_list[i]
            dfs()
            out.pop()

dfs()