#include <stdio.h>

int main() {
    int arr[5][5];


    printf("Enter the elements of the 5x5 array:\n");
    for(int i = 0; i < 5; i++) {
        for(int j = 0; j < 5; j++) {
            printf("Element at [%d][%d]: ", i, j);
            scanf("%d", &arr[i][j]);
        }
    }

   

    return 0;
}
