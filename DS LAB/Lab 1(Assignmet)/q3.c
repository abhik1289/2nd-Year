#include <stdio.h>

struct Employee
{
    char name[20];
    char designation[20];
    int salary;
    int hra;
    int da;
};

int main()
{
    int n;
    printf("How many employees data you want to store: \n");
    scanf("%d", &n);
    struct Employee em[n];

    for (int i = 0; i < n; i++)
    {
        printf("Enter %d Information\n", i + 1);
        printf("Name: ");
        scanf("\n%s", &em[i].name);
        printf("Designation: ");
        scanf("\n%s", &em[i].designation);
        printf("Salary: ");
        scanf("\n%d", &em[i].salary);
        printf("HRA: ");
        scanf("\n%d", &em[i].hra);
        printf("DA: ");
        scanf("\n%d", &em[i].da);
    }
    printf("Employee Information: \n");
    for (int i = 0; i < n; i++)
    {
        printf("Enter %d Information", i + 1);
        printf("Name: %s\n", em[i].name);
        printf("Designation: %s\n", em[i].designation);
        printf("Basic Salary: %d\n", em[i].salary);
        // scanf("\n%d", &em[i].hra);
        printf("HRA: %d \n", em[i].hra);
        printf("DA: %d \n", em[i].da);
        int grossSalary = em[i].salary + ((em[i].salary / 100)*em[i].da);
        printf("Gross Salary: %d", grossSalary);
    }
    return 0;
}