import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

public class StringListSortTest {
    @Test
    public void testSelectionSort() {
        ArrayList<String> inputItems;
        ArrayList<String> expectedOutput;

        inputItems = new ArrayList<String>(Arrays.asList("d", "b", "a", "c", "g", "h", "e", "f"));
        expectedOutput = new ArrayList<String>(Arrays.asList("a", "b", "c", "d", "e", "f", "g", "h"));
        StringListSort.selectionSort(inputItems);
        assertEquals(expectedOutput, inputItems);
    }

    @Test
    public void testInsertionSort() {
        ArrayList<String> inputItems;
        ArrayList<String> expectedOutput;

        inputItems = new ArrayList<String>(Arrays.asList("d", "a", "b", "c"));
        expectedOutput = new ArrayList<String>(Arrays.asList("a", "b", "c", "d"));
        StringListSort.insertionSort(inputItems);
        assertEquals(expectedOutput, inputItems);
    }
}
