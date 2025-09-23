import java.util.Scanner;
public class LinearSearchRunTimeDuplicateBoolean{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the array");
        for (int i = 0; i < n; i++) {
           arr[i] = sc.nextInt();
        }
          System.out.println("Enter the key");
          int key = sc.nextInt();
          boolean position = false;
          for(int i=0;i<arr.length;i++){
              if(arr[i] == key){
               System.out.println(i);
                  position= true;
              }
          }
              if(position == false){
                  System.out.println("Element not Found");
              }
              else{
                  System.out.println("Found at index" +position);
              }
          }
    } 