/**
Question 5
Write a function to return an array containing all elements common to two
given arrays containing distinct positive integers. You should not use any inbuilt
methods. You are allowed to use any number of arrays.

The signature of the function is:
int[] f(int[] first, int[] second)

Examples:
 --------------------------------|--------------------------------------------------------------
| if the input parameters are    | return                                                       |
|--------------------------------|--------------------------------------------------------------|
| {1,8,3,2},{4,2,6,1}            | {1,2}                                                        |
|--------------------------------|--------------------------------------------------------------|
| {1,8,3,2,6},{2,6,1}            | {2,6,1}                                                      |
|--------------------------------|--------------------------------------------------------------|
| {1,3,7,9},{7,1,9,3}            | {1,3,7,9}                                                    |
|--------------------------------|--------------------------------------------------------------|
| {1,2}, {3,4}                   | {}                                                           |
|--------------------------------|--------------------------------------------------------------|
| {}, {1,2,3}                    | {}                                                           |
|--------------------------------|--------------------------------------------------------------|
| {1,2}, {}                      | {}                                                           |
|--------------------------------|--------------------------------------------------------------|
| {1,2}, null                    | null                                                         |
|--------------------------------|--------------------------------------------------------------|
| null, {}                       | null                                                         |
|--------------------------------|--------------------------------------------------------------|
| null, null                     | null                                                         |
 --------------------------------|--------------------------------------------------------------

NOTE: To ease debugging, Will return a string array.
 */

public class duplicateOne{
    public static void main(String[] args){
        int[] arr1 = {4,5,7};
        int[] arr2 = {1,2,4,5};
        System.out.println("Print array list in a foreach loop");
        for(int b : a5(arr1,arr2) ){
            System.out.println(b);
        }
    }

    public static int[] a5(int[] first, int[] second){
        if(first == null || second == null) return null;
        //length() is for string or string Builder objects while length is for arrays
        if(first.length == 0 || second.length == 0) return new int[0];
        int min = first.length < second.length ? first.length : second.length;
        int[] a, b;
        if(min == first.length){
            a = first;
            b = second;
        }else{
            a = second;
            b = first;
        }
        int[] c = new int[min];
        int k =0;
        for(int i = 0; i  < a.length; i++){
            for(int j = 0 ; j < b.length; j++){
                if(a[i] == b[j]){
                    c[k] = a[i];
                    k++;
                }
            }
            
        }
        int[] retArray = new int[k];
        for(int t =0; t < retArray.length; t++){
            retArray[t] = c[t];
        }
        return retArray;

    }
}
