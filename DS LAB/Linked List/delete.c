#include <stdio.h>
#include <stdlib.h>

struct node
{
    int data;
    struct node *next;
};

struct node *head = NULL, *last = NULL;

void insertLast(int val)
{
    struct node *temp = (struct node *)malloc(sizeof(struct node));
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

void deleteFirst()
{
    struct node *temp;
    if (head == NULL)
    {
        printf("List is empty\n");
        return;
    }
    else
    {
        temp = head;
        head = head->next;
        free(temp);
      
    }
}

void deleteLast()
{
    struct node *temp, *p;
    if (head == NULL)
    {
        printf("List is empty\n");
        return;
    }
   
    else
    {
        p = head;
        while (p->next != last)
        {
            p = p->next;
        }
        temp = last;
        p->next = NULL;
        last = p;
        free(temp);
    }
}

void deleteAnyPosition(int pos)
{
    struct node *temp, *p;
    int i;
   

    
    
    p = head;
    for (i = 1; i < pos - 1 && p != NULL; i++)
    {
        p = p->next;
    }

    

    temp = p->next;
    p->next = temp->next;
   
    free(temp);
}

void display()
{
    struct node *p = head;
 
    while (p != NULL)
    {
        printf("%d -> ", p->data);
        p = p->next;
    }
    
}

int main()
{
    insertLast(10);
    insertLast(20);
    insertLast(30);
    insertLast(40);
    insertLast(50);

    printf("Original list:\n");
    display();

    printf("\nDeleting the first node:\n");
    deleteFirst();
    display();

    printf("\nDeleting the last node:\n");
    deleteLast();
    display();

    printf("\nDeleting node at position 2:\n");
    deleteAnyPosition(2);  
    display();

    printf("\nDeleting node at position 1 (head):\n");
    deleteAnyPosition(1);   
    display();

    return 0;
}
