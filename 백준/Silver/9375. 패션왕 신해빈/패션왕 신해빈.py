import sys

T = int(sys.stdin.readline().rstrip())

for  i in range(T):
    cloths = {}
    answer = 1
    N = int(sys.stdin.readline().rstrip())
    for j in range(N):
        _, cloth = sys.stdin.readline().rstrip().split()
        if cloth in cloths.keys():
            cloths[cloth] += 1
        else:
            cloths[cloth] = 1

    for k in cloths.keys():
        answer *= (cloths[k] + 1)
    print(answer - 1 )