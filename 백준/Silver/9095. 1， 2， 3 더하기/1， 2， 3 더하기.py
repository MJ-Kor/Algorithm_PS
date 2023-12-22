import sys

T = int(sys.stdin.readline().rstrip())

dp = [1, 2, 4] + ([0] * 8)

for i in range(3, 10):
    dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3]

for i in range(T):
    n = int(sys.stdin.readline().rstrip())
    print(dp[n-1])