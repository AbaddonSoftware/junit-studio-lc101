package main;

public class BonusBinarySearch {

    /**
     * A binary search implementation for integer arrays.
     *
     * Info about binary search: https://www.geeksforgeeks.org/binary-search/
     * Please note this version does not returns an arbitrary index when working
     * with int[] with duplicate integers.
     *
     * @param sortedNumbers - must be sorted from least to greatest
     * @param searchedNumber - number to search for
     * @return index of search item if it's found, -1 if not found
     */
//    public static int binarySearch(int[] sortedNumbers, int searchedNumber) {
//        int left = 0;
//        int right = sortedNumbers.length - 1;
//        int mid;
//        while (left <= right) {
//            mid = (left + right) / 2;
//            if (sortedNumbers[mid] < searchedNumber) {
//                left = mid + 1;
//            } else if (sortedNumbers[mid] > searchedNumber) {
//                right = mid - 1;
//            } else {
//                return mid;
//            }
//        }
//        return -1;
//    }

    public static int binarySearch(int[] sortedNumbers, int searchedNumber) {
        int left = 0;
        int right = sortedNumbers.length - 1;
        int middle;
        int compareResult;
        while (left <= right) {
            middle = (left + right) / 2;
            compareResult = Integer.compare(0, sortedNumbers[middle] - searchedNumber);
            switch(compareResult) {
                case 1:
                    left = middle + 1;
                    break;
                case -1:
                    right = middle - 1;
                    break;
                case 0:
                    return middle;
            }
        }
        return -1;
    }

}
