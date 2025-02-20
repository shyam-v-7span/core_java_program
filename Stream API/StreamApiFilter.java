import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApiFilter {
    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(5, 10, 20, 15, 25);
        
        num.stream()
        .filter((n) -> n%2==0 && n!=10)
        .forEach(n -> System.out.println(n));

        // List<Integer> a = num.stream()
        //         .filter((n) -> n % 2 == 0 && n != 12)
        //         .collect(Collectors.toList());

        //         System.out.println(a);
    }
}
