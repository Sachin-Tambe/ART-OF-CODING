class getter{
  private String name ;
  private int age ;
  // construtor 
  getter(String name , int age ){
    this.name = name ;
    this.age =age ;
  }
  // setter 
// public void setName(String name) {
//     this.name = name;
// }
// public void setAge(int age) {
//     this.age = age;
// }
// insted of using setter  method we use the constructor of class getter 

// getter 
public String getName() {
    return name;
}
public int getAge() {
    return age;
}
}
public class gettersAndSetters {
    public static void main(String[] args) {
        getter getter = new getter("sachin", 45) ;

        String sachin = getter.getName();
        int sachinAge = getter.getAge();
        System.out.println(sachin);
        System.out.println(sachinAge);

    }
}
