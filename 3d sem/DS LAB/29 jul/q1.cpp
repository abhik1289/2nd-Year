#include <iostream>
using namespace std;

int main()
{
    int arr[10], i;
    printf("Enter 9 elements in  array: ");
    for (i = 0; i < 9; i++)
    {
        scanf("%d", &arr[i]);
    }
    printf("9 elements are \n ");
    for (i = 0; i < 9; i++)
    {
        printf(" %d ", arr[i]);
    }
    return 0;
}
