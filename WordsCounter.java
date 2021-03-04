import java.util.*;

public class WordsCounter {
    HashMap<String, Integer> HM;

    public WordsCounter () {
        HM = new HashMap<String, Integer>();
    }

    public void inputScan(String st) {
        String[] strArray = st.toLowerCase().split("\\W+");

        for (String s: strArray) {
            if (HM.containsKey(s)) {
                HM.put(s, HM.get(s) + 1);
            }
            else {
                HM.put(s, 1);
            }
        }

        for (Map.Entry entry : HM.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

    }

}
