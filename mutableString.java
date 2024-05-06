import java.io.BufferedReader;

public class mutableString {
    public static void main(String[] args) {
        StringBuffer sb  = new StringBuffer("sachin");
        sb.append("tambe"); // for the inmutable String we need to write sdfg = sb.concat("tambe");
        // syso(sdfg);
        System.out.println(sb);

        StringBuffer sachin = new StringBuffer("sachin");
        sachin.append("tambe");
        sachin = new StringBuffer("sachin tambe ");

        final StringBuffer tambe =  new StringBuffer("tabaji");
        tambe.append("tambe");// final keyword not affect on inmutablity of StringBuffer 
    


    }
}
