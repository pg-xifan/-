Description

输入N个数（N小于等于100），输出数字2的出现次数；

解题提示：

整型数组读取5个整型数的方法如下：

int a[100];

for(int i=0;i<5;i++)

{

scanf("%d",&a[i]);

}

完成作业的同学，可以购买《跟龙哥学C语言编程》，有很多课后习题可以练习，附带答案，或者直接B站搜王道论坛，看王道的数据结构，组成原理。

Input
输入的格式是两行

第一行输入要输的元素个数，比如5

第二行输入  1 2 2 3 2，那么输出结果为3，因为2出现了3次


Output
统计数字2出现的次数


Sample Input 1 

5
1 2 2 3 2
Sample Output 1

3


#include <stdio.h>

int main() {
    int i;//数组长度
    int l=0;//2的个数
    scanf("%d",&i);
    int a[i];
    //循环接收数组
    for(int j=0;j<i;j++){
        scanf("%d",&a[j]);
    }
    //循环扫描数组中的2
    for(int k=0;k<i;k++){
        if(a[k]==2){
            l++;
        }
    }
    printf("%d\n",l);
    return 0;
}
