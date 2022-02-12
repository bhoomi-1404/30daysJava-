//import java.util.TreeSet;
import java.util.*;
    class Point implements Comparable{
    int x;
    int y;

     public Point(int x,int y)
     {
         this.x=x;
         this.y=y;
     }
     public String toString()
     {
         return "X= " +x+" Y "+y;
     }
     public int compareTo(Object o)
     {   Point p=(Point) o;
         if(this. x<p.x)
             return -1;
         else if(this.x>p.x)
             return 1;
         else
         {
             if(this.y<p.y)
                 return -1;
             else if(this.y>p.y)
                 return 1;
             else
                 return 0;
         }
     }
}

public class TreeSetImplementation {
    public static void main(String args[])
    {
        TreeSet<Point> ts=new TreeSet<>();
//        ts.add(10);
//        ts.add(40);
//        ts.add(10);
//        ts.add(50);
//        ts.add(10);
        ts.add(new Point(4,5));
        ts.add(new Point (1,1));
        ts.add(new Point(5,1));
        System.out.print(ts);
    }
}
