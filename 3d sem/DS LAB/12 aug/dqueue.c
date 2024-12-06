#include<stdio.h>
#include<stdlib.h>
#define MAX 10
int left=-1,right=-1;
int dq[MAX];
void input_restricted();
void output_restricted();
void insert_left();
void insert_right();
void delete_left();
void delete_right();
void display();
int main()
{
    int ch;
    while(1)
    {
        printf("1:input_restricted\n");
        printf("2:output_restricted\n");
        printf("Enter a choice:\n");
        scanf("%d",&ch);
        switch(ch)
        {
            case 1:input_restricted();
            break;
            case 2:output_restricted();
            break;
            default:printf("Wrong choice\n");
            break;
        }
    }
}
void input_restricted()
{
    int c1;
    while(1)
    {
        printf("1:Insert in the right side\n");
        printf("2:Deletion from the right side\n");
        printf("3:Deletion from the left side\n");
        printf("4:Display\n");
        printf("5:Quit\n");
        printf("Enter a choice\n");
        scanf("%d",&c1);
        switch(c1)
        {
            case 1:insert_right();
            break;
            case 2:delete_right();
            break;
            case 3:delete_left();
            break;
            case 4:display();
            break;
            case 5:exit(0);
            break;
            default:printf("Wrong choice\n");
        }
    }
}void output_restricted()
{
    int c2;
    while(1)
    {
        printf("1:Insert in the right side\n");
        printf("2:Insert from the left side\n");
        printf("3:Deletion from the left side\n");
        printf("4:Display\n");
        printf("5:Quit\n");
        printf("Enter a choice\n");
        scanf("%d",&c2);
        switch(c2)
        {
            case 1:insert_right();
            break;
            case 2:insert_left();
            break;
            case 3:delete_left();
            break;
            case 4:display();
            break;
            case 5:exit(0);
            break;
            default:printf("Wrong choice\n");
        }
    }
}
void insert_right()
{
    int x;
    if(left==(right+1)%MAX)
    {
        printf("Dequeue is Overflow\n");
    }
    else
    {
        printf("Enter a Number:\t");
        scanf("%d",&x);
        if(left==-1)
        {
            left=0;
        }
        right=(right+1)%MAX;
        dq[right]=x;
    }
}
void insert_left()
{
    int x;
    if(left==(right+1)%MAX)
    {
        printf("Dequeue is Overflow\n");
    }
    else
    {
        printf("Enter a Number:\t");
        scanf("%d",&x);
        if(right==-1)
        {
            left=right=0;
            dq[left]=x;
        }
        if(right!=-1)
        {
            left=(left-1)%MAX;
            dq[left]=x;
        }
    }
}
void delete_left()
{
    int x;
    if(left==-1)
    {
        printf("Dequeue is Underflow\n");
    }
    else
    {
        printf("The Deleted Element is: %d\n",dq[left]);
        if(left==right)
        {
            left=right=-1;
        }
        else
        {
            left=(left+1)%MAX;
        }
    }
}
void delete_right()
{
    int x;
    if(left==-1)
    {
        printf("Dequeue is Underflow\n");
    }
    else
    {
        printf("The Deleted Element is: %d\n",dq[right]);
        if(left==right)
        {
            left=right=-1;
        }
        else
        {
            right=(right-1)%MAX;
        }
    }    
}
void display()
{
    int i;
    if(left==-1)
    {
        printf("The Dequeue is Underflow\n");
    }
    else
    {
     if(left<right)
     {
        for(i=left;i<=right;i++)
        {
            printf("%d\t",dq[i]);
        }
     }
     else
     {
        for(i=left;i<MAX;i++)
        {
            printf("%d\t",dq[i]);
        }
         for(i=0;i<=right;i++)
        {
            printf("%d\t",dq[i]);
        }
     }
    }
}