/**
Define the n-upcount of an array to be the number of times the partial sum goes from less than
or equal to n to greater than n during the calculation of the sum of elements of the array.
if you are programming in Java or C#, the function signature is int nUpCount(int[] a, int n)

For example, if n=5, the 5-upcount of the array {2,3,1,-6,8,-3,-1,2} is 3.
 ------|------|--------------|---------|---------------------------------
| i    | a[i] | partial sum  | upcount | comment                         |
|------|------|--------------|---------|---------------------------------|
| 0    | 2    | 2            |         |                                 |
|------|------|--------------|---------|---------------------------------|
| 1    | 3    | 5            |         |                                 |
|------|------|--------------|---------|---------------------------------|
| 2    | 1    | 6            | 1       | partial sum goes from 5 to 6    |
|------|------|--------------|---------|---------------------------------|
| 3    | -6   | 0            |         |                                 |
|------|------|--------------|---------|---------------------------------|
| 4    | 8    | 8            | 2       | partial sum goes from 0 to 8    |
|------|------|--------------|---------|---------------------------------|
| 5    | -3   | 5            |         |                                 |
|------|------|--------------|---------|---------------------------------|
| 6    | -1   | 4            |         |                                 |
|------|------|--------------|---------|---------------------------------|
| 7    | 2    | 6            | 3       | partial sum goes from 4 to 6    |
 ------|------|--------------|---------|---------------------------------
*/

public class quest{
    public static void main(String[] args){
        int[] array =  {1,2,-1,5,3,2,-3};
        System.out.println(nUpCount(array, 20));
    }
    public static int nUpCount(int[] a, int n){
        int count = 0;
        int partialSum = 0;
        int prevPartialSum = 0;
        for(int i = 0 ; i < a.length; i++){
            prevPartialSum = partialSum;
            partialSum += a[i];
            if(prevPartialSum <= n && partialSum > n){
                System.out.println(" hello " + prevPartialSum +" partialSum " + partialSum);
                count++;
            }
        }
        return count;
    }
}
