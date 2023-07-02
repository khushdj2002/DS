package CP;

import java.util.*;




public class Frequency1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       
        String str = input.nextLine();

        String[] strings = str.split(" ");

        Map<String, Integer> frequencyMap = new HashMap<>();

        for (String s : strings) {

            if (frequencyMap.containsKey(s)) {

                frequencyMap.put(s, frequencyMap.get(s) + 1);
            } else {

                frequencyMap.put(s, 1);
            }
        }


        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(frequencyMap.entrySet());

        Collections.sort(entryList, new Comparator<Map.Entry<String, Integer>>() {
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });

        for (Map.Entry<String, Integer> entry : entryList) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}

