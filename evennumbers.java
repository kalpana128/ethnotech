import java.util.LinkedHashMap;

public class evennumbers {
    public static void main(String[] args) {
        LinkedHashMap<Integer, Integer> evenMap = new LinkedHashMap<>();

        for (int i = 2; i <= 10; i += 2) {
            evenMap.put(i / 2, i); // key, value
        }

        System.out.println(evenMap);
    }
}