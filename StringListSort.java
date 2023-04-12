import java.util.ArrayList;
import java.util.Arrays;

public class StringListSort {

    public static int unorderedSearch(ArrayList<String> items, String term) {
        return 0;
    }

    public static void selectionSort(ArrayList<String> items) {
        for (int i = 0; i < items.size(); i++) {
            String minVal = items.get(i);
            int minDex = i;

            for (int l = i + 1; l < items.size(); l++) {
                if (items.get(l).compareTo(items.get(i)) < 0) {
                    minVal = items.get(l);
                    minDex = l;
                }
            }
            String tmp = items.get(i);
            items.set(i, minVal);
            items.set(minDex, tmp);
            //System.out.println(items);
            ;
        }
    }

    public static void insertionSort(ArrayList<String> items) {
        for (int i = 1; i < items.size(); i++) {
            int l = i;
            while (l > 0 && items.get(l - 1).compareTo(items.get(l)) > 0) {
                String tmp = items.get(l - 1);
                items.set(l - 1, items.get(l));
                items.set(l, tmp);
                l--;
                //System.out.println(items);
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<String> inputItems = new ArrayList<String>(Arrays.asList("d", "b", "a", "c"));
        selectionSort(inputItems);

        // ArrayList<String> inputItems = new ArrayList<String>(Arrays.asList("d", "b", "c", "a"));
        // insertionSort(inputItems);
    }
}