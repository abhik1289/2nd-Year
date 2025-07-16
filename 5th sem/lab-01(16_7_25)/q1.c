
#include <stdio.h>

int main()
{
    int arr[5]= {12,94,8,21,90};

    
    int l=-9999,s=10000;
    for(int i=0;i<5;++i){
        if(arr[i] > l){
           l = arr[i];
        }
        if(arr[i]<s){
            s = arr[i];
        }
        
    }
    
    
    int l2=-9999,s2=10000;
    
    
    for(int i=0;i<5;++i){

        if(arr[i] < l && arr[i] > l2){
            l2 = arr[i];
        }
         
        if(arr[i] > s && arr[i] < s2){
            s2 = arr[i];
        }
    }

    printf("%d %d",l2,s2);

    return 0;
}

   
