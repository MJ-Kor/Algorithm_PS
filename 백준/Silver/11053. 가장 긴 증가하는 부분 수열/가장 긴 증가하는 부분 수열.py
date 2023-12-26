import sys

N = int(sys.stdin.readline().rstrip())

A = [0] + list(map(int, sys.stdin.readline().rstrip().split()))

dp = [0] * (N + 1)

for i in range(1, N + 1):
    for j in range(i):
        if A[j] < A[i]:
            dp[i] = max(dp[j] + 1, dp[i])
            
print(max(dp))