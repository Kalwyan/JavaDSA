package interviews;

import java.util.*;
import java.util.stream.Collectors;

/**
 *Problem: Find the highest repeated string from the list of given strings
 *
 *Solution:
 * 1. Arrange the list of strings into a Hashmap where key as a string and value as the count of the string
 * 2. Retrieve the entry set and store them as a list of entries type
 * 3. Then list can be sorted by value and reversed
 * 4. Now reassign the sorted list of entries into a Linked HashMap and retrieve the first entry's value
 */
public class SortByValues {
    public static void main(String[] args) {
        String[] names = {"Kalwyan", "Rhannei", "Aakshra", "Pedda", "Kalwyan", "Pedda", "Pedda"};
        Map<String, Integer> namesVsCount = makeAMap(names, new HashMap<String, Integer>());
        System.out.println(findMostRepeatedName(namesVsCount));
    }

    private static Map<String, Integer> makeAMap(String[] names, HashMap<String, Integer> stringIntegerHashMap) {
        for (String name:names){
            Integer count = stringIntegerHashMap.get(name);
            stringIntegerHashMap.put(name, count == null ? 1 : ++count);
        }
        return  stringIntegerHashMap;
    }

    private static String findMostRepeatedName(Map<String, Integer> namesVsCount) {
        List<Map.Entry<String, Integer>> entries = new LinkedList<Map.Entry<String, Integer>>(namesVsCount.entrySet());
        Collections.sort(entries, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o1.getValue().compareTo(o1.getValue());
            }
        });
        Map<String, Integer> result = new LinkedHashMap<String,Integer>();
        for(Map.Entry<String,Integer> entry : entries){
            result.put(entry.getKey(), entry.getValue());
            System.out.println(entry.getKey()+""+ entry.getValue());
        }
        return entries.getFirst().getKey();
    }
}
