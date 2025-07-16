#include <stdio.h>

int main() {
    FILE *fp;
    int n;

    printf("Enter how many numbers you want to read from file: ");
    scanf("%d", &n);

    int arr[n];


    fp = fopen("numbers.txt", "r");
    if (fp == NULL) {
        printf("Error opening file!\n");
        return 1;
    }

    for (int i = 0; i < n; i++) {
        fscanf(fp, "%d", &arr[i]);
    }

    fclose(fp);

    printf("The content of the array: ");
    for (int i = 0; i < n; i++) {
        printf("%d ", arr[i]);
    }
    printf("\n");

    
    int duplicateCount = 0;

    for (int i = 0; i < n; i++) {
        int count = 0;

        for (int j = i + 1; j < n; j++) {
            if (arr[i] == arr[j]) {
                count++;
                break; 
            }
        }

    
        int isCounted = 0;
        for (int k = 0; k < i; k++) {
            if (arr[k] == arr[i]) {
                isCounted = 1;
                break;
            }
        }

        if (count > 0 && !isCounted) {
            duplicateCount++;
        }
    }

    printf("Total number of duplicate values = %d\n", duplicateCount);

    int maxCount = 0, mostFrequent = arr[0];

    for (int i = 0; i < n; i++) {
        int count = 1;
        for (int j = i + 1; j < n; j++) {
            if (arr[i] == arr[j]) {
                count++;
            }
        }

        if (count > maxCount) {
            maxCount = count;
            mostFrequent = arr[i];
        }
    }

    printf("The most repeating element in the array = %d\n", mostFrequent);

    return 0;
}