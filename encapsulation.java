class sachin {
  private String name ; // encapsulation :- instanse variable 
  private int age ; // encapsulation :- instanse variable 

  //  public void name(String name ) { // name = local variable 
  //      // name = name ; // shaowing problem when instanse and local variable name are same 
  //      this.name = name ; // solution is the this keyword this.name refer the calling object that is sachin 
  //  }
  //  public void age(int age ) {
  //    this.age = age ;
  //  }
  sachin(String name , int age ){
       this.name = name ;
       this.age = age ;
  }
  sachin(){ // for the sachin2 we define the deault construcor 

  }
   public void PrintData() {
    System.out.println(name);
    System.out.println(age);
   }
}

public class encapsulation {
    public static void main(String[] args) {
        sachin sachin = new sachin("sachin" , 45); 
        sachin sachin2 = new sachin(); // deafult constructor not working we need to declare a one more default constructor 
        // tip :-  when we declare a ant contructor in class then the java compiler not provide a default constructor 
        sachin.PrintData();
       
    }
}
