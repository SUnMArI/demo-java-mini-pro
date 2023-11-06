public class Raferance implements FunctionalInterface {


    public boolean display(String name , String age){
        System.out.println("Name:");
        return true;
    }

    public boolean display(){
        return false;
    }
    Raferance (){
        System.out.println("Hello");
    }

    @Override
    public void name() {
        FunctionalInterface.super.name();
        System.out.println("Hi");
    }

    @Override
    public boolean login(String name, String password) {
        System.out.println("Hello");
        return false;
    }

//    Raferance(String name , String age){
//
//    }
}
