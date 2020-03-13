/**
 * Question 13
Consider the positive integer 50. Note that 50 = 25 + 25 = 5^2 + 5^2 and 50 = 1 + 49 = 1^2 + 7^2,
Thus 50 can be expressed as a sum of the two squares in two different ways.
Write a method whether or not a positive integer n can be expressed as a sum of two squares in
exactly two different ways.
The signature of the function is
int answerOne(int n)
 */

 public class one{
     public static void main(String[] args){
         System.out.println(answerOne(50));
     }

     public static int answerOne(int n){
         boolean corr = false;
         if(n == 0 ){
             corr = false;
         };
         int half = n/2;
         int squareRootHalf = (int) Math.floor(Math.sqrt(half));
         if(half + half == n){
             corr = true;
         }else {
            System.out.println(" false half");
             corr = false;
         }
         int squareRemainder = (int) Math.floor(Math.sqrt(n - 1));
         if(squareRemainder * squareRemainder + 1 == n){
             corr = true;
         }else{
            System.out.println("Rem false");
             corr = false;
         }
         if(corr){
             return 1;
         }else{
             return 0;
         }


     }
 }
