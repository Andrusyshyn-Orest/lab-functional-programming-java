import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        List<String> arr = Arrays.asList("1", "2", "abc", "3");
        List<Integer> newArr = MapTask.mapping(arr);
        System.out.println(newArr);

        List<String> newArr1 =FlattingTask.flattingStrings(arr);
        System.out.println(newArr1);

        System.out.println(FizzBuzzTask.fizzBuzzIt(23));

        arr = Arrays.asList("ABCA", "BCD", "ABC");
        System.out.println(GroupWordsTask.groupIt(arr));

    }
}
