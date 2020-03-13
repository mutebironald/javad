/**
 * Question 17
An array is defined to be inertial if the following conditions hold:
a. it contains at least one odd value
b. the maximum value in the array is even
c. every odd value is greater than every even value that is not the maximum value.
so {11,4,20,9,2,8} is inertial because
 - it contains at least one odd value
 - the maximum value in the array is 20 which is even
 - the two odd values (11 and 9) are greater than all the even values that are not
equal to 20 (the maximum), i.e {4,2,8}.
However, {12,11,4,9,2,3,10} is not inertial because it fails condition (c), i.e.
10 (which is even) is greater than 9 (which is odd), and 10 is not the maximum value
in the array.

Write a function called isInertial that accepts an integer array and returns 1 if the array
is inertial; otherwise it returns 0.
If you are programing in Java or C#, the function signature is
int isInertial(int[] a)

Some other examples:
 -----------------------|--------|-----------------------------------------------------------------------
| if the input array is | return | reason                                                                |
|-----------------------|--------|-----------------------------------------------------------------------|
| {1}                   | 0      | fails condition (a) - the maximum value must be even                  |
|-----------------------|--------|-----------------------------------------------------------------------|
| {2}                   | 0      | fails condition (b) - the array must contain at least one odd value   |
|-----------------------|--------|-----------------------------------------------------------------------|
| {1,2,3,4}             | 0      | fails condition (c) - 1(which is odd) is not greater than all even    |
|                       |        | values other than the maximum (1 is less than 2 which is not the max) |
|-----------------------|--------|-----------------------------------------------------------------------|
| {1,1,1,1,1,1,2}       | 1      | there is no even number other than the maximum. Hence, there can be no|
|                       |        | other even values that are greater than 1.                            |
|-----------------------|--------|-----------------------------------------------------------------------|
| {2,12,4,6,8,11}       | 1      | 11, the only odd value is greater than all even values except 12 which|
|                       |        | is the maximum value in the array.                                    |
|-----------------------|--------|-----------------------------------------------------------------------|
| {2,12,12,4,6,8,11}    | 1      | same as previous, ie, it is ok if maximum value occurs more than once |
|-----------------------|--------|-----------------------------------------------------------------------|
| {-2,-4,-6,-8,-11}     | 0      | -8, which is even, is not the maximum value but is greater than -11   |
|-----------------------|--------|-----------------------------------------------------------------------|
| {2,3,5,7}             | 0      | the maximum value is odd                                              |
|-----------------------|--------|-----------------------------------------------------------------------|
| {2,4,6,8,10}          | 0      | there is no odd value in the array                                    |
 -----------------------|--------|-----------------------------------------------------------------------

NOTE: To ease debugging, i will return a string
 */
import java.util.*;
public class inertial{
    public static void main(String[] args){
        int[] arr = {92,10,4,6,8,15};
        System.out.println(isInertial(arr));
    }
    public static int isInertial(int[] a){
        int max = 0;
        int comp = 0;
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a.length - i; j++){
                comp++;
                if(a[j] > a[i]){
                    max = Math.max(a[j], max);
                }
            }
        }
        System.out.println(" the max " + max + " comparisons " + comp );
        if(max % 2 != 0) {
            return 0;}

        boolean hasOdd = true;
        ArrayList<Integer> odd = new ArrayList<Integer>();
        ArrayList<Integer> even = new ArrayList<Integer>();
        for(int i = 0; i < a.length; i++ ){
            if(a[i] % 2 != 0){
                odd.add(a[i]);
                hasOdd = true;
            }else{
                if(a[i] != max){
                    even.add(a[i]);
                }
            }
        }
        if(!hasOdd){ 
            return 0;}

        Object[] oddArray = odd.toArray();
        Object[] evenArray = even.toArray();
        //odd
        int len = oddArray.length;
        int[] arrOdd = new int[len];
        for(int i = 0; i < oddArray.length; i++){
            arrOdd[i] = (int) oddArray[i];
        }
        //even
        int lenEven = evenArray.length;
        int[] arrEven = new int[lenEven];
        for(int i = 0; i < evenArray.length; i++){
            arrEven[i] = (int) evenArray[i];
        }
        
        if(OddGreater(arrOdd, arrEven)){
            return 1;
        }else{
            return 0;
        }

    }

     //we will have a function that will take in two arrays(even and odd) and check if all odd vals
    //are greater than the even vals.
    public static boolean OddGreater(int[] c, int[] d){
        boolean corr = false;
        for(int i = 0; i < c.length; i++){
            for(int j = 0; j < d.length - i; j++){
                if( c[i] > d[j]){
                    corr = true;
                }
            }
        }
        return corr;
    }
}
