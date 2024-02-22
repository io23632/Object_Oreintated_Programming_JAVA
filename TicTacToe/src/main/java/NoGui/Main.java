package NoGui;

import java.security.KeyStore;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String User = "Player1";

        char[][] board = {{' ', '|', ' ', '|', ' '}, {'-', '+', '-', '+', '-',},
                {' ', '|', ' ', '|', ' '}, {'-', '+', '-', '+','-',},
                {' ', '|', ' ', '|', ' '}, {'-', '+', '-', '+','-',}};

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your placement");
        int pos = scanner.nextInt();
        PlaceMark(pos, board, User);

        printBoard(board);
    }

    private static void PlaceMark(int pos, char[][] board, String User) {

        char Symbol;
        if(User.equals("player1")) {
            Symbol = 'X';
        }
        else {
            Symbol = 'O';
        }


        switch (pos) {
            case 1:
                board[0][0] = Symbol;
                break;
            case 2:
                board[0][2] = Symbol;
                break;
            case 3:
                board[0][4] = Symbol;
                break;
            case 4:
                board[2][0] = Symbol;
                break;
            case 5:
                board[2][2] = Symbol;
                break;
            case 6:
                board[2][4] = Symbol;
                break;
            case 7:
                board[4][0] = Symbol;
                break;
            case 8:
                board[4][2] = Symbol;
                break;
            case 9:
                board[4][4] = Symbol;
                break;
        }
    }

    private static void printBoard(char[][] board) {
        for (char[] row : board) {
            for (char c: row) {
                System.out.print(c);
            }
            System.out.println();
        }
    }

}






