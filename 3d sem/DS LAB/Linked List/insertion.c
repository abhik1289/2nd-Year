
#include <stdio.h>
#include <stdlib.h>
struct node
{
    int data;
    struct node *next;
};
struct node *head = NULL, *last = NULL;

void insertStart(int val)
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
        temp->next = head;
        head = temp;
    }
}
void insertLast(int val)
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
void insertAnyPosition(int val, int pos)
{
    struct node *temp, *p;
    temp = (struct node *)malloc(sizeof(struct node));
    temp->data = val;
    temp->next = NULL;
    p = head;
    for (int i = 1; i < pos - 1; i++)
    {
        p = p->next;
    }
    temp->next = p->next;
    p->next = temp;
}

int main()
{
    insertStart(10);
    insertLast(20);
    insertLast(30);
    insertAnyPosition(50,2);
    display();
    return 0;
}
