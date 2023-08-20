public class pracPrintArray {
    public static void main(String[] args) {
        int a [] [] = {{45 , 75 } , {75 , 78 } , {25 , 36 }} ;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length -  1 ; j++) {
                System.out.println(a[i][j]);
            }
        }
    }
}
