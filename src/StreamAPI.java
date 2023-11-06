
import java.util.*;
import java.util.stream.Collectors;

import static java.util.List.*;

public class StreamAPI {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(of(12,21,10,29,8,12,24,10,13,8));
        numbers.stream().map(element->element*2).sorted(Comparator.reverseOrder()).forEach(element-> System.out.println(element));
        numbers.stream().distinct().forEach(e-> System.out.println(e));
        TreeSet<Integer> tree = new TreeSet<>(numbers.stream().filter(e->e%2==0).map(e->e/2).collect(Collectors.toList()));
        System.out.println(tree);
    }
}
