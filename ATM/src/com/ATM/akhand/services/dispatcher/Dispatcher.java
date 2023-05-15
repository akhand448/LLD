package com.ATM.akhand.services.dispatcher;

public abstract class Dispatcher {

    static int TwoK = 2000;
    static int FiveH = 500;
    static int Hundred = 100;

    Dispatcher nextDispatcher;
    public Dispatcher(Dispatcher dispatcher){
        this.nextDispatcher=dispatcher;
    }

    public void dispatch(int amount){
        if(nextDispatcher!=null){
            nextDispatcher.dispatch(amount);
        }
    }

}
