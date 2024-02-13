#include <stdio.h>

int main(void)
{
	int sugar, ans, five, three, mid;

	scanf("%d", &sugar);

	five = sugar / 5;
	three = sugar / 3;

	for (int i = five; i >= 0; i--)
	{
		mid = sugar - 5 * i;

		if ((mid % 3) == 0)
		{
			ans = i + (mid / 3);
			break;
		}

		if (i == 0);
		{
			if ((sugar % 3) == 0)
			{
				ans = three;
			}
			else
			{
				ans = -1;
			}
		}
	}
	printf("%d", ans);
	return 0;
}