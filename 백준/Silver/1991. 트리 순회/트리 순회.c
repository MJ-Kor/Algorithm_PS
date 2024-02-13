//트리 순회

#include <stdio.h>

typedef struct node {
	char data;
	struct node* left;
	struct node* right;
}Node;

Node* parent, * leftchild, * rightchild;
Node* Headnode, * Endnode = NULL;

void maketree(int);
void MidRecursive_Traverse(Node*);
void AftRecursive_Traverse(Node*);
void BefRecursive_Traverse(Node*);
void Visit(Node*);
void InitializeTree(void);

void InitializeTree(void)
{
	Headnode = (Node*)malloc(sizeof(Node));
	Endnode = (Node*)malloc(sizeof(Node));

	Headnode->left = Endnode;
	Headnode->right = Endnode;
	Endnode->left = Endnode;
	Endnode->right = Endnode;
}

int main(void)
{
	int num;
	scanf("%d", &num);
	getchar();
	maketree(num);
	BefRecursive_Traverse(Headnode);
	printf("\n");
	MidRecursive_Traverse(Headnode);
	printf("\n");
	AftRecursive_Traverse(Headnode);
	printf("\n");

}

void maketree(int num)
{
	char tree[4];
	Node** arr = (Node**)malloc(sizeof(Node*) * num), ** temp;
	int k = 0;
	for (int i = 0; i < num; i++)
	{
		scanf("%c %c %c", &tree[0], &tree[1], &tree[2]);
		getchar();
		
		if (i == 0)
		{
			parent = (Node*)malloc(sizeof(Node));
			Headnode = parent;
			leftchild= (Node*)malloc(sizeof(Node));
			rightchild= (Node*)malloc(sizeof(Node));
			parent->data = tree[0];
			arr[k] = parent;
			++k;
			if (tree[1] != '.')
			{
				parent->left = leftchild;
				leftchild->data = tree[1];
				arr[k] = leftchild;
				++k;
			}
			else
				parent->left = Endnode;

			if (tree[2] != '.')
			{
				parent->right = rightchild;
				rightchild->data = tree[2];
				arr[k] = rightchild;
				++k;
			}
			else
				parent->right = Endnode;
		}
		else
		{
			int m = i;
			while (arr[m]->data != tree[0])
				++m;
			temp = arr[i];
			arr[i] = arr[m];
			arr[m] = temp;
			parent = arr[i];
			leftchild = (Node*)malloc(sizeof(Node));
			rightchild = (Node*)malloc(sizeof(Node));
			if (tree[1] != '.')
			{
				parent->left = leftchild;
				leftchild->data = tree[1];
				arr[k] = leftchild;
				++k;
			}
			else
				parent->left = Endnode;
			if (tree[2] != '.')
			{
				parent->right = rightchild;
				rightchild->data = tree[2];
				arr[k] = rightchild;
				++k;
			}
			else
				parent->right = Endnode;
		}

	}
}

void MidRecursive_Traverse(Node* ptrNode)
{
	// 재귀를 이용한 중위 순회 트리

	if (ptrNode != Endnode)
	{
		MidRecursive_Traverse(ptrNode->left);
		Visit(ptrNode);
		MidRecursive_Traverse(ptrNode->right);
	}
}

void AftRecursive_Traverse(Node* ptrNode)
{
	// 재귀를 이용한 후위 순회 트리

	if (ptrNode != Endnode)
	{
		AftRecursive_Traverse(ptrNode->left);
		AftRecursive_Traverse(ptrNode->right);
		Visit(ptrNode);
	}
}

void BefRecursive_Traverse(Node* ptrNode)
{
	// 재귀를 이용한 전위 순회 트리

	if (ptrNode != Endnode)
	{
		Visit(ptrNode);
		BefRecursive_Traverse(ptrNode->left);
		BefRecursive_Traverse(ptrNode->right);
	}
}

void Visit(Node* ptrNode)
{
	printf("%c", ptrNode->data);
}