package co.projectcodex.sortandswap;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import static co.projectcodex.sortandswap.SwapMe.*;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SwapMeTest {


    @Test
    @Order(1)
    public void swapFirstWithSecondShouldWork() {

        String[] testSetOne = {"pear", "apple", "mango", "banana"};
        String[] testSetTwo = {"blue", "yellow", "orange", "red"};

        String[] testResultsOne = swapFirstWithSecond(testSetOne);

        assertEquals("apple", testResultsOne[0]);
        assertEquals("pear", testResultsOne[1]);

        String[] testResultsTwo = swapFirstWithSecond(testSetTwo);

        assertEquals("yellow", testResultsTwo[0]);
        assertEquals("blue", testResultsTwo[1]);

    }

    @Test()
    @Order(2)
    public void swapFirstWithLastShouldWork() {

        String[] testSetOne = {"pear", "apple", "mango", "banana"};

        String[] testResultsOne = swapFirstWithLast(testSetOne);

        assertEquals("banana", testResultsOne[0]);
        assertEquals("pear", testResultsOne[testResultsOne.length - 1]);

        String[] testSetTwo = {"blue", "yellow", "orange", "red"};

        String[] testResultsTwo = swapFirstWithLast(testSetTwo);

        assertEquals("red", testResultsTwo[0]);
        assertEquals("blue", testResultsTwo[testResultsOne.length - 1]);

    }

    @Test
    @Order(3)
    public void swapNeighboursShouldWork() {

        int [] testSetOne = {5, 19, 7, 17, 6, 1, 3};
        int [] testResultsOne = swapNeighbours(testSetOne);
        assertArrayEquals(new int[] {5,7, 17, 6, 1, 3, 19}, testResultsOne);

        int[] testSetTwo = {89, 3, 21, 7, 12, 8 };
        int [] testResultsTwo = swapNeighbours(testSetTwo);
        assertArrayEquals(new int[] {3, 21, 7, 12, 8, 89}, testResultsTwo);

        int [] testSetThree = {6, 5, 7, 17, 1, 3};
        int [] testResultsThree = swapNeighbours(testSetThree);
        assertArrayEquals(new int[] {5 ,6 , 7, 1, 3, 17}, testResultsThree);
    }
    @Test
    @Order(4)
    public void bubbleLoopNumberShouldWork() {

        int [] testSetOne = {5, 19, 7, 17, 6, 1, 3};
        int [] testResultsOne = bubbleLoopNumber(testSetOne);
        assertArrayEquals(new int[] {1 ,3 ,5 ,6, 7, 17, 19}, testResultsOne);

        int[] testSetTwo = {89, 3, 21, 7, 12, 8 };
        int [] testResultsTwo = bubbleLoopNumber(testSetTwo);
        assertArrayEquals(new int[] {3, 7, 8, 12, 21, 89}, testResultsTwo);

        int [] testSetThree = {6, 5, 7, 17, 1, 3};
        int [] testResultsThree = bubbleLoopNumber(testSetThree);
        assertArrayEquals(new int[] {1, 3 ,5 ,6 ,7, 17}, testResultsThree);
    }
    @Test
    @Order(5)
    public void selectionLoopNumberShouldWork() {

        int [] testSetOne = {5, 19, 7, 17, 6, 1, 3};
        int [] testResultsOne = selectionSortNumber(testSetOne);
        assertArrayEquals(new int[] {1 ,3 ,5 ,6, 7, 17, 19}, testResultsOne);

        int[] testSetTwo = {89, 3, 21, 7, 12, 8 };
        int [] testResultsTwo = selectionSortNumber(testSetTwo);
        assertArrayEquals(new int[] {3, 7, 8, 12, 21, 89}, testResultsTwo);

        int [] testSetThree = {6, 5, 7, 17, 1, 3};
        int [] testResultsThree = selectionSortNumber(testSetThree);
        assertArrayEquals(new int[] {1, 3 ,5 ,6 ,7, 17}, testResultsThree);
    }
}
