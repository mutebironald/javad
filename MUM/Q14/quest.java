/**
 * 
Question 14
Write a function that will return the most occurring number in an array. If there is more than
one such number, the function may return any one of them.
If you are programming in Java or C#, the function signature is int answerTwo(int[] a)

Examples
 -------------------------|----------|------------------------------------------------------------
| a                       | return   | Explanation                                                |
|-------------------------|----------|------------------------------------------------------------|
| {6,8,1,8,2}             | 8        | 8 occurs two times. No other number occurs 3 or more times |
|-------------------------|----------|------------------------------------------------------------|
| {6,8,1,8,6}             | 8 or 6   | 8, 6. The Function may return either 8 or 6                |
 -------------------------|----------|------------------------------------------------------------
 */

import java.util.*;
public class quest{
    public static void main(String[] args){
        int[] arr = {6,8,1,8,6};
        System.out.println(answerTwo(arr));
        // for(int b : answerTwo(arr)){
        //     System.out.println(b + " ll " + answerTwo(arr).length);
        // }
    }

    public static int answerTwo(int[] a){
        ArrayList<Integer> repeated = new ArrayList<Integer>();
        for(int i = 0; i < a.length; i++){
            for(int j = i+1; j < a.length; j++){
                if(a[i] == a[j]){
                    repeated.add(a[i]);
                }
            } 
        }
        Object[] objArray = repeated.toArray();
        int len = objArray.length;
        int[] arr = new int[len];
        for(int i = 0; i < objArray.length; i++){
            arr[i] = (int) objArray[i];
        }
        return arr[0];
               
    }
}
