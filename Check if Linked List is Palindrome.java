
class Solution
{
    //Function to check whether the list is palindrome.
    Node reverse (Node head)
    {
        Node prev=null;
        Node next=null;
        Node curr=head;
        while(curr!=null)
        {
           next=curr.next;
           curr.next=prev;
           prev=curr;
           curr=next;
        }
        return prev ;
    }
    boolean isPalindrome(Node head) 
    {
        //Your code here
       Node slow=head;
       Node fast=head;
       while(fast!=null && fast.next!=null)
       {
           fast=fast.next.next;
           slow=slow.next;
       }
       slow=reverse(slow);
       fast=head;
       while( slow !=null)
       {
           if(fast.data!=slow.data)
           {
               return false;
           }
           fast=fast.next;
           slow=slow.next;
       }
       return true;
        
    }    
}
