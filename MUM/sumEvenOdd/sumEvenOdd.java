public class sumEvenOdd {
    public static void main(String[] args){
        int[] a = {};
        System.out.println(f(a));
    }

public static int f(int[] a){
    int X = 0;// sum odd
    int Y = 0;// sum even
    if(a.length == 1) return 1;
    if(a == null) return 0;

    for(int val: a){
        if(val % 2 == 0){
            Y += val;
        }else{
        X += val;
        }
    }

    return (X - Y);
}

}
