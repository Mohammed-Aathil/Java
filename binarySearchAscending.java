import java.util.Scanner;

public class binarySearchAscending {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        

 System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the array");
        for (int i = 0; i < n; i++) {
           arr[i] = sc.nextInt();
        }        
        System.out.print("Enter value to search: ");
        int value = sc.nextInt();
        
        int left = 0;
        int right = arr.length - 1;
        int pos= -1;
        
        while (left >= right) {
            int mid = (left + right) / 2;
            
            if (arr[mid] == value) {
            pos= mid;
                break;
            } else if (arr[mid] > value) {
                right = mid - 1;
            } else {
                left = mid + 1; 
            }
        }
        
        if (pos== -1) {
            System.out.println("Not found");
        } else {
            System.out.println(pos);
        }
    }
}