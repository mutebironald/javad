public class duplicateTwo{
    public static void main(String[] args){
        String[] strArray1 = {"abc1", "def1", "mno1", "xyz1", "pqr1", "xyz1", "def1"};
        for(int i = 0; i < strArray1.length; i++){
            for(int j = i + 1; j < strArray1.length; j++){
                if((strArray1[i] == strArray1[j]) && (i != j)){
                    System.out.println("Duplicates Exist " + strArray1[i]);
                }
            }
        }
    }

}
