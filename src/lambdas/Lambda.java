package lambdas;

import java.util.Arrays;
import java.util.List;

public class Lambda {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(23,12,34,15,56,17,590);
        numbers.stream()
                .filter(n -> n > 15)
                .map(n -> n*n)
                .forEach(n ->  {
            System.out.println(n);});
        }
    }
