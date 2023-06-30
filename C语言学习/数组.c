#include <stdio.h>

int main() {
    int i;
    int l=0;
    scanf("%d",&i);
    int a[i];
    for(int j=0;j<i;j++){
        scanf("%d",&a[j]);
    }
    for(int k=0;k<i;k++){
        if(a[k]==2){
            l++;
        }
    }
    printf("%d\n",l);
    return 0;
}
