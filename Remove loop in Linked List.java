
class Solution
{
    //Function to remove a loop in the linked list.
    public static void removeLoop(Node head){
        Node slow=head;
        Node fast=head;
        while(slow!=null && fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)
            {
                break;
            }
        }
        if(slow==head)
        {
            while(fast.next!=slow)
            {
                fast=fast.next;
            }
            fast.next=null;
        }
        if(slow==fast)
        {
            slow=head;
            while(slow.next!=fast.next)
            {
                slow=slow.next;
                fast=fast.next;
            }
            fast.next=null;
        }
      
    }
}
