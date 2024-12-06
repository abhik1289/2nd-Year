#include <stdio.h>

struct node
{
    int data;
    struct node *next;
};

struct node *head = NULL, *last = NULL;

void create(int m);

int main()
{

    int n, m;

    printf("Enter the number of nodes you want to  create: ");
    for (int i = 0; i < n; i++)
    {
        printf("Enter values: ");
        scanf("%d", &m);
        create(m);
    }

    return 0;
}
void create(int val){
    struct node *temp;
    temp = (struct node*) malloc(sizeof(struct node));
    
}