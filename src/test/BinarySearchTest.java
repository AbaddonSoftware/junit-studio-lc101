package test;

import main.BonusBinarySearch;
import org.junit.Test;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class BinarySearchTest {
    private final int[] sortedNoDuplicates = {0, 1, 2, 3, 4, 8, 55, 82};
    private final List<Integer> sortedNoDuplicatesAsArrayList = new ArrayList<>(Arrays.asList(0, 1, 2, 3, 4, 8, 55, 82));

    @Test
    public void returnsAnIndex() {
        assertEquals(sortedNoDuplicatesAsArrayList.indexOf(2), BonusBinarySearch.binarySearch(sortedNoDuplicates, 2));
    }

    @Test
    public void returnsNegativeOneIfNumberNotFound() {
        assertEquals(BonusBinarySearch.binarySearch(sortedNoDuplicates, 54), -1);
    }

}
