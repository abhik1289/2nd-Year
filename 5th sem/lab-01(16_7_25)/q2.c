#include <stdio.h> 


int main()
{
    int arr[5] = {3,4,5,1,2};
    int sum[5];

    for(int i=0;i<5;++i){
       if(i==0){
        sum[0] = arr[0];
       }else{
        sum[i]= sum[i-1]+arr[i];
       }
    }

    for(int i=0;i<5;++i){
        printf("%d ",sum[i]);
    }

    return 0;
}