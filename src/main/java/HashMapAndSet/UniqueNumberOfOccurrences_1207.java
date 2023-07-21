package HashMapAndSet;

import java.util.HashMap;
import java.util.Map;
import java.util.HashSet;
import java.util.Set;

public class UniqueNumberOfOccurrences_1207 {

  public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> occurrences = new HashMap<>();

        // Подсчитываем количество вхождений каждого элемента в массиве
        for (int num : arr) {
            occurrences.put(num, occurrences.getOrDefault(num, 0) + 1);
        }

        // Проверяем, повторяются ли какие-либо вхождения
        Set<Integer> uniqueOccurrences = new HashSet<>(occurrences.values());
        return occurrences.size() == uniqueOccurrences.size();
    }
}
