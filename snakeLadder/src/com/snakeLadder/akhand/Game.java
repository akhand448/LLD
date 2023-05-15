package com.snakeLadder.akhand;

import java.util.ArrayDeque;
import java.util.Deque;

public class Game {
    Dice dice;
    Board board;
    Deque<Player>players = new ArrayDeque<Player>();

    int boardSize;

    Player winner;
    public Game(int noOfDices,int boardSize,int noOfPlayers,int noSnake,int noLadder){
        this.dice = new Dice(noOfDices);
        this.board = new Board(boardSize,noSnake,noLadder);
        addPlayer(noOfPlayers);
        this.winner=null;
        this.boardSize=boardSize;
    }

    public void addPlayer(int noOfPlayers){
        for(int i=0;i<noOfPlayers;i++){
            int n=i+1;
            players.add(new Player("P"+n,0));
        }
    }

    public void startGame(){

        while(winner==null){

            Player playersTurn = findPlayerTurn();
            System.out.println("This is "+playersTurn.playerId+" 's Turn and it's current position is: "+playersTurn.curPosition);

            int newPostion = playersTurn.curPosition+ dice.rollDice();

            newPostion = checkJump(newPostion);
            playersTurn.curPosition=newPostion;
            System.out.println("This is "+playersTurn.playerId+" 's Turn and it's new position is: "+newPostion);
            if(newPostion>=(boardSize*boardSize-1)){winner = playersTurn;}

        }

        System.out.println("Winner is: "+winner.playerId);
    }

    public Player findPlayerTurn(){
        Player playerTurn = players.removeFirst();
        players.addLast(playerTurn);
        return playerTurn;
    }

    int checkJump(int newPosition){

        int r = newPosition/10;
        int c = newPosition%10;
        if((newPosition>=(boardSize*boardSize)) || (board.cells[r][c].jump==null)) {return newPosition;}
        else{
            String jumpBy = (board.cells[r][c].jump.start<board.cells[r][c].jump.end)?"Ladder" : "Snake";
            System.out.println("Jump done by: "+jumpBy);
            return board.cells[r][c].jump.end;
        }
//        return newPosition;
    }


}
