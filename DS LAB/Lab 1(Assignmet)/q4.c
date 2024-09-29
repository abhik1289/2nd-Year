#include <stdio.h>
#include <stdlib.h>

struct Complex
{
    float real;
    float imag;
};

struct Complex addComplex(struct Complex c1, struct Complex c2)
{
    struct Complex result;
    result.real = c1.real + c2.real;
    result.imag = c1.imag + c2.imag;
    return result;
}

void multiplyComplex(struct Complex *c1, struct Complex *c2, struct Complex *result)
{
    result->real = (c1->real * c2->real) - (c1->imag * c2->imag);
    result->imag = (c1->real * c2->imag) + (c1->imag * c2->real);
}

int main()
{
    struct Complex c1, c2, result;
    int choice;

    
    printf("Enter the real and imaginary of 1st number:\n");
    scanf("%f %f", &c1.real, &c1.imag);

    
    printf("Enter the real and imaginary of 2nd number:\n");
    scanf("%f %f", &c2.real, &c2.imag);

    
    printf("\nMenu:\n");
    printf("1. Add two complex numbers\n");
    printf("2. Multiply two complex numbers\n");

    printf("Enter your choice: ");
    scanf("%d", &choice);

    switch (choice)
    {
    case 1:
        
        result = addComplex(c1, c2);
        printf("Sum = %.2f + %.2fi\n", result.real, result.imag);
        break;

    case 2:
    
        multiplyComplex(&c1, &c2, &result);
        printf("Product = %.2f + %.2fi\n", result.real, result.imag);
        break;

 
    default:

        printf("Invalid choice. Please try again.\n");
        break;
    }

    return 0;
}
