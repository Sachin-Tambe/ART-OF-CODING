public class inMutableString {
    public static void main(String[] args) {
        String brand = "Art-Of-Coding" ;
         String brand1 = "Art-Of-Coding" ;
         System.out.println(brand == brand1 ); // because same memory location or value because in string constant pool there is no allow dublicate values in the string constant pool  so  brand and brand 1 it refer the same value or memory location 
        String brands = new String ("GAMERHORT") ;
         String brands1 = new String ("GAMERHORT") ;
         System.out.println(brands == brands1 );
          // because diff memory location or value because in heap area there is no allow dublicate values in the heap area   so  brands and brands 1 it refer the diff value or memory location in heap area 
          String sachin = new String("GAMERHORT");
          String sachi = "GAMERHORT" ;
          System.out.println(sachin == sachi );
          System.out.println(sachin.equals(sachi));
          // java is the  case sensetive alsoin stringd 
          // example
          String s1 =  "sachin";
          String s2 = "sachin";
          String s3 =  "SACHIN" ; // we use the upper case  // STRING CONSTANT POOL
          String s4 = new String("SACHIN"); // HEAP MEMORY
            
          System.out.println(s1.equals(s2));
          System.out.println(s1.equals(s3));
          System.out.println(s1.equalsIgnoreCase(s3));// ignore the uppercase and lower case 
          System.out.println(s1==s2);
          System.out.println(s1==s3);
          System.out.println(s3.equals(s4));
       


    }
}
