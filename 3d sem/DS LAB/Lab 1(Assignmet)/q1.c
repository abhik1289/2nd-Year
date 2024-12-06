#include <stdio.h>

void compare(int *n1, int *n2)
{
    if (*n1 == *n2)
    {
        printf("Both numbers are same");
    }
    else if (*n1 > *n2)
    {
        printf("%d is greater than %d", *n1, *n2);
    }else if(*n2>*n1){
        printf("%d is smaller than %d", *n1, *n2);

    }
};

int main()
{
    int n1, n2;
    printf("Enter 2 numbers: ");
    scanf("%d %d", &n1, &n2);
    compare(&n1, &n2);
}