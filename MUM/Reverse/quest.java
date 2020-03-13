public class quest{
    public static void main(String[] args){
        System.out.println(f(3401));
        // f(34);
    }

    public static int f(int n){
        int sign = 1;
        if(n == 0) return 0;
        if(n < 0){
            sign = -1;
            n = -n;
        }
        int reverse = 0;
        while(n!=0){
            reverse = (reverse * 10) + (n % 10);
            n /= 10;
        }
        return sign * reverse;
    }
}
