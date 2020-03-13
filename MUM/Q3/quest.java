public class quest {
    public static void main(String[] args){
    char[] array = {'a','b'};
      System.out.println(a3(array, 1, 1));
    }

    public static char[] a3(char[] a, int start, int len){
        if(len < 0 || start < 0 || start + len - 1 > a.length) return null;
        char [] sub = new char[len];
        for(int i = start, j = 0; j < len; i++, j++){
            sub[j] = a[i];
        }
        return sub;
    } 

}
