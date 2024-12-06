#include <stdio.h>

int main()
{
    int n;
    printf("Enter No of elements you want to store: ");
    scanf("%d", &n);
    int arr[n];

    for (int i = 0; i < n; i++)
    {
        printf("Enter element %d: ", i + 1);
        scanf("%d", &arr[i]);
    }

    for (int i = 0; i < n; i++)
    {
        for (int j = i + 1; j < n; j++)
        {
            if (arr[i] > arr[j])
            {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
    }
    printf("After sorting: ");
    for (int i = 0; i < n; i++)
    {
        printf("%d ", arr[i]);
    }
    printf("\nYou want to find: ");
    int ele;
    scanf("%d", &ele);
    int start = 0;
    int end = n - 1;
    int mid = (start + end) / 2;
    int index = -1;
    while (start <= end)
    {
        if (arr[mid] == ele)
        {
            index = mid;
            break;
        }
        else if (arr[mid] < ele)
            start = mid + 1;
        else
            end = mid - 1;
        mid = (start + end) / 2;
    }
    if (index == -1)
        printf("Element not found");
    else
        printf("Index of %d is %d", ele, index);
    
}