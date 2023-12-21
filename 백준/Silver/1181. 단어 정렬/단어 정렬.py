N = int(input())

words = []

def sort_by_length(words):
    for i in range(len(words)-1, 0, -1):
        for j in range(i):
            if len(words[j]) > len(words[j+1]):
                tmp = words[j]
                words[j] = words[j+1]
                words[j+1] = tmp

for i in range(N):
    words.append(input())

words = list(set(words))
words.sort()

sort_by_length(words)

for i in words:
    print(i)