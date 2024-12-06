#include <stdio.h>
#include <stdlib.h>

#define MAX 10
int q[MAX];
void insert();
void delete();
void display();
int f = -1, r = -1;

int main()
{
    int choice;
    while (1)
    {
        printf("1. Push \n");
        printf("2. Pop  \n");
        printf("3. Display  \n");
        printf("4. quit  \n");
        printf("Enter your choice:\n");
        scanf("%d", &choice);
        switch (choice)
        {

        case 1:
            insert();
            break;
        case 2:
            delete ();
            break;
        case 3:
            display();
            break;
        case 4:
            exit(0);
            break;
        default:
            printf("Invalid choice");
        }
    }
    return 0;
}

void insert()
{
    int e;
    if (r == MAX - 1)
    {
        printf("Queue is overflow");
    }
    else
    {
        printf("Enter an element: ");
        scanf("%d", &e);
        // stack is empty
        if (f == -1)
            f = 0;
        r = r + 1;
        q[r] = e;
    }
}
void delete()
{
    if (f == -1)
    {
        printf("Queue is underflow");
    }
    else if (f == r)
    {
        printf("The deleted element is %d \n", q[f]);
        f = r = -1;
    }
    else
    {
        printf("The deleted element is %d \n", q[f]);
        f = f + 1;
    }
}
void display()
{
    if (f == -1)
    {
        printf("Queue is underflow\n");
    }
    // int i;
    for (int i = f; i <= r; i++)
    {
        printf("%d ", q[i]);
    }
    printf("\n");
}