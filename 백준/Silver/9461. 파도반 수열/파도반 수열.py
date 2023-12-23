import sys

MAX = 100

T = int(sys.stdin.readline().rstrip())

dp = [1, 1, 1] + [0] * 97

for i in range(3, MAX):
    dp[i] = dp[i - 3] + dp[i - 2]

for i in range(T):
    N = int(sys.stdin.readline().rstrip())
    print(dp[N - 1])
