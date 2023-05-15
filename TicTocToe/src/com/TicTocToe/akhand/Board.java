package com.TicTocToe.akhand;

import com.TicTocToe.akhand.piece.PieceType;
import com.TicTocToe.akhand.piece.PlayingPiece;

import java.util.ArrayList;
import java.util.List;


public class Board {
    int size;
    PlayingPiece[][] board;
    public Board(int size){
        this.size=size;
        this.board = new PlayingPiece[size][size];
    }

    public boolean addPiece(int row, int column,PlayingPiece playingPiece){
        if(board[row][column]!=null){
            return false;
        }
        board[row][column]=playingPiece;
        return true;
    }

    public List<List<Integer>> getFreeCells(){
        List<List<Integer>> freeCells = new ArrayList<List<Integer>>();

        for(int i=0; i<size;i++){
            for(int j=0;j<size;j++){
                if(board[i][j]==null){
                    List<Integer>rowColumn = new ArrayList<>();
                    rowColumn.add(i);rowColumn.add(j);
                    freeCells.add(rowColumn);
                }
            }
        }
        return freeCells;
    }

    public void printBoard(){
        String wall = "\u001B[36m";
        for(int i=0;i<size;i++){
            for(int j=0;j<2*size +1;j++){
                System.out.print(wall+"- ");
            }
            System.out.println();
            for(int j=0;j<size;j++){
                System.out.print(wall+"| ");
                String pieceColor;

                if(board[i][j]!=null){
                    if(board[i][j].type==PieceType.o){pieceColor="\u001B[33m";}
                    else {pieceColor="\u001B[31m";}
                    System.out.print(pieceColor+board[i][j].type+" ");
                }
                else{System.out.print("  ");}
            }
            System.out.print(wall+"| ");
            System.out.println();
        }
        for(int j=0;j<2*size +1;j++){
            System.out.print(wall+"- ");
        }
    }

}
