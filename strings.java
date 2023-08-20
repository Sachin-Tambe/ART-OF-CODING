public class strings {
    public static void main(String[] args) {
        // un or in mutable string 
        String brand =  "Art-Of-Coding" ;
        System.out.println(brand);
        brand.concat("Art");
        System.out.println(brand);
        // mutable string 
        StringBuilder branded =  new StringBuilder("Art-of");
        System.out.println(branded);
        branded.append("-Coding");
        System.out.println(branded);
    }
}
