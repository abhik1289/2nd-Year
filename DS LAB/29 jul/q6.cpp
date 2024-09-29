#include <stdio.h>

int main() {
    int matrix1[5][5], matrix2[5][5], result[5][5];

   
    printf("Enter elements of the first 5x5 matrix:\n");
    for(int i = 0; i < 5; i++) {
        for(int j = 0; j < 5; j++) {
            printf("Element at [%d][%d]: ", i, j);
            scanf("%d", &matrix1[i][j]);
        }
    }

 
    printf("\nEnter elements of the second 5x5 matrix:\n");
    for(int i = 0; i < 5; i++) {
        for(int j = 0; j < 5; j++) {
            printf("Element at [%d][%d]: ", i, j);
            scanf("%d", &matrix2[i][j]);
        }
    }

   
    for(int i = 0; i < 5; i++) {
        for(int j = 0; j < 5; j++) {
            result[i][j] = matrix1[i][j] + matrix2[i][j];
        }
    }


    return 0;
}
