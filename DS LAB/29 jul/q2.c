#include <stdio.h>

int main()
{
    int arr[10], i;
    printf("Enter the elements at last: \n");
   
        scanf("%d", &arr[9]);
  
    printf("The elements are \n ");
    for (i = 0; i < 9; i++)
    {
        printf(" %d ", arr[i]);
    }
    return 0;
}
