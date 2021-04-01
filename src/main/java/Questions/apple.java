package Questions;

import java.util.List;

public class apple {
    public static void main(String[] args) {
        var fruits = List.of("apple", "orange", "banana", "lemon");

        fruits.stream().filter(f -> f.contains("n")).forEachOrdered(System.out::print);
    }
}
