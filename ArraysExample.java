public class ArraysExample {
    public static void main(String args[])
    {
        int arr[] ={1,2,3,4};
        int n=arr.length;
        //reversing array
        for(int i=0,j=1;i<n/2;i++,j++)
        {
            arr[i]=arr[i]+arr[n-j];
            arr[n-j]=arr[i]-arr[n-j];
            arr[i]=arr[i]-arr[n-j];
        }
        for(int a :arr)
        {
            System.out.println(a);
        }
        
        
    }
    
}
