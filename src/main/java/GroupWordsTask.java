import java.util.*;
import java.util.stream.Collectors;

public class GroupWordsTask {
    public static Map<String, Integer> groupIt(List<String> arr){
        Map<String, List<String>> midMap = arr.stream()
                .collect(Collectors.groupingBy(x -> String.valueOf(x.charAt(0)),
                        HashMap::new, Collectors.toList()));
        Map<String, Integer> finalMap = midMap.entrySet().stream().
                collect(Collectors.toMap(Map.Entry::getKey,
                        e-> Collections.frequency(FlattingTask.flattingStrings(e.getValue()), e.getKey())));
        return finalMap;
    }
}
