package come_02;

/*【输入问题】在考试时，有些时候没有给出数据的行数n，对于矩阵，可能行数n和列数m都未给出，本题就是为了训练这类题目的输入。对于给定的一个二维矩阵，请转置后进行输出。

输入描述
对于一个n*m的矩阵，输入有n行，每行是m个以空格分隔的数字。

输出描述
n*m矩阵的转置矩阵。输出m行，每行是n个空格分隔的数据。

样例输入
1 2 3
4 5 6

样例输出
1 4
2 5
3 6
*/


import java.io.*;
import java.util.*;
//矩阵行列转换
public class Test {
    public static void main(String args[]) {
        Scanner cin = new Scanner(System.in);
        //集合嵌套集合
        ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>();

        //while循环接收字符
        while (cin.hasNextLine()) {
            ArrayList<Integer> row = new ArrayList<Integer>();
            String line = cin.nextLine();

            //判断接收长度，为0时输出结果
            if (line.length() > 0) {
                String[] arrLine = line.split(" ");

                //把接收字符串转成整数型存入集合
                for (int i = 0; i < arrLine.length; i++) {
                    row.add(Integer.parseInt(arrLine[i]));
                }
            } else {
                //如果接收为0，则使用for循环嵌套转置矩阵进行输出
                //先循环有几行（i），再循环列数（j），通过get方法获取
                for (int i = 0; i < arr.get(0).size(); i++) {
                    for (int j = 0; j < arr.size(); j++) {
                        System.out.print(arr.get(j).get(i));
                        System.out.print(" ");
                    }
                    System.out.println();
                }
            }

            //把每行接收的集合存入arr集合
            arr.add(row);
        }
    }
}




