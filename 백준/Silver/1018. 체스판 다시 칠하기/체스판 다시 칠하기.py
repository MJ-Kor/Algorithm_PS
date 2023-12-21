M, N = map(int, input().split())
chess = 8
white = ["WBWBWBWB",
         "BWBWBWBW",
         "WBWBWBWB",
         "BWBWBWBW",
         "WBWBWBWB",
         "BWBWBWBW",
         "WBWBWBWB",
         "BWBWBWBW"]
black = ["BWBWBWBW",
         "WBWBWBWB",
         "BWBWBWBW",
         "WBWBWBWB",
         "BWBWBWBW",
         "WBWBWBWB",
         "BWBWBWBW",
         "WBWBWBWB"]
board = []
answer = M * N

for i in range(M):
    board.append(input())

def paint(my_line, answer_line):
    count = 0
    for i in range(chess):
        if my_line[i] != answer_line[i]:
            count += 1
    return count

def check_func(my_chess_board):
    white_total = 0
    black_total = 0
    for row in range(chess):
        white_total += paint(my_chess_board[row], white[row])
        black_total += paint(my_chess_board[row], black[row])
    return min(white_total, black_total)

for start_row in range(M-chess+1):
    for start_col in range(N-chess+1):
        answer = min(answer, check_func([row[start_col:start_col + chess] for row in board[start_row:start_row + chess]]))

print(answer)