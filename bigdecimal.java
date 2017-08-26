     import java.math.*;
     import java.util.*;
     
     class bigdecimal{
     public static void main(String args[])
     {
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     String s[]=new String[n+2];
     for(int i=0;i<n;i++)
     {
     s[i]=sc.next();
     }
     sc.close();

     	//Write your code here
        Arrays.sort(s, Collections.reverseOrder(new Comparator<String>() {
        public int compare(String a, String b) {
        return (a == null || b == null ? 0 : (new BigDecimal(a)).compareTo(new BigDecimal(b)));
        }}));;

        for(int i=0;i<n;i++)
        {
        System.out.println(s[i]);
        }
        }
        }

        /*Input
        9
		-100
		50
		0
		56.6
		90
		0.12
		.12
		02.34
		000.000

		//Output
		90
		56.6
		50
		02.34
		0.12
		.12
		0
		000.000
		-100
              */
                   
