#include <stdio.h>
#include <stdlib.h>

#define MAX 10

int top = -1;
int stack[MAX];
void push();
void pop();
void display();

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
            push();
            break;
        case 2:
            pop();
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

void push()
{
    int e;
    if (top == MAX - 1)
    {
        printf("Stack overflow");
    }
    else
    {
        printf("Enter a number: ");
        scanf("%d", &e);
        top = top + 1;
        stack[top] = e;
    }
}
void pop()
{
    if (top == -1)
    {
        printf("Stack underflow");
    }
    else
    {
        printf("The popped element is %d", stack[top]);
        top = top - 1;
    }
}
void display()
{
    int i;
    for (int i = top; i >= 0; i--)
    {
        printf("%d ", stack[i]);
    }
}