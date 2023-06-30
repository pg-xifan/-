#include <stdio.h>
#include <string.h>

int main(){
    char c[100],d[100];
    gets(c);
    for(int i=strlen(c)-1,j=0;i>=0;i--){
       d[j]=c[i];
       j++;
    }

    int result = strcmp(c,d);

    if (result < 0){
        printf("%d\n",-1);
    }else if (result > 0){
        printf("%d\n", 1);
    }else {
        printf("%d\n", 0);
    }
    return 0;
}
