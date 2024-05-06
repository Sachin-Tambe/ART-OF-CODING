public class concatina {
    public static void main(String[] args) {
        // scp :- String constant pool 
        String s1 = "sachin"; // SCP
        String s2 = "tambe" ; // SCP
        String s3 = s1 + s2 ; // HEAP
        System.out.println(s3);

        String s4 = new String("sachin"); // heap
        s4 = s4.concat("tambe"); // heap
        System.out.println(s4); 
        String s5 = new String("GAMERHORT"); // heap
        s5 = s5.concat(s4); // heap 
        System.out.println(s5);

        String str = "ART";
        System.out.println(str + 100 + 500);


    }
}
