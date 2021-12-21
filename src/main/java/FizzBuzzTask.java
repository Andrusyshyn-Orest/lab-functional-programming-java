import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.List;

public class FizzBuzzTask {
    public static List<String> fizzBuzzIt(int n){
        List<Integer> arr = IntStream.range(1, n + 1).boxed().collect(Collectors.toList());
        return arr.stream().map(x -> {
            if ((x % 3 == 0) && (x % 5 != 0)){
                return "Fizz";
            }
            else if ((x % 5 == 0) && (x % 3 != 0)){
                return "Buzz";
            }
            else if ((x % 3 == 0) && (x % 5 == 0)){
                return "Fizz Buzz";
            }
            else{
                return x.toString();
            }
        }).collect(Collectors.toList());
    }
}
