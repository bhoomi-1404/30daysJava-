class Solution{
    public void heapify(int arr[],int n,int i)
    {
         int li=2*i+1;
        int ri=2*i+2;
        int largest=i;
       if(li<n && arr[li]>arr[largest])
        {
            largest=li;
        }
    if(ri<n && arr[ri]>arr[largest])
        {
            largest=ri;
        }
        if(largest!=i)
        {
            int temp=arr[i];
            arr[i]=arr[largest];
            arr[largest]=temp;
            heapify(arr,n,largest);
        }
    }
    public int[] mergeHeaps(int[] a, int[] b, int n, int m) {
        // your code here
        int ans[]=new int [m+n];
        for(int i=0;i<n;i++)
        {
            ans[i]=a[i];
        }
        int j=a.length;
        for(int i=0;i<m;i++)
        {
            ans[j]=b[i];
            j++;
        }
        int size=ans.length;
        for(int i=size/2-1;i>=0;i--)
        {
            heapify(ans,size,i);
        }
     
        return ans;
    }
}
