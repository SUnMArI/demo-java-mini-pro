

public class Main {

    record Person(String name , int age){

    }

    public static void main(String[] args) {
//        Person p = new Person("Sopheak",12);
//        Person p1 = new Person("Soph",12);
//        System.out.println(p.name());
//        System.out.println(p.age());
//        System.out.println(p.equals(p1));
//        var Name = "Sopeah";
        FunctionalInterface obj = (userName , password) -> {
            System.out.println("Name: Hahaha ");
            return true;
        };

        FunctionalInterface obj1 = ((userName, password) -> (userName.equals("Sopheak")?true:false));
        System.out.println("Boolean: "+obj1.login("Sopheak","12"));

        FunctionalInterface obj2 = new Raferance()::display;
        obj2.login("SunMariO","12");

//        FunctionalInterface obj3 = Raferance::new;

        Raferance rf = new Raferance();
//        rf.login();
        rf.name();
    }
}