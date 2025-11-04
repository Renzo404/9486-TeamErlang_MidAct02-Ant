package string.M79_WordSearch;

public class WordSearch {

    public boolean exist(char[][] board, String word) {
        int rows = board.length, cols = board[0].length;
        boolean[][] visited = new boolean[rows][cols];

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if (dfs(board, word, 0, r, c, visited)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean dfs(char[][] board, String word, int index, int r, int c, boolean[][] visited) {
        if (index == word.length()) return true;
        if (r < 0 || c < 0 || r >= board.length || c >= board[0].length) return false;
        if (visited[r][c] || board[r][c] != word.charAt(index)) return false;

        visited[r][c] = true;
        boolean found = dfs(board, word, index + 1, r + 1, c, visited)
                     || dfs(board, word, index + 1, r - 1, c, visited)
                     || dfs(board, word, index + 1, r, c + 1, visited)
                     || dfs(board, word, index + 1, r, c - 1, visited);
        visited[r][c] = false;
        return found;
    }

    // Optional manual test
    public static void main(String[] args) {
        WordSearch solver = new WordSearch();
        char[][] board = {
            {'A', 'B', 'C', 'E'},
            {'S', 'F', 'C', 'S'},
            {'A', 'D', 'E', 'E'}
        };
        System.out.println(solver.exist(board, "ABCCED")); // true
        System.out.println(solver.exist(board, "SEE"));    // true
        System.out.println(solver.exist(board, "ABCB"));   // false
    }
}
