import java.util.ArrayList;
import java.util.List;

public class _20_SimplifiedCombinations {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int r = 3;
        List<List<Integer>> result = new ArrayList<>();
        generateCombinations(arr, r, 0, new ArrayList<>(), result);

        // Print all combinations
        for (List<Integer> combination : result) {
            System.out.println(combination);
        }
    }

    public static void generateCombinations(int[] arr, int r, int start, List<Integer> current, List<List<Integer>> result) {
        if (current.size() == r) {
            result.add(new ArrayList<>(current));
            return;
        }
        for (int i = start; i < arr.length; i++) {
            current.add(arr[i]);
            generateCombinations(arr, r, i + 1, current, result);
            current.remove(current.size() - 1); // Backtrack
        }
    }
}
