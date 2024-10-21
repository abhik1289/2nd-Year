#include <stdio.h>
#include <stdlib.h>

struct node
{
    struct node *left;
    int data;
    struct node *right;
};

struct node *create()
{
    int x;
    struct node *p;
    printf("Enter node value (-1 for null): ");
    scanf("%d", &x);
    if (x == -1)
        return NULL;
    else
    {
        p = (struct node *)malloc(sizeof(struct node));
        p->data = x;
        p->left = create();
        p->right = create();
    }
    return p;
}

void preOrder(struct node *root)
{
    if (root == NULL)
        return;
    printf("%d ", root->data);
    preOrder(root->left);
    preOrder(root->right);
}

void InOrder(struct node *root)
{
    if (root == NULL)
        return;
    InOrder(root->left);

    printf("%d ", root->data);
    InOrder(root->right);
}

void postOrder(struct node *root)
{
    if (root == NULL)
        return;
    postOrder(root->left);
    postOrder(root->right);
    printf("%d ", root->data);
}

int main()
{
    struct node *root;
    root = create();
    printf("Pre-order Traversal:\n");
    preOrder(root);
    printf("\n");

    printf("In-order Traversal:\n");
    InOrder(root);
    printf("\n");

    printf("Post-order Traversal:\n");
    postOrder(root);
    printf("\n");

    return 0;
}