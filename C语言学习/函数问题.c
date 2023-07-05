#include <stdio.h>

int step(n){
    if(n==2 || n==1){
        return n;
    }
    return step(n-1)+step(n-2);
}
int main() {
    int i;
    scanf("%d",&i);
    printf("%d",step(i));
    return 0;
}
