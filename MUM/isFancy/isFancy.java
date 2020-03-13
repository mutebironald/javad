/**
 * Question 10
A fancy number is a number in the sequence 1,1,5,17,61,... Note the first two fancy numbers
are 1 and any fancy number other than the first two is sum of three times previous one and two times
the one before that. see below
1,
1,
3*1 + 2*1 = 5,
5*3 + 2*1 = 17,
17*3 + 5*2 = 61
Write a function named isFancy that returns 1, if it's integer argument is a Fancy number,
otherwise it returns 0.
 */

 public class isFancy{
     public static void main(String[] args){
         System.out.println(isFancie(17));
     }

     public static int isFancie(int num){
         int n1 = 1;
         int n2 = 1;
         int sum =0;
         for(int i = 1; i < num; i++){
             sum = 2 * n1 + 3 * n2;
             if(sum == num){
                 return 1;
             }
             n1 = n2;
             n2 = sum;
         }
         return 0;
     }
 }
