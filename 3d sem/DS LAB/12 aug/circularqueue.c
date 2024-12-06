#include<stdio.h>
#include<stdlib.h>
#define MAX 10
int f=-1,r=-1;
int cq[MAX];
void insert();
void pop();
void display();
int main()
{
    int choice;
    while(1)
    {
        printf("1:insert\n");
        printf("2:delete\n"); 
        printf("3:display\n");
        printf("4:Quit\n");
        printf("Enter your choice\n");
    scanf("%d",&choice);
    switch(choice)
    {
        case 1:insert();
        break;
        case 2:pop();
        break;
        case 3:display();
        break;
        case 4:exit(0);
        break;
        default:printf("Wrong choice");
        break;
    }
    }
    return 0;
}
void insert()
{
  int e;
  if(f==0 && r==(MAX-1) || (f==(r+1)))  
  {
    printf("Cicular queue Overflow\n");
  }
  else
  {
    if(f==-1)
    {
        f=0;
    }
        r=(r+1)%MAX;
        printf("Enter an element:\n");
        scanf("%d",&e);
        cq[r]=e;
  }
}
void pop()
{
    if(f==-1)
    {
        printf("circular queue is underflow\n");
    }
    else
    {
        printf("The deleted element is %d\n",cq[f]);
        if(f==r)
        {
            f=r=-1;
        }
        else
        {
            f=(f+1)%MAX;
        }
    }
}
void display()
{
    int i;
    if(f==-1)
    {
        printf("Circular queue underflow\n");
    }
    else
    {
        if(f<=r)
        {
            for(i=f;i<=r;i++)
            {
                printf("%d\t",cq[i]);
            }
        }
        else
        {
            for(i=f;i<MAX;i++)
            {
                printf("%d\t",cq[i]);
            }
            for(i=0;i<r;i++)
            {
                printf("%d\t",cq[i]);
            }
        }
    }
}