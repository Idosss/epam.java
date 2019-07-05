package kz.epam.chess;


public class Queens {
    private int[] chessBoard;

    public Queens(int N) {
            chessBoard = new int[N];
        }

        public boolean canPlaceQueen(int r, int c) {

            for (int i = 0; i < r; i++) {
                if (chessBoard[i] == c || (i - r) == (chessBoard[i] - c) ||(i - r) == (c - chessBoard[i]))
                {
                    return false;
                }
            }
            return true;
        }

        public void printQueens(int[] x) {
            int N = x.length;
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    if (x[i] == j) {
                        System.out.print("Q ");
                    } else {
                        System.out.print("* ");
                    }
                }
                System.out.println();
            }
            System.out.println();
        }

        public void placeNqueens(int r, int n) {
            for (int c = 0; c < n; c++) {
                if (canPlaceQueen(r, c)) {
                    chessBoard[r] = c;
                    if (r == n - 1) {
                        printQueens(chessBoard);
                    } else {
                        placeNqueens(r + 1, n);
                    }
                }
            }
        }

        public void callplaceNqueens() {
            placeNqueens(0, chessBoard.length);
        }

        public static void main(String args[]) {
            Queens Q = new Queens(8);
            Q.callplaceNqueens();

        }
    }





