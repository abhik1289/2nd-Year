#include <stdio.h>


void main(){
    int n;
    printf("Enter how many numbers you want to read from file: ");
    scanf("%d",&n);
    int arr[n];
    for(int i=0;i<n;++i){
        arr[i] = scanf("%d",arr[0]);
    }
    
}