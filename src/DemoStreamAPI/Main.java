package DemoStreamAPI;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        List<Worker> allWorker = new ArrayList<>(){{
            add(new Worker(1001,"Pisey Dev ","male",21,"Takeo","FullStack Developer",200,50));
            add(new Worker(1002,"Tey Junior ","female",21,"Takeo","FullStack Developer",60,10));
            add(new Worker(1001,"Sopheaktra Dev ","male",21,"Phnom Penh","FullStack Developer",20,50));
            add(new Worker(1001,"Pisey Dev ","male",21,"Takeo","Mobile Dev",200,230));
            add(new Worker(1002,"Tey Junior ","female",21,"Takeo","FullStack Developer",60,210));
            add(new Worker(1001,"Sopheaktra Dev ","male",21,"Phnom Penh","FullStack Developer",210,50));
            add(new Worker(1001,"Pisey Dev ","male",21,"Takeo","FullStack Developer",200,560));
            add(new Worker(1002,"Tey Junior ","female",21,"Takeo","Back-End",60,210));
            add(new Worker(1001,"Sopheaktra Dev ","male",21,"Phnom Penh","FullStack Developer",20,590));
        }};



    List<String> positions =   allWorker.stream().map(worker -> worker.getPosition()).sorted(Comparator.reverseOrder()).distinct().toList();
        System.out.println(positions);


        List<Float> femaleSalary =   allWorker.stream().map(worker -> worker.findSalary()).sorted(Comparator.reverseOrder()).distinct().toList();
        System.out.println(positions);
    }



}
