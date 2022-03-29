class Solution
{
    void merge(int arr[], int l,int r)
    {
         // Your code here
         int mid=l+(r-l)/2;
         int n1=mid-l+1;
         int n2=r-mid;
         int first[]=new int [n1];
         int second[]=new int [n2];
         int k=l;
         for(int i=0;i<n1;i++)
         {
             first[i]=arr[k++];
         }
        k=mid+1;
         for(int i=0;i<n2;i++)
         {
             second[i]=arr[k++];
         }
         int i=0;
         int j=0;
          k=l;
         while(i<n1 && j<n2)
         {
             if(first[i]<second[j])
             {
                 
                 arr[k]=first[i];
                 i++;
             }
             else
             {
                 arr[k]=second[j];
                 j++;
             }
             k++;
         }
         while(i<n1)
         {
             arr[k]=first[i];
             i++;
             k++;
         }
         while(j<n2)
         {
             arr[k]=second[j];
             j++;
             k++;
         }
         
    }
    void mergeSort(int arr[], int l, int r)
    {
        //code here
        if(l>=r)
        {
            return ;
        }
        int mid=l+(r-l)/2;
        mergeSort(arr,l,mid);
        mergeSort(arr,mid+1,r);
        merge(arr,l,r);
    }
}
