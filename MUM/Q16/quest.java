/**
 * Question 16 A Madhav array has the following property. a[0] = a[1] + a[2] =
 * a[3] + a[4] + a[5] = a[6] + a[7] + a[8] + a[9] = ... The length of a Madhav
 * array must be n*(n+1)/2 for some n. Write a method named isMadhavArray that
 * returns 1 if its array argument is a Madhav array, otherwise it returns 0. If
 * you are programming in Java or C# the function signature is int
 * isMadhavArray(int[] a)
 * 
 * Examples
 * -----------------------------------|-------|---------------------------------------------------
 * | if a is | return| reason |
 * |-----------------------------------|-------|---------------------------------------------------|
 * | {2,1,1} | 1 | 2 = 1 + 1 |
 * |-----------------------------------|-------|---------------------------------------------------|
 * | {2,1,1,4,-1,-1} | 1 | 2 = 1 + 1, 2 = 4 + -1 + -1 |
 * |-----------------------------------|-------|---------------------------------------------------|
 * | {6,2,4,2,2,2,1,5,0,0} | 1 | 6 = 2 + 4, 6 = 2 + 2 + 2, 6 = 1 + 5 + 0 + 0 |
 * |-----------------------------------|-------|---------------------------------------------------|
 * | {18,9,10,6,6,6} | 0 | 18 != 9 + 10 |
 * |-----------------------------------|-------|---------------------------------------------------|
 * | {-6,-3,-3,8,-5,-4} | 0 | -6 != 8 + -5 + -4 |
 * |-----------------------------------|-------|---------------------------------------------------|
 * | {0,0,0,0,0,0,0,0,0,0,1,1,1,-2,-1} | 1 | 0 = 0+0, 0 = 0+0+0, 0 = 0+0+0+0, 0
 * = 1+1+1+-2+-1 |
 * |-----------------------------------|-------|---------------------------------------------------|
 * | {3,1,2,3,0} | 0 | The length of the array is 5, but 5 != n*(n+1)/2 |
 * -----------------------------------|-------|---------------------------------------------------
 */

public class quest {
    public static void main(String[] args) {
        //
        int arr[] = {2,1,1} ;
        System.out.println(isMadhavArray(arr));
    }

    // public static int isMadhavArray(int[] a){
    // int len = a.length;
    // //loop thru all
    // for(int i = 0; i < len; i++){
    // int sum1 = a[i+1] + a[i+2];
    // int sum2
    // }
    // }

    public static int isMadhavArray(int[] n){
        //check if validates n*(n+1)/2
        int ismadhav=0;
        int k = 1;
        while (k < n.length){
            int temp = k * (k + 1) / 2;
            if ( temp == n.length){
                ismadhav = 1;
                break;
            }
            k++;
        }
        if (ismadhav == 0)
        return 0;

        int loop = 1;

        int i = 0;
        while (i < n.length){
            int inloop = loop;
            int temp = 0;
            while (inloop > 0){
                temp += n[i++];
                inloop--;
            }

            if (temp != n[0]) return 0;
            loop++;
        }
        return 1;
    }
}
