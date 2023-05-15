package com.snakeLadder.akhand;

public class Player {
    String playerId;
    int curPosition;

    public Player(String pId, int curPos){
        this.playerId=pId;
        this.curPosition=curPos;
    }
    public String getPlayerId(){return playerId;}
    public int getCurPosition(){return curPosition;}
}
