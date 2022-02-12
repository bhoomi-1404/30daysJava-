//import java.util.*;
//import java.util.Map.*;
//public class LinkedHashMApImplementation {
//    public static void main(String args[]){
//        LinkedHashMap<Integer,String> hm=new LinkedHashMap<Integer,String >(5,0.75f,true);
//        {
//            protected boolean removeEldestEntry(Map.Entry<Integer,String>)
//            {
//                return size()>5;
//            }
//        };
//        hm.put(0,"A");
//        hm.put(1,"B");
//        hm.put(2,"C");
//        hm.put(3,"D");
//        hm.put(4,"E");
//        String s=hm.get(0);
//        hm.put(5,"E");
//        s=hm.get(2);
//       /* for(int key:hm.keySet())
//        {
//            System.out.println(key+" ");
//        }*/
//        hm.forEach((k,v)-> System.out.println(" "+k+v));
//    }
//
//}
