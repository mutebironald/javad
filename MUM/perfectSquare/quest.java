/**
Write a function nextPerfectSquare that returns the first perfect square that is greater than
it's integer argument. A perfect square is an integer that is equal to some integer squared.

For example 16 is a perfect square because 16 = 4*4. However 15 is not a perfect square because
there is no integer n such that 15 = n*n.

The signature of the function is
int isPerfectSquare(int n)
Examples
 -------------------------|--------------------------------------------------------------
| n                       | next perfect square                                          |
|-------------------------|--------------------------------------------------------------|
| 6                       | 9                                                            |
|-------------------------|--------------------------------------------------------------|
| 36                      | 49                                                           |
|-------------------------|--------------------------------------------------------------|
| 0                       | 1                                                            |
|-------------------------|--------------------------------------------------------------|
| -5                      | 0                                                            |
 -------------------------|--------------------------------------------------------------

 */

 public class quest{
    public static void main(String[] args){
         System.out.println(isPerfectSquare(-5));
     }

    public static int isPerfectSquare(int n){
        // double sq = Math.sqrt(n);
        // int val = (int) ((sq - Math.floor(sq)));
        // if(val == 0){
        //     return n + 1;
        // }else {
        // return n + 2;
        // }
        int nextN = (int) Math.floor(Math.sqrt(n) + 1);
        return nextN * nextN;


    }
 }
