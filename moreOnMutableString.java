public class moreOnMutableString {
    public static void main(String[] args) {
       StringBuffer buffer = new StringBuffer();
       System.out.println(buffer.capacity()); // deafult capacity = 16 
       buffer.append("sachin_tambe_sdf");
       System.out.println(buffer.capacity());
       buffer.append("s");
       System.out.println(buffer.capacity()); // when more than 16 follows (capacity + 1) * 2 = (16+1)*2 = 34 

       StringBuffer sachin = new StringBuffer("sachin");
       System.out.println(sachin);
       System.out.println(sachin.capacity()); // sachin + 16
       System.out.println(sachin.charAt(2));
       sachin.setCharAt(1, 'S');

       StringBuilder builder = new StringBuilder(150); // srt the capacity 
       System.out.println(builder.capacity());
       builder.append("sachin");
       builder.trimToSize();
       System.out.println(builder.capacity());// reduce the size to size of the sachin that is 6 
       System.out.println(builder.reverse());
       
       String sachinn = "sachin  tambe ";
       System.out.println(sachinn.length());
       System.out.println(sachinn.trim());
       System.out.println(sachinn.length());
       
       String s1= "Hello , have a good Day ";
     String s2 = s1.replaceAll("[aeiouAEIOU ,]" , "");
       System.out.println(s2);

    




    }
}
