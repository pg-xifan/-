#include <stdio.h>
#include <stdlib.h>

int main(){
    int i;
    scanf("%d",&i);
    char *p;
    char c[1];
    p=(char *)malloc(i);
    scanf("%c",&c);
    gets(p);//可以使用fgets，gets会访问越界。
    puts(p);
    return 0;
}


