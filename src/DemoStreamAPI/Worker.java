package DemoStreamAPI;

public class Worker extends Person {
    private int workerID;
    private String position;
    private float hours;
    private float wage;

    public Worker(){
    }
    public Worker(int workerID,String name, String gender , int age , String address,  String position , float hours, float wage){

        super(name, gender, age , address);
        this.workerID = workerID ;
        this.position = position;
        this.hours = hours;
        this.wage =wage;
    }
    public float findSalary(){
        return wage * hours;
    }
    public void outPutInfo(){
        System.out.println("Worker ID is: "+workerID);

        System.out.println("Position");
        System.out.println("");
        System.out.println("");
    }


    public int getWorkerID() {
        return workerID;
    }

    public void setWorkerID(int workerID) {
        this.workerID = workerID;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public float getHours() {
        return hours;
    }

    public void setHours(float hours) {
        this.hours = hours;
    }

    public float getWage() {
        return wage;
    }

    public void setWage(float wage) {
        this.wage = wage;
    }
}
