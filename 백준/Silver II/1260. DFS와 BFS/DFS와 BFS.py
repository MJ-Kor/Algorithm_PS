from collections import deque

N, M, V = map(int, input().split())
graph = dict()
for i in range(M):
    node1, node2 = map(int, input().split())
    if not node1 in graph.keys():
        graph[node1] = [node2]
    else:
        graph[node1].append(node2)
    if not node2 in graph.keys():
        graph[node2] = [node1]
    else:
        graph[node2].append(node1)

for key in graph.keys():
    graph[key].sort()

def DFS(graph, node, visited=[]):
    visited.append(node)
    print(node, end=' ')
    for child in graph[node]:
        if not child in visited:
            DFS(graph, child, visited)

def BFS(graph, node):
    visited = [node]
    queue = deque(visited)
    while queue:
        vertex = queue.popleft()
        print(vertex, end=' ')
        for i in graph[vertex]:
            if not i in visited:
                visited.append(i)
                queue.append(i)

if V in graph.keys():
    DFS(graph, V)
    print("")
    BFS(graph, V)
else:
    print(V)
    print(V)