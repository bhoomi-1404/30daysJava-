public class Heap {
    static  int[] arr;
   static  int size;
    public Heap() {
        arr=new int [100];
        size=0;
    }
    static void  insert(int val)
    {
        size=size+1;
        int index=size;
        arr[index]=val;
        while(index>1)
        {
            int parent=index/2;
            if(arr[parent]<arr[index])
            {
                int temp=arr[parent];
                arr[parent]=arr[index];
                arr[index]=temp;
                index=parent;
            }
            else
            {
                return ;
            }
        }
    }
    static void delete()
    {
        if(size==0)
        {
            return ;
        }
        arr[1]=arr[size];
        size--;
        int i=1;
        while(i<size)
        {
            int li=2*i;
            int ri=2*i+1;
            if(li<size && arr[i]<li)
            {
                int temp=arr[i];
                arr[i]=arr[li];
                arr[li]=temp;
                i=li;
            }
            else if(ri<size && arr[i]<arr[ri])
            {
                int temp=arr[i];
                arr[i]=arr[ri];
                arr[ri]=temp;
                i=ri;
            }
            else
            {
                return ;
            }

        }
    }
    public static void Print()
    {
        for(int i=1;i<=size;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public  static void main(String args[])
    {
        Heap h=new Heap();
        h.insert(50);
        h.insert(55);
        h.insert(53);
        h.insert(52);
        h.insert(54);
        Print();
        System.out.println();
        h.delete();
        Print();

    }
}
