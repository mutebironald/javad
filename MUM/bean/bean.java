/**
 * Question 12
A Bean array is defined to be an integer array where for every value n in the array,
there is also an element 2n, 2n+1 or n/2 in the array.

for example {4,9,8} is a Bean array because for 4,8 is present, for 9, 4 is present, for 8, 4 is present.
Other Bean arrays include {2,2,5,11,23}, {7,7,3,6} and {0}
The array {3,8,4} is not a Bean array because of the value 3 which requires that the array contains
either the value 6, 7 or 1 and none of these values are in the array.
Write a function named isBean that returns 1 if it's array argument is a Bean array,
otherwise it returns a 0.
if you are programming in Java or C#, the function signature is int isBean(int[] a)
 */
public class bean{
    //this solution is still contentious to me
    /**
     * why is it ? 
     * i think all array elements are supposed to satisfy both the 2n and 2n + 1 conds. 
     * Any element that doesn't is supposed to render isBean to false(0) in my understanding.
     * @param args
     */
    public static void main(String[] args){
        int arr[]  = {7,7,3,6};
        System.out.println(isBean(arr));
    }

    public static int isBean(int[] a){
        boolean isdouble = false;
        boolean isValid = false;
        if(a.length == 1 && a[0] == 0) return 1;
        for(int i = 0; i < a.length; i++){
            for(int j = i + 1; j < a.length; j++){
                // System.out.println(2*a[i] == a[j]);
                System.out.println(a[i+ 1] + " " + a[j]);
                // && a[i+1] == (2*a[j] + 1)
                if(2* a[i] == a[j] || a[i] == 0.5 * a[j] ){
                    System.out.println("isdouble");
                    isdouble = true;
                    // return 1;
                }
                if(a[i] == 2*a[j] + 1|| 2* a[i] + 1 == a[j]){
                    System.out.println("isvalid");
                    isValid = true;
                }
            }
        }
        if(isValid && isdouble){
            return 1;
        }else{
            return 0;
        }

    }
}
