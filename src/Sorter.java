import java.lang.reflect.Array;

public class Sorter {
    public static void main(String[] args) throws Exception {
        int[] array = {1,3,42,5,1,5,66,2,234,1,0};
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("---------------------------");
        selectionSort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
    public static void selectionSort(int[] arr){  
        for (int i = 0; i < arr.length - 1; i++){  
            int index = i;   
            for (int j = i + 1; j < arr.length; j++){  
                if (arr[j] < arr[index]){  
                    index = j;  
                }  
            }  
            int smallerNumber = arr[index];   
            arr[index] = arr[i];  
            arr[i] = smallerNumber;  
        }  
    }  
}
