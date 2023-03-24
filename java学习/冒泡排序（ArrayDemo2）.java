package come_08;

//冒泡排序

public class ArrayDemo2 {
    public static void main(String[] args) {

        //定义数组
        int[] arr = {20, 45, 46, 10, 80, 67};
        System.out.println(arrayToString(arr));

        //for循环嵌套进行冒泡，
        // 第一个for表示一共扫描多少次，数组多长就扫描多少。第二个for表示元素与相邻元素进行比较，满足条件就调换位置
        //调换a和b方式：定义一个新的c
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - (i + 1); j++) {
                if (arr[j] > arr[j + 1]) {
                    int c = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = c;
                }
            }
        }

        System.out.println(arrayToString(arr));

    }

    //这段代码可有可无，主要进行规范化修饰
    public static String arrayToString(int[] arr) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                sb.append(arr[i]);
            } else {
                sb.append(arr[i]).append(", ");
            }
        }
        sb.append("]");
        String c = sb.toString();
        return c;
    }
}
