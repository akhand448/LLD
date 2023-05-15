package com.snakeLadder.akhand;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Board {

    public Cell[][] cells;

    public Board(int boardSize, int noOfSnakes, int noOfLadders){
        initialiseCells(boardSize);
        addSnakesLadders(cells,noOfSnakes,noOfLadders,boardSize);
    }
    private void initialiseCells(int boardSize){

        cells = new Cell[boardSize][boardSize];
        for(int i=0;i<boardSize;i++){
            for(int j=0;j<boardSize;j++){
                Cell newCell = new Cell();
                cells[i][j] = newCell;
            }
        }
    }
    private void addSnakesLadders(Cell[][]cells, int numberOfSnakes,int numberOfLadders,int boardSize){

        while(numberOfSnakes>0){

            int startIdx = ThreadLocalRandom.current().nextInt(1, cells.length* cells.length-1);
            int endIdx = ThreadLocalRandom.current().nextInt(1, cells.length* cells.length-1);;
            if(startIdx==0 || (endIdx>=startIdx)){continue;}

            int row = startIdx/boardSize;
            int col = startIdx%boardSize;

            Jump jump = new Jump();
            jump.start = startIdx;
            jump.end = endIdx;
            cells[row][col].jump=jump;

            numberOfSnakes--;
        }

        while(numberOfLadders>0){
            int startIdx = ThreadLocalRandom.current().nextInt(1, cells.length* cells.length-1);
            int endIdx = ThreadLocalRandom.current().nextInt(1, cells.length* cells.length-1);

            if(startIdx==0 || (startIdx>=endIdx)){continue;}

            int row = startIdx/boardSize;
            int col = startIdx%boardSize;

            Jump jump = new Jump();
            jump.start = startIdx;
            jump.end = endIdx;
            cells[row][col].jump=jump;

            numberOfLadders--;

        }
    }

}
