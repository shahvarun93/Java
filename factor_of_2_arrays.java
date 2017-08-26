/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructure;

import java.util.*;
import java.io.*;
public class factor_of_2_arrays
{
public static void main(String[] args) { 
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int m = in.nextInt();

    int[] a = new int[n];
    for (int a_i = 0; a_i < n; a_i++) {
        a[a_i] = in.nextInt();
    }

    int[] b = new int[m];
    for (int b_i = 0; b_i < m; b_i++) {
        b[b_i] = in.nextInt();
    }

    List<Integer> numberList = new ArrayList<Integer>();

    for (int i = a[a.length - 1]; i <= b[0]; i++) {

        if (isItAfactorOfFirstArr(i, a) && isItAfactorOfSecondArr(i, b)) {
            numberList.add(i);
        }
    }
    System.out.println(numberList.size());
}
    public static boolean isItAfactorOfFirstArr(int n, int[] arr) {
    boolean isIt = false;
    for (int i = 0; i < arr.length; i++) {
        if (n % arr[i] == 0) {
            isIt = true;
        } else {
            isIt = false;
            break;
        }
    }
    return isIt;
}

public static boolean isItAfactorOfSecondArr(int n, int[] arr) {
    boolean isIt = false;
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] % n == 0) {
            isIt = true;
        } else {
            isIt = false;
            break;
        }
    }
    return isIt;
}
}
