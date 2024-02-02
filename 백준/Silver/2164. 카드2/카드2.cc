#include <iostream>
#include <queue>
#include <string>
using namespace std;

int main()
{
	queue<int> qu;
	int n, temp;
	cin >> n;
	for (int i = 1; i <= n; i++)
	{
		qu.push(i);
	}
	while (qu.size() != 1)
	{
		qu.pop();
		temp = qu.front();
		qu.pop();
		qu.push(temp);
	}
	cout << qu.front();
	return 0;
}