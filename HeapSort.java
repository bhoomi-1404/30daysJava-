class Solution
{
    //Function to build a Heap from array.
    
    void buildHeap(int arr[], int n)
    {
        // Your code here
        for(int i=(n/2)-1;i>=0;i--)
        
        {
            heapify(arr,n,i);
        }
    }
 
    //Heapify function to maintain heap property.
    void heapify(int arr[], int n, int i)
    {
        // Your code here
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
    
    //Function to sort an array using Heap Sort.
    public void heapSort(int arr[], int n)
    {
        //code here
        buildHeap(arr,n);
      for(int i=n-1;i>0;i--){
          int temp=arr[0];
          arr[0]=arr[i];
          arr[i]=temp;
           //t--;
           heapify(arr,i,0);
       }
    }
 }
 
