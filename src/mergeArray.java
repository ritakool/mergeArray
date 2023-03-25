import java.util.Arrays;

public class mergeArray {
    public static int[] merge(int[] Array1,int[] Array2){
        int[] newArray = new int[Array1.length + Array2.length];
        for (int i = 0; i < Array1.length; i++){
            newArray[i] = Array1[i];
        }
        for (int j = 0, k = Array1.length; j < Array2.length; j++){
            newArray[k] = Array2[j];
            k++;
        }
        return newArray;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6};
        int[] arr2 = {6, 5, 4, 3, 2, 1, 0};
        int[] arr3;
        arr3 = merge(arr1, arr2);
        System.out.println("mang moi la : " + Arrays.toString(arr3));
    }
}
