import java.util.Arrays;
import java.util.Scanner;

public class InsertElementintoArray {
    public static int[] insert(int[] array, int x, int n){
        int[] arr = new int[array.length + 1];
        for (int i = 0, j = 0; i < array.length; i++){
            if (i == x){
                arr [j] = n;
                j++;
            }
            arr[j] = array[i];
            j++;
        }
        return arr;
    }
    public static int[] Insert(int[] array, int x, int n){
        int temp = array[x];
        array[x] = n;
        for (int i =x + 1 ; i < array.length; i++ ){
            int temp2 = array[i];
            array[i] = temp;
            temp = temp2;
        }
        array[x] = n;
        return array;
    }
    public static void main(String[] args) {
        int[] array = {1,2,4,5,6,0,0};
        int index;
        int n;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Nhap phan tu ban muon chen vao mang: ");
            n = sc.nextInt();
            System.out.println();
            System.out.print("Nhap vi tri ban muon chen: ");
            index = sc.nextInt();
            System.out.println();
            if (index < -1 || index > array.length){
                System.out.println("Vi tri khong hop le!");
            }
        }while (index < -1 || index > array.length);
        int[] arr;
        arr = Insert(array,index,n);
        System.out.println("Mang sau khi chen la: " + Arrays.toString(arr));
    }
}
