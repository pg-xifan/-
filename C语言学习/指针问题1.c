#include <stdio.h>

void change(b){
    int c;
    c=b/2;
    printf("%d",c);
}

int main() {
    int i;
    scanf("%d",&i);
    change(i);
    return 0;
}
