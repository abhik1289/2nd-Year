#include <stdio.h>
#include <stdlib.h>

#define MAX 10
int cq[MAX];
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
    if ((f == (r + 1)) || (f == 0 && r == MAX - 1))
    {
        printf("Circular queue is overflow");
    }
    else
    {
        if (f == -1)
        {
            f = 0;
        }
        r = (r + 1) % MAX;
        printf("Enter element: ");
        scanf("%d", &e);
        cq[r] = e;
    }
}

void delete()
{
    if (f == -1)
    {
        printf("Circular queue is underflow");
    }
    else
    {
        printf("The deleted element is %d \n", cq[f]);
        if (f == r)
        {
            f = r = -1;
        }
        else
        {
            f = (f + 1) % MAX;
        }
    }
}

void display()
{
    int i;
    if (f == -1)
    {
        printf("Circular queue is underflow");
    }
    else
    {
        if (f <= r)
        {
            for (int i = f; i <= r; i++)
            {
                printf("%d ", cq[i]);
            }
        }
        else
        {
            for (int i = f; i < MAX; i++)
            {
                printf("%d ", cq[i]);
            }
            for (int i = 0; i <= r; i++)
            {
                printf("%d ", cq[i]);
            }
        }
    }
}
