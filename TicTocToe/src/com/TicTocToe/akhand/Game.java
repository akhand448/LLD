package com.TicTocToe.akhand;

import com.TicTocToe.akhand.piece.PieceO;
import com.TicTocToe.akhand.piece.PieceType;
import com.TicTocToe.akhand.piece.PieceX;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Game {

    Deque<Player>players;
    Board gameBoard;

    public Game(){
        initializeGame();
    }

    public void initializeGame(){

        players = new LinkedList<>();

        PieceX crossPiece = new PieceX();
        Player player1 = new Player("Player1",crossPiece);

        PieceO knotPiece = new PieceO();
        Player player2 = new Player("Player2",knotPiece);

        players.add(player1);
        players.add(player2);

        gameBoard = new Board(3);
    }

    public String startGame(){

        boolean noWinner = true;
        while(noWinner){

            Player playerTurn = players.removeFirst();

            gameBoard.printBoard();
            List<List<Integer>>freeSpaces = gameBoard.getFreeCells();
            if(freeSpaces.isEmpty()){
                noWinner = false;
                continue;
            }

            System.out.print("Player: " + playerTurn.name + ", Enter row, column: ");
            try (Scanner inputScanner = new Scanner(System.in)) {
                String s = inputScanner.nextLine();
                String[] values = s.split(",");
                int inputRow = Integer.valueOf(values[0]);
                int inputColumn = Integer.valueOf(values[1]);

                boolean pieceAddedSuccessFully = gameBoard.addPiece(inputRow,inputColumn,playerTurn.playingPiece);
                if(!pieceAddedSuccessFully){

                    System.out.println("Incorrect position chosen, try again");
                    players.addFirst(playerTurn);
                    continue;
                }
                players.addLast(playerTurn);
                boolean winner = isThereWinner(inputRow,inputColumn,playerTurn.playingPiece.type);
                if(winner){
                    return playerTurn.name;
                }
            } catch (NumberFormatException e) {
                
                e.printStackTrace();
            }
        }
        return "tie";
    }

    public boolean isThereWinner(int row, int column, PieceType pieceType){
         boolean rowMatch = true;
         boolean columnMatch = true;
         boolean diagonalMatch = true;
         boolean antiDiagonalMatch = true;

         for(int i=0;i< gameBoard.size;i++){
             if(gameBoard.board[row][i] == null || gameBoard.board[row][i].type!=pieceType){
                 rowMatch=false;
             }
         }
        for(int i=0;i< gameBoard.size;i++){
            if(gameBoard.board[i][column] == null || gameBoard.board[i][column].type!=pieceType){
                columnMatch=false;
            }
        }
        for(int i=0, j=0;i< gameBoard.size;i++,j++){
            if(gameBoard.board[i][j] == null || gameBoard.board[i][j].type!=pieceType){
                diagonalMatch=false;
            }
        }
        for(int i=0, j= gameBoard.size-1;i< gameBoard.size;i++,j--){
            if(gameBoard.board[i][j] == null || gameBoard.board[i][j].type!=pieceType){
                antiDiagonalMatch=false;
            }
        }

        return rowMatch || columnMatch || diagonalMatch || antiDiagonalMatch;
    }
}
