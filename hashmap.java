/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructure;

/**
 *
 * @author shahv
 */
import java.util.*;
import java.lang.reflect.*;
public class hashmap {
    public static void main(String args[])
    {
        HashMap<String,Integer> h1=new HashMap<String,Integer>(3);
        h1.put("A",1);
        h1.put("C",2);
        h1.put("Z",3);
        h1.put("Y",4);
        h1.put("P",5);
        h1.put("Q",6);
        h1.put("R",7);
        h1.put("B",8);
        h1.put("D",9);
        h1.put("E",10); 
        int l=0;
        try{
        Field tableField = HashMap.class.getDeclaredField("table");
        tableField.setAccessible(true);
        Object[] table = (Object[]) tableField.get(h1);   
        l=table.length;
        System.out.print(table[10]);
        System.out.println(table == null ? 0 : table.length);
        }
        catch(Exception e)
        {
            
        }
        System.out.println(h1);
         System.out.println("Before Sorting:");
         Set set = h1.entrySet();
         Iterator iterator = set.iterator();
         while(iterator.hasNext()) {
               Map.Entry me = (Map.Entry)iterator.next();
               System.out.print(me.hashCode()%316+":"+me.getKey() + ": ");
               System.out.println(me.getValue());
         }
         Map<Integer, String> m1=sortbyvalues(h1);
         System.out.println("After sorting");
         Set s=m1.entrySet();
         Iterator i=s.iterator();
         while(i.hasNext())
         {
             Map.Entry me=(Map.Entry)i.next();
             System.out.println(me.getKey()+ ":" +me.getValue());
         }
    }
    private static HashMap sortbyvalues(HashMap h1)
    {
        List l=new LinkedList(h1.entrySet());
        //define custom comparator here
        Collections.sort(l, new Comparator() {
        public int compare(Object o1, Object o2){
            return((Comparable)((Map.Entry)(o1)).getValue()).compareTo(((Map.Entry)(o2)).getValue());
        }
    });
    HashMap sortedHashMap=new LinkedHashMap();
    for(Iterator i=l.iterator();i.hasNext();)
    {
        Map.Entry m=(Map.Entry)i.next();
        sortedHashMap.put(m.getKey(), m.getValue());
    }
    return(sortedHashMap);
    }
}
