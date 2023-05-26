public class binarySearch {
    public static int Recursive(int arr[],int low,int high,int key)
    {
        if(low>high)
        {
            return -1;
        }

        int mid=low+(high-low)/2;

        if(arr[mid]<key)
        {
            return Recursive(arr, mid+1, high, key);
        }
        else if(arr[mid]>key)
        {
            return Recursive(arr, low, mid-1, key);
        }
        else 
        {
            return mid+1;
        }
    }
    public static int Iterative(int arr[],int n,int key)
    {
        int low=0;
        int high=n-1;

        while(low<=high)
        {
            int mid=low+(high-low)/2;

            if(arr[mid]<key)
            {
                low=mid+1;
            }
            else if(arr[mid]>key)
            {
                high=mid-1;
            }
            else if(arr[mid]==key)
            {
                return mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={12,23,34,45,56,67,78,89,90};
        int n=arr.length;
        int low=0;
        int high=n-1;

        System.out.println("Iterative Solution is: "+Iterative(arr, n, 56));
        System.out.println("Recursive Solution is: "+Recursive(arr, low, high, 56));
    }
    /*
     OUTPUT:-
     Iterative Solution is: 5
     Recursive Solution is: 5

     */
}
