import java.util.Scanner;
import java.util.Arrays;
/*
Second Commit
*/
public class BinarySearch{
    
    public static int bSearch(int[] array, int target, int low, int high){
        if(low > high){
            return -1;
        }
        
        int mid = low + (high - low) / 2;
        
        if(array[mid] == target){
            System.out.println("Binary Search: Low - " + low + ", High - " + high + ", Mid - " + mid);
            return mid;
        }
        
        if(target < array[mid]){
            System.out.println("Binary Search: Low - " + low + ", High - " + high + ", Mid - " + mid);
            return bSearch(array, target, low, mid - 1);
        }
        
        System.out.println("Binary Search: Low - " + low + ", High - " + high + ", Mid - " + mid);
        return bSearch(array, target, mid + 1, high);
    }
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter size of array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        
        for(int i = 0; i < array.length; i++){
            System.out.print("Enter element: ");
            array[i] = scanner.nextInt();
        }

        Arrays.sort(array);
        
        System.out.print("Enter the number you want to find: ");
        int target = scanner.nextInt();
        
        int result = bSearch(array, target, 0, size - 1);
        
        if(result == -1){
            System.out.println("Target Not Found -1");
        } else {
            System.out.println("Target Found. Found the element at index: " + result);
        }

        scanner.close();
        
    }
    
}
