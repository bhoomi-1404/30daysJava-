
class Solution
{

	
	void selectionSort(int arr[], int n)
	{
	    //code here
	    int minIndex;
	    for(int i=0;i<n;i++)
	    { 
	        minIndex=i;
	        for(int j=i+1;j<n;j++)
	        {
	            if(arr[j]<arr[minIndex])
	            {
	                minIndex=j;
	            }
	        }
	        int temp=arr[minIndex];
	        arr[minIndex]=arr[i];
	        arr[i]=temp;
	    }
	}
}
