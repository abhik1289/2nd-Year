#include <stdio.h>
#include <stdlib.h>
struct node
{
    int data;
    struct node *next;
};
struct node *head = NULL, *last = NULL;
void create(int val)
{
    struct node *temp;
    temp = (struct node *)malloc(sizeof(struct node));
    temp->data = val;
    temp->next = NULL;
    if (head == NULL)
    {
        head = temp;
        last = temp;
    }
    else
    {
        last->next = temp;
        last = temp;
    }
}

void display()
{
    struct node *p;
    p = head;
    while (p != NULL)
    {
        printf("%d ", p->data);
        p = p->next;
    }
}

int main()
{

    int n, e;
    printf("How many nodes you want to create: ");
    scanf("%d", &n);

    for (int i = 0; i < n; i++)
    {
        printf("Enter the value: ");
        scanf("%d", &e);
        create(e);
    }
    display();
}
