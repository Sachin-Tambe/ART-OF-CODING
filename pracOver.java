class sachin {
        public int param(int a , int b ) {
            int c =  a +b ;
            return c;
        }
        public double param (double a , double b ) {
            double c  =  a + b ;
            return c ;
        }
        public int paeam ( int a , int b , int c ) {
            int f =  a +  b+  c ;
            return    f  ;
    
        }
    }

public class pracOver {
    
        public static void main(String[] args) {
            sachin  sachin  = new sachin() ;
          double c =   sachin.paeam(45, 78, 74) ;
           int d = sachin.param(45, 75) ;
            int f = sachin.param(75 , 82 );
            System.out.println(c);
            System.out.println(d);
            System.out.println(f);
            
        }
    }

