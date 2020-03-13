
/**Question 1
An array with an odd number of elements is said to be centered
if all elements (except the middle one) are strictly greater than the value
of the middle element. Note that only arrays with an odd number of elements
have a middle element. Write a function that accepts an integer array and
returns 1 if it is a centered array, otherwise it returns 0.
Examples:
 -----------------------|-----------------------------------------------------------------------
| if the input array is | return                                                                |
|-----------------------|-----------------------------------------------------------------------|
| {1,2,3,4,5}           | 0 (the middle element 3 is not strictly less than all other elements) |
|-----------------------|-----------------------------------------------------------------------|
| {3,2,1,4,5}           | 1 (the middle element 1 is strictly less than all other elements)     |
|-----------------------|-----------------------------------------------------------------------|
| {3,2,1,4,1}           | 0 (the middle element 1 is not strictly less than all other elements) |
|-----------------------|-----------------------------------------------------------------------|
| {1,2,3,4}             | 0 (no middle element)                                                 |
|-----------------------|-----------------------------------------------------------------------|
| {}                    | 0 (no middle element)                                                 |
|-----------------------|-----------------------------------------------------------------------|
| {10}                  | 1 (the middle element 10 is strictly less than all other elements)    |
 -----------------------------------------------------------------------------------------------
*/

//  class isCentered{
//     int arr[] = {};
//     if(arr.length == 0 || arr.length % 2 == 0){
//         return 0
//     }
//     if(arr.length == 1){
//         return 1
//     }
//     int midIndex = arr.length/2
//     int midItem = arr[midIndex]

// }


public class isCentered {
    public static void main(String[] args){
      int[] ty = {1,2,0,5,6};
      System.out.println(al(ty));
    }

  static int al(int[] a){
    if(a == null || a.length % 2 == 0) return 0;
    int middleIndex = a.length/2;
    int middleItem = a[middleIndex];
    for(int i =0 ; i<a.length; i++){
        if(i != middleIndex && middleItem >= a[i] ) return 0;
    }
    return 1;
    }
}



