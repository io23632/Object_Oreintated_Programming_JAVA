package ObjectOrientated;

import java.util.Scanner;

class Game {
    private char[][] board = {{' ', '|', ' ', '|', ' '}, {'-', '+', '-', '+', '-',},
            {' ', '|', ' ', '|', ' '}, {'-', '+', '-', '+','-',},
            {' ', '|', ' ', '|', ' '}, {'-', '+', '-', '+','-',}};



    Game(){

    }
    private char empty = ' ';

    public void printBoard(){
        for (char[] row : board) {
            for (char empty: row) {
                System.out.print(empty);
            }
            System.out.println();
        }
    }

    public void clear(){
        for (char[] row : board) {
            for (char empty: row) {
                System.out.print(empty);
            }
            System.out.println();
        }
    }

    public void playerMove(){
        char row;
        int col;
        char Symbol = 'X';
        boolean turn = true;

        System.out.println("Who's turn is it first? player1 or player2?");
        Scanner scanner = new Scanner(System.in);

        String Player = scanner.next();
        if (Player.equals("player1")) {
            Symbol = 'X';
        }

        else if (Player.equals("player2")) {
            Symbol = 'O';
        }
        else {
            System.out.println("Format of player choice must match exactly as: player1 or player2");
        }

        while (turn) {
            Scanner placement = new Scanner(System.in);
            System.out.println("Select Placement: eg. a1");
            String coordinate = placement.nextLine();
            row = coordinate.charAt(0);
            col = Integer.parseInt("" + coordinate.charAt(1));
            if (row < 'a' || row > 'c') {
                System.out.println("Invalid row" + row );
            }
            if (col <= 0 || col > 3) {
                System.out.println("Invalid col" + col);
            }

            switch (coordinate) {
                case "a1":
                    board[0][0] = Symbol;
                    break;
                case "a2":
                    board[0][2] = Symbol;
                    break;
            }
            printBoard();


        }







    }
}
