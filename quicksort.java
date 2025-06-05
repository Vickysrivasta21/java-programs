import java.util.*;
class quicksort
{
    int partition(int arr[],int l, int h)
    {
        int pivot = arr[l];
        int i = l+1;
        int j = h;
        do{
        while(i<=h&&arr[i]<=pivot)
        {
            i++;
        }
        while(j>=l&&arr[j]>pivot)
        {
            j--;
        }
        if(i<j)
        {
            int t = arr[j];
            arr[j] = arr[i];
            arr[i] = t;
        }
    }
    while(i<j);
        int t = arr[j];
            arr[j] = arr[l];
            arr[l] = t;
    return j;
    }
    void quicksrt(int arr[] , int l, int high)
    {
        if(l<high)
        {
            int x = partition(arr,l,high);
            quicksrt(arr,l,x-1);
            quicksrt(arr,x+1,high);
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int n = sc.nextInt();
        int ar[] = new int[n];
        System.out.println("enter the elements");
        for(int i = 0;i<n;i++)
        {
            ar[i] = sc.nextInt();
        }
        quicksort  ob  = new quicksort();
        ob.quicksrt(ar,0,n-1);
        System.out.println("the sorted array is");
        for(int i = 0;i<n;i++)
        {
            System.out.print(ar[i]+"\t");
        }
    }
}