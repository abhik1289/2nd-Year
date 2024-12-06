#include <stdio.h>

int main()
{
    int a[10];
    int i;
    for (i = 8; i >= 0; i--)
    {
        a[i + 1] = a[i];
    }
    i = 0;
    scanf("%d", &a[i]);
    printf("The input values are:\n");
    for (int i = 0; i < 10; i++)
    {
        printf("%d\t", a[i]);
    }

    return 0;
}
