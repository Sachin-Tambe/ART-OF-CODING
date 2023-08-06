class over {
        public int overlo(int a , int  b ) {
           int result = a + b ;
           return result ;
        }
        public void overlo (double a , double b ) {
            double result = a + b ;
            System.out.println(result);
        }
        // we can make multiple methods with same name but diff parameter 
    }
public class overloding {
    public static void main (String [] args ) {
        over over = new over() ;
        int result = over.overlo(45, 45);
        System.out.println(result);
        over.overlo(45.5, 85.6);
        // we can make different object with same class 

    }
}
