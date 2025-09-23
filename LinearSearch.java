import java.util.Scanner;
public class LinearSearch
{
	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int arr[] = {10,30,50,30};
    System.out.println("Enter a number");
    int key = sc.nextInt();
    int position = -1;
    for(int i =0;i<arr.length;i++){
        if(arr[i] == key){
            position = i;
            break;
        }
    }
    if(position == -1){
        System.out.println("Element not Found");
    }
    else{
        System.out.println("Found at index " +position);
    }
	}
}