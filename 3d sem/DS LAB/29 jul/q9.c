#include <stdio.h>

int main() {
    int matrix[5][5];
    int transpose[5][5];
    int result[5][5];

    
    printf("Enter 25 elements for the 5x5 matrix:\n");
    for (int i = 0; i < 5; i++) {
        for (int j = 0; j < 5; j++) {
            scanf("%d", &matrix[i][j]);
        }
    }

    
    for (int i = 0; i < 5; i++) {
        for (int j = 0; j < 5; j++) {
            transpose[i][j] = matrix[j][i];
        }
    }


    for (int i = 0; i < 5; i++) {
        for (int j = 0; j < 5; j++) {
            result[i][j] = matrix[i][j] + transpose[i][j];
        }
    }

    
    printf("Resulting Matrix (Matrix + Transpose):\n");
    for (int i = 0; i < 5; i++) {
        for (int j = 0; j < 5; j++) {
            printf("%d ", result[i][j]);
        }
        printf("\n");
    }

    return 0;
}
