# chess_board의 인덱스는 보드의 행, 값은 열
# 이전에 놓아진 퀸과 놓으려는 퀸의 행끼리의 차, 열끼리의 차가 같은 대각선임

def N_Queen(row):
    global count
    global N
    global chess_board
    if row == N:
        count += 1
        return

    for col in range(N):
        flag = 1
        chess_board[row] = col
        for i in range(row):
            if chess_board[i] == chess_board[row] or abs(chess_board[i] - chess_board[row]) == row - i:
                flag = 0
                break
        if flag == 1:
            N_Queen(row + 1)


N = int(input())
count = 0
chess_board = [None] * N
N_Queen(0)
print("%d"%(count))