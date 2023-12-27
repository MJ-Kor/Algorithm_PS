import sys

input = sys.stdin.readline

A, B = map(str, input().split())
cnt = 0

while (1):
    if B[-1] == '1':
        B = B[:-1]
        cnt += 1
    elif int(B[-1]) % 2 == 0:
        B = str(int(B) // 2)
        cnt += 1
    elif int(B[-1]) % 2 == 1:
        if B != A:
            cnt = -1
            break

    if int(B) < int(A) or B == '':
        cnt = -1
        break

    if B == A:
        cnt += 1
        break

print(cnt)