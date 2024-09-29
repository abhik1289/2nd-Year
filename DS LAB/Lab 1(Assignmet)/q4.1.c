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

    // Input for first complex number
    printf("Enter the real and imaginary part of first complex number:\n");
    scanf("%f %f", &c1.real, &c1.imag);

    // Input for second complex number
    printf("Enter the real and imaginary part of second complex number:\n");
    scanf("%f %f", &c2.real, &c2.imag);

    while (1)
    {
        // Display the menu
        printf("\nMenu:\n");
        printf("1. Add two complex numbers\n");
        printf("2. Multiply two complex numbers\n");
        printf("3. Exit\n");
        printf("Enter your choice: ");
        scanf("%d", &choice);

        switch (choice)
        {
        case 1:
            // Addition of two complex numbers
            result = addComplex(c1, c2);
            printf("Sum = %.2f + %.2fi\n", result.real, result.imag);
            break;

        case 2:
            // Multiplication of two complex numbers
            multiplyComplex(&c1, &c2, &result);
            printf("Product = %.2f + %.2fi\n", result.real, result.imag);
            break;

        case 3:
            // Exit the program
            exit(0);

        default:
            // Handle invalid choices
            printf("Invalid choice. Please try again.\n");
            break;
        }
    }

    return 0;
}
