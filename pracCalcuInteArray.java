public class pracCalcuInteArray {
    public static void main(String[] args) {
        int [] a = {45 , 85 , 96 , 65 };
        int c = 0 ;
        for (int i : a) {
            c = c + i ;
            System.out.println(c);
        }
        System.out.println("two dimentional array ");
        int sach [] [] = {{45 , 75 } , {75 , 85 } ,  {85 , 89 }} ;
        int h = 0 ;
        for (int[] p : sach ) {
            for (int j  : p ) {
                h = h + j ;
                System.out.println(h);
            }
        }
    }
}
