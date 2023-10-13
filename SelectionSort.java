import java.util.Scanner;
public class SelectionSort {  
    public static void selectionSort(int[] arr){  
        for (int i = 0; i < arr.length - 1; i++)  
        {  
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
       
    public static void main(String a[]){  
        Scanner sd=new Scanner(System.in);
        System.out.println("Enter Length of Array:");
        int n=sd.nextInt();
        int[] arr1 =new int[n];  
        System.out.println("Enter Element One By One :");  
        for(int i=0;i<n;i++){  
            arr1[i]=sd.nextInt();
        }  
        System.out.println();  
          
        selectionSort(arr1);  
         
        System.out.println("After Selection Sort");  
        for(int i=0;i<n;i++){  
            System.out.print(arr1[i]+" ");  
        }  
    }  
} 