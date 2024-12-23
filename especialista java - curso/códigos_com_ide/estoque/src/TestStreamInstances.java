import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Objects;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class TestStreamInstances {
    public static void main(String[] args) {
        // --- Arrays.stream()
        int[] numbers = {1, 2, 3};
        int resultSum = Arrays.stream(numbers).sum();

        System.out.println(resultSum);

        // --- Stream.iterate()
        Stream.iterate(1000, value -> value >= 0, value -> value - 10)
                .forEach(System.out::println);

        Stream.iterate(new BigDecimal("1000"),
                value -> value.compareTo(BigDecimal.ZERO)  >= 0,
                value -> value.subtract(new BigDecimal("50")))
                .forEach(System.out::println);

        // --- stream vazio
        Stream<String> names = Stream.empty();

        // --- Stream.of()
        Stream.of(1, 2, 3, 4, 5)
                .forEach(System.out::println);

        IntStream.of(23, 54, 6, 3, 212, 54, 77)
                .sorted()
                .forEach(System.out::println);

        // --- Stream.concat()
        Stream<Integer> numbers2 = Stream.of(1, 2, 3, 4);
        Stream<Integer> numbers3 = Stream.of(9, 8, 6, 5);
        Stream.concat(numbers2, numbers3)
                .sorted()
                .forEach(System.out::println);

        // --- IntStream.range()/IntStream.rangeClose()
        IntStream.range(1,10).forEach(System.out::println);
        IntStream.rangeClosed(5,10)
                .skip(2)
                .forEach(System.out::println);

        // --- Stream.generate()
        Random random = new Random();
        Stream.generate(() -> random.nextInt(60))
                .distinct()
                .limit(6)
                .forEach(System.out::println);

        // nonNull e isNull
        Stream.of("Eduardo", null, "Vitória", null, "Yasmim")
                .filter(Objects::nonNull)
                .forEach(System.out::println);
    }
}
