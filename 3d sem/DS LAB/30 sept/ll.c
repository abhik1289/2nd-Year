#include <stdio.h>
#include <stdlib.h>
struct node
{
    int data;
    struct node *next;
};
struct node *head = NULL, *last = NULL;
int size = 0;
void insertStart()
{
    size++;
    int val;
    printf("Enter value: ");
    scanf("%d", &val);
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
void insertLast()
{
    size++;
    int val;
    printf("Enter value: ");
    scanf("%d", &val);
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
    printf("\n");
}
void insertAnyPosition()
{
    int val, pos;
    printf("Enter value: ");
    scanf("%d", &val);
    printf(" Position: ");
    scanf("%d", &pos);
    if (size < pos)
    {
        printf("Invalid position\n");
        return;
    }
    size++;
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

void deleteFirst()
{
    size--;
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
    size--;
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

void deleteAnyPosition()
{
    int pos;
    printf(" Position: ");
    scanf("%d", &pos);
    if (size < pos)
    {
        printf("Invalid position\n");
        return;
    }
    size--;
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

int main()
{
    int ch;
    //   printf("1. Create a Linked List");

    while (1)
    {
        printf("1. Insert at the beginning\n");
        printf("2. Insert at the end\n");
        printf("3. Insert at the any position\n");
        printf("4. Delete at the beginning\n");
        printf("5. Delete at the end\n");
        printf("6. Delete at the any position\n");
        printf("7. Display Linked List\n");
        printf("size: %d\n",size);
        printf("You Choose: ");
        scanf("%d", &ch);
        switch (ch)
        {
        case 1:
            insertStart();
            break;
        case 2:
            insertLast();
            break;
        case 3:
            insertAnyPosition();
            break;
        case 4:
            deleteFirst();
            break;
        case 5:
            deleteLast();
            break;
        case 6:
            deleteAnyPosition();
            break;
        case 7:
            display();
            break;
        case 8:
            exit(1);
        default:printf("Invalid choose");
            break;
        }
    }
}