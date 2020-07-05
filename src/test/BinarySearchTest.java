package test;

import main.BonusBinarySearch;
import org.junit.Before;
import org.junit.Test;

import java.util.List;
import java.util.ArrayList;

import static org.junit.Assert.*;

public class BinarySearchTest {
    private final int[] sortedNoDuplicates = {2, 3, 4, 6, 8, 9, 55, 82};
    private final List<Integer> sortedNoDuplicatesAsArrayList = new ArrayList<>();

    @Before
    public void loadList() {
        for(int number : sortedNoDuplicates) {
         sortedNoDuplicatesAsArrayList.add(number);
        }
    }

    @Test
    public void returnsAnIndex() {
        assertEquals(sortedNoDuplicatesAsArrayList.indexOf(4), BonusBinarySearch.binarySearch(sortedNoDuplicates, 4));
    }

    @Test
    public void returnsNegativeOneIfNumberNotFound() {
        assertEquals(-1, BonusBinarySearch.binarySearch(sortedNoDuplicates, 54));
    }

    @Test
    public void locatesIfRightMost() {
        int length = sortedNoDuplicates.length - 1;
        int rightMostElement = sortedNoDuplicatesAsArrayList.get(length);
        assertEquals(sortedNoDuplicatesAsArrayList.indexOf(rightMostElement), BonusBinarySearch.binarySearch(sortedNoDuplicates, 82));
    }

    @Test
    public void locatesIfLeftMost() {
        int leftMostElement = sortedNoDuplicatesAsArrayList.get(0);
        assertEquals(sortedNoDuplicatesAsArrayList.indexOf(leftMostElement), BonusBinarySearch.binarySearch(sortedNoDuplicates, 2));
    }

}
