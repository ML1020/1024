import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] array = {1,2,3,4};
        //把数组转成字符串后，方便打印
        //预期打印结果：[1,2,3,4]
        //System.out.println(arrToString(array));
        System.out.println(Arrays.toString(array));
        System.out.println("===");
//        int[] result = copy(array);
//        for (int x : result) {
//            System.out.println(x+"");
//        }
        int[] result = Arrays.copyOf(array,5);
        System.out.println(Arrays.toString(result));
    }

    public static String arrToString(int[] array){
        String result = "[";
        for (int i = 0;i < array.length;i++){
            result += array[i];
            if (i != array.length-1){
                result += ",";
            }
        }
        result += "]";
        return result;
    }

    public static int[] copy(int[] array){
        int[] result = new int[array.length];
        for (int i = 0;i < array.length;i++){
            result[i] = array[i];
        }
        return result;
    }
}