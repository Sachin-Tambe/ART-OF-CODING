public class D2_Array {
    public static void main (String [] args ) {
        int TOW_DAM [] [] = new int[3][2] ;
        TOW_DAM[0] [0] = 45 ;
        TOW_DAM[0] [1] = 47 ;
        TOW_DAM[1] [0] = 75 ;
        TOW_DAM[1] [1] = 78 ;
        TOW_DAM[2] [0] = 95 ;
        TOW_DAM[2] [1] = 52 ;
        // for each loop 
        for (int[] a : TOW_DAM) {
            for (int b : a) {
                System.out.print(b + " ");
            }
            System.out.println();
        }
        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= 1 ; j++) {
                System.out.print(TOW_DAM[i][j] + " ");
            }
            System.out.println();
        }

       int sach [] [] = {
        {1 , 4} ,{7, 5} ,{7 , 9 }
       } ;

    for (int i = 0; i <= 2; i++) {
        for (int j = 0; j <= 1; j++) {
            System.out.print(sach[i][j] + " ");
        }
        System.out.println();
    }

    
    // // JAGGED ARRAY 
    int sachIN [][] = {
        {1 , 4 , 9 , 7 } ,{7, 5} ,{7 , 9 , 8 }
       } ;

       for (int[] a : sachIN) { // enhansed for loop or for each loop  
        for (int b : a) {
            System.out.print(b + " ");
        }
        System.out.println();
       }

    for (int i = 0; i <= 2; i++) {
        for (int j = 0; j < sachIN[i].length; j++) { // yaha colum rows se puch raha he tere me colums ki kit ni value he 
            System.out.print(sachIN[i][j] + " ");
        }
        System.out.println();
    }

    // // jagged array agar tumahe pata nahi he ki rows me kitne colum nahi to or tmhe har row ko alag values of colums assign arna he 
    int TOW_DAMG [] [] = new int[3][] ;
    TOW_DAMG[0] = new int[4] ; // we declare the vlues of coilms for spesific row 
    TOW_DAMG[1] = new int[1] ;
    TOW_DAMG[2] = new int[2] ;

    

      
     }
}
