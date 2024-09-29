#include <stdio.h>

int main()
{
    int arr[10], i;
    printf("Enter the elements at last: \n");

    for (i = 8; i > 4; i--)
    {
        arr[i + 1] = arr[i];
        printf("Enter the value: \n");
        scanf("%d", &arr[i]);
    }

    printf("The elements are \n ");
    for (i = 0; i < 10; i++)
    {
        printf(" %d ", arr[i]);
    }
    return 0;
}
