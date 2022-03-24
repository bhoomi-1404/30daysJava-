class Solution{
    public static int kthSmallest(int[] arr, int l, int r, int k) 
    { 
        //Your code here
        PriorityQueue <Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i = 0; i<k; i++){
            pq.add(arr[i]);
        }
        
        for(int i = k; i<arr.length; i++){
            if(pq.peek() > arr[i]){
                pq.poll();
                pq.add(arr[i]);
            }
        }
        
        return pq.peek();
   
    }

    
}
