#include <stdio.h>
int main()
{
int a[5][5], b[5][5], c[5][5], i, j, k;
printf("\nEnter the 1st matrix\n");
for(i=0;i<5;i++)
{
	for(j=0;j<5;j++)
	{
		printf("Element [%d][%d]: ",i,j);
		scanf("%d",&a[i][j]);
	}
}
printf("\nEnter the 2nd matrix\n");
for(i=0;i<5;i++)
{
	for(j=0;j<5;j++)
	{
		printf("Element [%d][%d]: ",i,j);
		scanf("%d",&b[i][j]);
	}
}
for(i=0;i<5;i++)
{
	for(j=0;j<5;j++)
	{
		c[i][j]=0;
		for(k=0;k<5;k++)
		{
			c[i][j]+=a[i][k]*b[k][j];
	    }
	}
}
printf("\nResultant matrix on multiplication is:\n");
for(i=0;i<5;i++)
{
	for(j=0;j<5;j++)
	{
		printf("%d\t",c[i][j]);
	}
	printf("\n");
}
}