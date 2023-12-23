import sys

N, M = map(int, sys.stdin.readline().rstrip().split())

arr = list(map(int, sys.stdin.readline().rstrip().split()))

dp = [0]

sum = 0

for i in arr:
    sum += i
    dp.append(sum)

for m in range(M):
    i ,j = map(int, sys.stdin.readline().rstrip().split())
    print(dp[j] - dp[i - 1])