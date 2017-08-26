package datastructure;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import javax.swing.*;

public class am2pm {

    public static void main(String[] args) throws Exception{
          String a="varun0";
          
          a.substring(0,4);
          String b=a;
          int c=1;
          c=5;
          //System.out.println(a.hashCode());
        //  int b=System.identifyHashCode(a);
        a="sjaj";
        String y=new String("varun");
        System.out.println(a.hashCode());
        b=b.toUpperCase();
        
        
        Integer i=new Integer("1");
        int z=i.hashCode();
        System.out.println(b.hashCode());
         // System.out.println(Integer.toHexString(System.identityHashCode(c)));
    }
    public static void pm()
    {
        Scanner in = new Scanner(System.in);
        String time = in.nextLine();
        	SimpleDateFormat inputFormat = new SimpleDateFormat("hh:mm:ssa");
        	SimpleDateFormat displayFormat = new SimpleDateFormat("HH:mm:ss");
        	
        //	Date date = inputFormat.parse(time);
        	//System.out.println(displayFormat.format(date));
        
      
       in.close();
        
    }
}