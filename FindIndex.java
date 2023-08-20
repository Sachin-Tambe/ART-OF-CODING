
public class FindIndex {
    public static void main(String[] args) throws Exception {
        
       int [] a = {45 , 85 , 96 } ; 
       int  targetElement = 96  ;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == targetElement) {
                System.out.println(i);
            } else {
                System.out.println("not in a array ");
                
            }
        }

    }
    }

