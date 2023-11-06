public interface FunctionalInterface {
    boolean login(String name , String password);

    default void name(){
        System.out.println("Name: SunMariO");
    };

}
