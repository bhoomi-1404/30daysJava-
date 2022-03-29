class Solution
{
    public static int shouldPunish (int roll[], int marks[], int n, double avg)
    {
        // your code here
        int swap=0;
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                if(roll[j]>roll[j+1])
                {
                    // int temp=roll[j];
                    // roll[j]=roll[j+1];
                    // roll[j+1]=temp;
                    swap++;
                    
                }
            }
        }
        int sum=0;
        for(int i=0;i<marks.length;i++)
        {
            sum+=marks[i];
        }
        double avg1=(sum-swap)/n;
        if(avg1>avg)
        {
            return 1;

        }
        else
        {
            return 0;
        }
        
    }
}
