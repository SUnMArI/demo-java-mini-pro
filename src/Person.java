public class Person  {

   private String Name ;
   private int age ;

   public Person(){}
   public Person(String name , int age){
       Name =name ;
       this.age=age;
   }

    @Override
    public String toString() {
        return "Person{" +
                "Name='" + Name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
