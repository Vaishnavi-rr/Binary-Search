Algorithm of Binary Search in Java:

while(left<=right)
      mid=left + (right – left)/2;
if(a[mid]<search_element)
      left=mid+1;
else if(a[mid]>search_element)
      right=mid-1;
If found return index+1
Else return -1
  
code:
  
import java.util.Scanner;
public class Main {
       public static int binarySearch(int arr[], int left, int right, int item) {

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // if item is at mid
            if (arr[mid] == item)
                return mid;

            // If item greater, ignore left half, consider only right half
            if (arr[mid] < item)
                left = mid + 1;

            // If item is smaller, ignore right half, consider only left half
            else
                right = mid - 1;
        }

        // if we are able to reach here
        // means item wasn't present
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input array length
        System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];

        // Input array elements
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        // Input item to search for
        System.out.print("Enter the item to search for: ");
        int item = scanner.nextInt();
        int position = binarySearch(array, 0, size - 1, item);

        if (position == -1)
            System.out.println("Element not found");
        else
            System.out.println("The value " + item + " found at position: " + position);

     }
}
//Time Complexity (Best)	Ω(1)
//Time Complexity (Avg)	Θ(log n)
//Time Complexity (Worst)	O(log n)
//Space Complexity	O(1)
