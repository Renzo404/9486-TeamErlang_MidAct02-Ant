package test.java;

import Aquino_Barrera.M79_WordSearch.WordSearch;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class WordSearchTest {
    private final WordSearch solver = new WordSearch();

    @Test
    void testExist_trueCases() {
        char[][] board = {
            {'A', 'B', 'C', 'E'},
            {'S', 'F', 'C', 'S'},
            {'A', 'D', 'E', 'E'}
        };
        assertTrue(solver.exist(board, "ABCCED"));
        assertTrue(solver.exist(board, "SEE"));
    }

    @Test
    void testExist_falseCases() {
        char[][] board = {
            {'A', 'B'},
            {'C', 'D'}
        };
        assertFalse(solver.exist(board, "ABCD"));
    }

    @Test
    void testExist_edgeCases() {
        char[][] board = {{'A'}};
        assertTrue(solver.exist(board, "A"));
        assertFalse(solver.exist(board, "B"));
    }
}
