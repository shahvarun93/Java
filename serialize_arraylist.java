/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructure;
import java.util.*;
import java.io.*;
public class serialize_arraylist 
{
        public static void main(String [] args)
   {
       ArrayList<String> al=new ArrayList<String>();
       al.add("Hello");
       al.add("Hi");
       al.add("Howdy");

       try{
         FileOutputStream fos= new FileOutputStream("myfile");
         ObjectOutputStream oos= new ObjectOutputStream(fos);
         oos.writeObject(al);
         oos.close();
         fos.close();
       }catch(IOException ioe){
            ioe.printStackTrace();
        }
   }
}