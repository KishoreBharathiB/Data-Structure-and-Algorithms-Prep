import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _15_NaturalSort {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("file1.txt");
        strings.add("file10.txt");
        strings.add("file2.txt");
        strings.add("file20.txt");
        List<String> sortedStrings = naturalSort(strings);
        for (String str : sortedStrings) {
            System.out.println(str);
        }
    }

    public static List<String> naturalSort(List<String> strings) {
        strings.sort(Comparator.comparingInt(_15_NaturalSort::extractFirstNumericPart)
                .thenComparing(Comparator.naturalOrder()));
        return strings;
    }

    private static int extractFirstNumericPart(String str) {
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(str);

        if (matcher.find()) {
            return Integer.parseInt(matcher.group());
        }

        return 0; // Default value if no numeric part is found
    }
}
