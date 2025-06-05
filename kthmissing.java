import java.util.*;
class kthmissing {
    int binsearch(int a[],int ele,int size)
    {
        int s = 0;
        int e = size-1;
        int mid = (s+e)/2;
        while(s<=e)
        {
            if(a[mid]==ele)
            {
                return 1;
            }
            else if(ele<a[mid])
            {
                e = mid-1;
            }
            else
            {
                s = mid+1;
            }
            mid = (s+e)/2;
        }
        return 0;
    }
    int findmissingk(int a[],int size,int v)
    {
        int b[] = new int[100000];
        int k = 0;
        int max = a[0];
        for(int i = 0;i<size;i++)
        {
            if(a[i]>max)
            {
               max = a[i];
            }
        }
        int z = 1;
        for(int i = 1;i<=max;i++)
        {
            if(binsearch(a,i,size)==0)
            {
                b[k++] = i;    
            }
        z = i+1;
        }
        if(k==v)
        {
            return b[v-1];
        }
        else
        {
            for(int i = k;i<v;i++)
            {
                b[i] = z;
                z++;
            }
        }
        return b[v-1];
    }
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size of array:\n");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("enter the elements of the array:\n");
        for(int i = 0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.print("enter the position at which we need to give the element : ");
        int k = sc.nextInt();
        kthmissing ob = new kthmissing();
        int x = ob.findmissingk(arr,n,k);
        System.out.println("the element at kth position is : " +x);
    }
}
