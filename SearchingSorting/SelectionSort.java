import java.util.*;
public class SelectionSort 
{
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the Array Elements");
        for(int i=0;i<n;i++)
        {
         arr[i]=sc.nextInt();
        }
        SelectionSort(arr);
        System.out.println(Arrays.toString(arr));
        
      }
      static void SelectionSort(int[] a)
      {
          
          int n=a.length;
          for(int i=0;i<n;i++)
          {
            int last=n-i-1;
            // selecting the max index
            int max=MaxIndex(a,0,last);
            //swapping the max index with the last index.
            Swapped(a,max,last);
            
          }
          
      }
      
      static void Swapped(int arr[],int first,int second)
      {
          int temp=arr[first];
          arr[first]=arr[second];
          arr[second]=temp;
      }
      static int  MaxIndex(int arr[],int s,int e)
      {
          int max=s;
          for(int i=s;i<e;i++)
          {
              if(arr[max]<arr[i])
              {
                 max=i; 
              }
          }
          return max;
      }
      
    
}
