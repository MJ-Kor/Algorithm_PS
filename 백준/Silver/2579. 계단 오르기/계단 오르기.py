import sys

N = int(sys.stdin.readline().rstrip())

dp = [0]*N
stair = []
for i in range(N):
    stair.append(int(sys.stdin.readline().rstrip()))

for i in range(N):
    if i == 0:
        dp[i] = stair[i]
    elif i == 1:
        dp[i] = stair[i-1] + stair[i]
    elif i == 2:
        dp[i] = max((stair[i-2] + stair[i]), (stair[i-1] + stair[i]))
    else:
        dp[i] = max((dp[i-3] + stair[i-1] + stair[i]), (dp[i-2] + stair[i]))

print(dp[-1])