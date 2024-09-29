#include <stdio.h>
#include <stdlib.h>
int isPrime(int n)
{
    for (int i = 2; i < n; i++)
    {
        if (n % i == 0)
        {
            return 0;
        }
    }
    return 1;
}
int main()
{
    int *p, n;
    printf("Enter the array size: ");
    scanf("%d", &n);
    p = (int *)malloc(n * sizeof(int));
    for (int i = 0; i < n; i++)
    {
        printf("Index of %d ", i);
        scanf("%d", (p + i));
    }
    int sum = 0;
    for (int i = 0; i < n; i++)
    {
        if (isPrime(*(p + i)) == 1)
        {
            sum += *(p + i);
        }
    }
    printf("The Answer is: %d", sum);
    free(p);
    return 0;
}