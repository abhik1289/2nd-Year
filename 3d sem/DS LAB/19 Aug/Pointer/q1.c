#include <stdio.h>

int main()
{

    int x = 25;
    int *ptr = &x;
    int **ptr2 = &ptr;
    printf("The value of x = %d\n", x);
    printf("Address of x is %u\n", ptr);
    printf("Address of PTR is %d", **ptr2);


    return 0;
}