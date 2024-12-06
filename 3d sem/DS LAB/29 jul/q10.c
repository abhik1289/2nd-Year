#include <stdio.h>

int main()
{
    int a[3][3], i, j;

    printf("Enter a matrix \n");
    for (int i = 0; i < 3; i++)
    {
        for (int j = 0; j < 3; j++)
        {
            scanf("%d", &a[i][j]);
        }
    }
    printf("The spare matrix is\n");
    printf("Row\t col \t val\n");
    for (int i = 0; i < 3; i++)
    {
        for (int j = 0; j < 3; j++)
        {
            if (a[i][j] != 0)
            {
                printf("%d\t%d\t%d\n", i + 1, j + 1, a[i][j]);
            }
        }
    }
}