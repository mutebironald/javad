/**Question 15
Write a function that will return 1 if an integer array satisfies the following conditions and returns 0 otherwise.
1. it has even numbers of elements
2. Sum of all the numbers in the first half of the array is equal to the sum of all the numbers in the second half of the array.

If you are programming in Java, the function Signature is
int answerThree(int[] a)
Examples
 -------------------|--------|-----------------------------------------------------------------------
| a                 | return | Explanation                                                           |
|-------------------|--------|-----------------------------------------------------------------------|
| {5,4,3,2,3,4,6,1} | 1      | *There are 8 (even) number of elements in the array. Thus condition 1 |
|                   |        | satisfied.                                                            |
|                   |        | *The sum of all the numbers in the first half = 5+4+3+2 = 14          |
 -------------------|--------|-----------------------------------------------------------------------
 *
 */
public class quest{
    public static void main(String[] args){
        int arr[] = {5,4,3,2,3,4,6,1};
        System.out.println(answerThree(arr));
    }

    public static int answerThree(int[] a){
        int firstHalf = 0;
        if(a.length % 2 != 0) return 0;
        int half = a.length / 2;
        for(int i =0; i < half; i++){
            firstHalf += a[i];
        }
        int secondHalf = 0;
        for(int i = half; i< a.length; i++){
            secondHalf += a[i];
        }

        if(firstHalf == secondHalf){
            return 1;
        }else{
            return 0;
        }

    }
}
