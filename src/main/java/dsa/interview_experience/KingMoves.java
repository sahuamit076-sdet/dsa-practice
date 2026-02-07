package dsa.interview_experience;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/queens-that-can-attack-the-king/description/
public class KingMoves {

    public static void main(String[] args) {
        int[] bk = {5, 2};
        int[] wq = {1, 6};
        int[] wkn = {3, 2};

        List<List<Integer>> moves = findPossibleKingMoves(bk, wq, wkn);
        System.out.println(moves);
    }

    static List<List<Integer>> findPossibleKingMoves(int[] bk, int[] wq, int[] wkn) {

        List<List<Integer>> moves = new ArrayList<>();

        int x = -1;
        while (x <= 1) {
            int y = -1;
            while (y <= 1) {
                if (!(x == 0 && y == 0)) {
                    int column = bk[0] + x;
                    int row = bk[1] + y;
                    if (inBoundary(column, row)
                            && !canQueenReach(wq, column, row)
                            && !canKnightReach(wkn, column, row)
                            && !isOccupied(wq, wkn, column, row))
                        moves.add(List.of(column, row));
                }
                y++;
            }
            x++;
        }

        return moves;
    }

    private static boolean inBoundary(int column, int row) {
        return column >= 0 && column <= 7 && row >= 0 && row <= 7;
    }

    private static boolean canQueenReach(int[] wq, int column, int row) {
        int columnDiff = wq[0] - column;
        int rowDiff = wq[1] - row;

        return columnDiff == 0 ||
                rowDiff == 0 ||
                Math.abs(columnDiff) == Math.abs(rowDiff);
    }

    private static boolean canKnightReach(int[] wkn, int column, int row) {
        int columnDiff = Math.abs(wkn[0] - column);
        int rowDiff = Math.abs(wkn[1] - row);

        return (columnDiff == 2 && rowDiff == 1) ||
                (columnDiff == 1 && rowDiff == 2);
    }

    private static boolean isOccupied(int[] wq, int[] wkn, int column, int row) {
        return (column == wq[0] && row == wq[1]) ||
                (column == wkn[0] && row == wkn[1]);
    }
}
