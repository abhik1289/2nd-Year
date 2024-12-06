#include <stdio.h>

int main() {
    int matrix[5][5];
    int transpose[5][5];

    printf("Enter the elements of the 5x5 matrix:\n");
    for(int i = 0; i < 5; i++) {
        for(int j = 0; j < 5; j++) {
            printf("Element [%d][%d]: ", i + 1, j + 1);
            scanf("%d", &matrix[i][j]);
        }
    }


    for(int i = 0; i < 5; i++) {
        for(int j = 0; j < 5; j++) {
            transpose[j][i] = matrix[i][j];
        }
    }

 
    printf("\nTransposed Matrix:\n");
    for(int i = 0; i < 5; i++) {
        for(int j = 0; j < 5; j++) {
            printf("%d ", transpose[i][j]);
        }
        printf("\n");
    }

    return 0;
}
