/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructure;

import java.util.*;

public class array_list {
   public static void main(String args[]) {
      /*Creation of ArrayList: I'm going to add String
       *elements so I made it of string type */
	  ArrayList<String> obj = new ArrayList<String>(200);
          
	  /*This is how elements should be added to the array list*/
	  obj.add("Ajeet");
	  obj.add("Harry");
	  obj.add("Chaitanya");
	  obj.add("Steve");
	  obj.add("Anuj");
          System.out.println(obj.size());

	  /* Displaying array list elements */
	  System.out.println("Currently the array list has following elements:"+obj);

	  /*Add element at the given index*/
	  obj.add(0, "Rahul");
	  obj.add(1, "Justin");

	  /*Remove elements from array list like this*/
	  obj.remove("Chaitanya");
	  obj.remove("Harry");

	  System.out.println("Current array list is:"+obj);
           
	  /*Remove element from the given index*/
	  obj.remove(1);
          obj.set(0,"Varun");
          obj.add(1,"Varun");
          ArrayList<String> a2=new ArrayList<String>();
//          if(obj.contains("Varun"))
            a2.add(0,"Harsh");
            a2.add(1,"vaa");
            a2.add(2,"Hac");
          //  Integer a=a2.get(1);
            obj.addAll(a2);
            Collections.sort(a2);
              System.out.println(obj.size());
              System.out.println(a2);
              //duplicate();
              arrays_to_arraylist();
   }
   public static void duplicate()
   {
       ArrayList<Integer> a3=new ArrayList<Integer>();
              ArrayList<Integer> a4=new ArrayList<Integer>();
              System.out.println("Enter 5 integers for 2 lists");
              Scanner sc=new Scanner(System.in);
              for(int i=0;i<4;i++)
              {
                  int a=sc.nextInt();
                  a3.add(a);
              }
              
              for(int i=0;i<4;i++)
              {
                  int b=sc.nextInt();
                  a4.add(b);
              }
              System.out.println("Duplicate elements are");
	  for(int a:a4)
          {
              if(a3.contains(a))
                  System.out.println(a); 
          }
   }
          public static void arrays_to_arraylist()
          {
              Integer a[]={5,4,3,2,1,41};
              ArrayList<Integer> a2=new ArrayList<Integer>(Arrays.asList(a));
              
              ArrayList<Integer> a1=new ArrayList<Integer>();
              Collections.addAll(a1,a);
              Collections.sort(a2);
              System.out.println(a1);
          }
}