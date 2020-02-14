import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GOLTester {

    // TEST BOARD #1
    public int[][] array1 = {
            {0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0},
            {0, 1, 1, 1, 0},
            {0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0},
    };

    // TEST BOARD #2
    public int[][] array2 = {
            {0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0},
            {0, 0, 1, 1, 1, 0},
            {0, 1, 1, 1, 0, 0},
            {0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0},
    };

    // TEST BOARD #3
    public int[][] array3 = {
            {0, 0, 0, 0, 0, 0},
            {0, 1, 1, 0, 0, 0},
            {0, 1, 1, 0, 0, 0},
            {0, 0, 0, 1, 1, 0},
            {0, 0, 0, 1, 1, 0},
            {0, 0, 0, 0, 0, 0},
    };

    // TEST BOARD #4
    public int[][] array4 = {
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
    };

    // TEST BOARD #5
    public int[][] array5 = {
            {0, 0, 0, 0, 1},
            {0, 0, 1, 0, 0},
            {0, 0, 0, 1, 0},
            {0, 1, 1, 1, 0},
            {1, 0, 0, 0, 0},
    };

    // TEST BOARD #6
    public int[][] array6 = {
            {1, 0, 0, 0, 1},
            {0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0},
            {1, 1, 0, 0, 0},
            {1, 1, 0, 0, 1},
    };

    // TEST BOARD #7
    public int[][] array7 = {
            {0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0},
    };

    // TEST BOARD #8
    public int[][] array8 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9},
    };

    // TEST BOARD #9
    public int[][] array9 = {
            {1}
    };

    // TEST BOARD #10
    public int[][] array10 = {
            {}
    };



    // **TESTING BOARD #1**

    // STANDARD GAME OF LIFE
    @Test
    // Testing if the method neighbors() returns the correct number of neighbors [Test Case #1]
    public void board_1_test_1() {
        GameOfLife board1 = new GameOfLife(array1);
        assertEquals(2, board1.neighbors(2, 2));
    }

    @Test
    // Testing if the method oneStep() returns the next generation board correctly [Test Case #2]
    public void board_1_test_2() {

        // Expected Array
        int[][] array = {
                {0, 0, 0, 0, 0},
                {0, 0, 1, 0, 0},
                {0, 0, 1, 0, 0},
                {0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0},
        };
        GameOfLife board1 = new GameOfLife(array1);
        board1.oneStep();
        assertArrayEquals(array, board1.getGameBoard());
    }

    @Test
    // Testing if the method evolution() produces the correct generation of board [Test Case #3]
    public void board_1_test_3() {

        // Expected Array
        int[][] array = {
                {0, 0, 0, 0, 0},
                {0, 0, 1, 0, 0},
                {0, 0, 1, 0, 0},
                {0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0},
        };

        GameOfLife board1 = new GameOfLife(array1);
        board1.evolution(5);
        assertArrayEquals(array, board1.getGameBoard());
    }

    // **TESTING BOARD #2**

    // STANDARD GAME OF LIFE
    @Test
    // Testing if the method neighbors() returns the correct number of neighbors [Test Case #4]
    public void board_2_test_1() {
        GameOfLife board2 = new GameOfLife(array2);
        assertEquals(4, board2.neighbors(3, 3));
    }

    @Test
    // Testing if the method oneStep() returns the next generation board correctly [Test Case #5]
    public void board_2_test_2() {

        // Expected Array
        int[][] array = {
                {0, 0, 0, 0, 0, 0},
                {0, 0, 0, 1, 0, 0},
                {0, 1, 0, 0, 1, 0},
                {0, 1, 0, 0, 1, 0},
                {0, 0, 1, 0, 0, 0},
                {0, 0, 0, 0, 0, 0},
        };

        GameOfLife board2 = new GameOfLife(array2);
        board2.oneStep();
        assertArrayEquals(array, board2.getGameBoard());
    }

    @Test
    // Testing if the method evolution() produces the correct generation of board [Test Case #6]
    public void board_2_test_3() {

        // Expected Array
        int[][] array = {
                {0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0},
                {0, 0, 1, 1, 1, 0},
                {0, 1, 1, 1, 0, 0},
                {0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0},
        };
        GameOfLife board2 = new GameOfLife(array2);
        board2.evolution(4);
        assertArrayEquals(array, board2.getGameBoard());
    }

    // TESTING BOARD #3

    // STANDARD GAME OF LIFE
    @Test
    // Testing if the method neighbors() returns the correct number of neighbors [Test Case #7]
    public void board_3_test_1() {
        GameOfLife board3 = new GameOfLife(array3);
        assertEquals(4, board3.neighbors(3, 3));
    }

    @Test
    // Testing if the method oneStep() returns the next generation board correctly [Test Case #8]
    public void board_3_test_2() {

        // Expected Array
        int[][] array = {
                {0, 0, 0, 0, 0, 0},
                {0, 1, 1, 0, 0, 0},
                {0, 1, 0, 0, 0, 0},
                {0, 0, 0, 0, 1, 0},
                {0, 0, 0, 1, 1, 0},
                {0, 0, 0, 0, 0, 0},
        };

        GameOfLife board3 = new GameOfLife(array3);
        board3.oneStep();
        assertArrayEquals(array, board3.getGameBoard());
    }

    @Test
    // Testing if the method evolution() produces the correct generation of board [Test Case #9]
    public void board_3_test_3() {

        // Expected Array
        int[][] array = {
                {0, 0, 0, 0, 0, 0},
                {0, 1, 1, 0, 0, 0},
                {0, 1, 0, 0, 0, 0},
                {0, 0, 0, 0, 1, 0},
                {0, 0, 0, 1, 1, 0},
                {0, 0, 0, 0, 0, 0},
        };

        GameOfLife board3 = new GameOfLife(array3);
        board3.evolution(27);
        assertArrayEquals(array, board3.getGameBoard());
    }

    // TESTING BOARD #4

    // STANDARD GAME OF OF LIFE
    @Test
    // Testing if the method neighbors() returns the correct number of neighbors [Test Case #10]
    public void board_4_test_1() {
        GameOfLife board4 = new GameOfLife(array4);
        assertEquals(3, board4.neighbors(2, 9));
    }

    @Test
    // Testing if the method oneStep() returns the next generation board correctly [Test Case #11]
    public void board_4_test_2() {

        // Expected Array
        int[][] array = {
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
        };
        GameOfLife board4 = new GameOfLife(array4);
        board4.oneStep();
        assertArrayEquals(array, board4.getGameBoard());
    }

    @Test
    // Testing if the method evolution() produces the correct generation of board [Test Case #12]
    public void board_4_test_3() {

        // Expected Array
        int[][] array = {
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
        };
        GameOfLife board4 = new GameOfLife(array4);
        board4.evolution(5);
        assertArrayEquals(array, board4.getGameBoard());
    }

    // TESTING BOARD #5

    // STANDARD GAME OF LIFE
    @Test
    // Testing if the method neighbors() returns the correct number of neighbors [Test Case #13]
    public void boad_5_test_1() {
        GameOfLife board5 = new GameOfLife(array5);
        assertEquals(2, board5.neighbors(3, 3));
    }

    @Test
    // Testing if the method oneStep() returns the next generation board correctly [Test Casse #14]
    public void board_5_test_2() {

        // Expected Array
        int[][] array = {
                {0, 0, 0, 0, 0},
                {0, 0, 0, 1, 0},
                {0, 1, 0, 1, 0},
                {0, 1, 1, 1, 0},
                {0, 1, 1, 0, 0},
        };
        GameOfLife board5 = new GameOfLife(array5);
        board5.oneStep();
        assertArrayEquals(array, board5.getGameBoard());
    }

    @Test
    // Testing if the method evolution() produces the correct generation of board [Test Case #15]
    public void board5_test_3() {

        // Expected Array
        int[][] array = {
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
        };

        GameOfLife board5 = new GameOfLife(array5);
        board5.evolution(25);
        assertArrayEquals(array, board5.getGameBoard());
    }

    // **TESTING TORUS**

    // TESTING BOARD #6

    @Test
    // Testing if Torus neighbors() method return the correct number of neighbors #1 [Test Case #16]
    public void board6_test_1() {
        TorusGameOfLife board6 = new TorusGameOfLife(array6);
        assertEquals(6, board6.neighbors(4, 0));
    }

    @Test
    // Testing if Torus neighbors() method returns the correct number of neighbors #2 [Test Case #17]
    public void board6_test_2() {
        TorusGameOfLife board6 = new TorusGameOfLife(array6);
        assertEquals(4, board6.neighbors(0, 4));
    }

    @Test
    // Testing if Torus neighbors() method returns the correct number of neighbors #3 [Test Case #18]
    public void board6_test_3() {
        TorusGameOfLife board6 = new TorusGameOfLife(array6);
        assertEquals(5, board6.neighbors(4, 4));
    }

    @Test
    // Testing if Torus neighbors() method returns the correct number of neighbors #4 [Test Case #19]
    public void board6_test_4() {
        TorusGameOfLife board6 = new TorusGameOfLife(array6);
        assertEquals(5, board6.neighbors(0, 0));
    }

    @Test
    // Testing if Torus neighbors() method returns the correct number of neighbors #5 [Test Case #20]
    public void board6_test_5() {
        TorusGameOfLife board6 = new TorusGameOfLife(array6);
        assertEquals(3, board6.neighbors(4, 1));
    }

    @Test
    // Testing if Torus oneStep() method returns the next generation board correctly [Test Case #21]
    public void board6_test_6() {

        // Expected Array
        int[][] array = {
                {0, 1, 0, 1, 0},
                {0, 0, 0, 0, 1},
                {0, 0, 0, 0, 0},
                {1, 1, 0, 0, 1},
                {0, 1, 0, 0, 0},
        };

        TorusGameOfLife board6 = new TorusGameOfLife(array6);
        board6.oneStep();
        assertArrayEquals(array, board6.getGameBoard());
    }

    @Test
    // Testing if Torus evolution() method returns the correct generation board [Test Case #22]
    public void board6_test_7() {

        // Expected Array
        int[][] array = {
                {0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 1, 0, 0, 1},
                {0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0},
        };

        TorusGameOfLife board6 = new TorusGameOfLife(array6);
        board6.evolution(4);
        assertArrayEquals(array, board6.getGameBoard());
    }

    // **EDGE CASES**

    // TESTING BOARD #7

    @Test
    // Testing if Torus can handle a rectangular board using oneStep() [Test Case #23]
    public void board7_test_1() {

        // Expected Array
        int[][] array = {
                {0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0},
        };

        TorusGameOfLife board7 = new TorusGameOfLife(array7);
        board7.oneStep();
        assertArrayEquals(array, board7.getGameBoard());
    }

    @Test
    // Testing if Torus can handle a rectangular board using evolution() [Test Case #24]
    public void board7_test_2() {

        // Expected Array
        int[][] array = {
                {0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0},
        };

        TorusGameOfLife board7 = new TorusGameOfLife(array7);
        board7.evolution(5);
        assertArrayEquals(array, board7.getGameBoard());
    }

    // TESTING BOARD #8

    @Test
    // Testing if Torus can handle a board with numbers besides 1 and 0's only using oneStep() [Test Case #25]
    public void board8_test_1() {

        // Expected Array
        int[][] array = {
                {0, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
        };

        TorusGameOfLife board8 = new TorusGameOfLife(array8);
        board8.oneStep();
        assertArrayEquals(array, board8.getGameBoard());
    }

    @Test
    // Testing if Torus can handle a board with numbers besides 1 and 0's only using evolution() [Test Case #26]
    public void board8_test_2() {

        // Expected Array
        int[][] array = {
                {0, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
        };

        TorusGameOfLife board8 = new TorusGameOfLife(array8);
        board8.evolution(5);
        assertArrayEquals(array, board8.getGameBoard());
    }

    @Test
    // Testing if Torus can handle a board with only one integer using oneStep() [Test Case #27]
    public void board9_test_1() {

        // Expected Array
        int[][] array = {
                {0}
        };

        TorusGameOfLife board9 = new TorusGameOfLife(array9);
        board9.oneStep();
        assertArrayEquals(array, board9.getGameBoard());
    }

    @Test
    // Testing if Torus can handle a board with only one integer using evolution() [Test Case #28]
    public void board9_test_2() {

        // Expected Array
        int[][] array = {
                {0}
        };

        TorusGameOfLife board9 = new TorusGameOfLife(array9);
        board9.evolution(5);
        assertArrayEquals(array, board9.getGameBoard());
    }

    @Test
    // Testing if Torus can handle an empty board using oneStep() [Test Case #29]
    public void board10_test_1() {

        // Expected Array
        int[][] array = {
                {}
        };

        TorusGameOfLife board10 = new TorusGameOfLife(array10);
        board10.oneStep();
        assertArrayEquals(array, board10.getGameBoard());
    }

    @Test
    // Testing if Torus can handle an empty board using evolution() [Test Case #30]
    public void board10_test_2() {

        // Expected Array
        int[][] array = {
                {}
        };

        TorusGameOfLife board10 = new TorusGameOfLife(array10);
        board10.evolution(5);
        assertArrayEquals(array, board10.getGameBoard());
    }


}