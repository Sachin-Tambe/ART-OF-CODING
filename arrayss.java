public class arrayss {
    public static void main (String [] args ) {
        // java to create array 1
        int sachin [] = {45 , 85 , 96 ,75} ; // arrrays are stored in a heap memory 
        System.out.println(sachin);
        for (int i = 0; i < sachin.length; i++) {
            System.out.println(sachin[i]);
        }
        // second method 
        int sachi[] =  new int [4] ;
        sachi[0] = 45 ;
        sachi[1] = 42 ;
        sachi[2] = 47 ;
        sachi[3] = 46 ;
        for (int i = 0; i < sachi.length; i++) {
            System.out.println(sachi[i]);
        }
       }
}
