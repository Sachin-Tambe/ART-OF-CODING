public class ArrayIndexOutOfBound {
    public static void main(String[] args) {
        int[] a =  {4 , 5 ,8 ,5 , 9 };
        System.out.println(a[0]);
        for (int i : a) {
            System.out.println(i);
        }
        System.out.println(a[5]); // arrayindexbound exception coming 
        //  to avoid this exception we can use .length property and 
        //  enhansed for loop 

        
    }
}
