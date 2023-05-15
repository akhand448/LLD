package com.ATM.akhand.services.dispatcher;

public class TwoKDispatcher extends Dispatcher{

    public TwoKDispatcher(Dispatcher nextDispatcher){
        super(nextDispatcher);
    }
    public void dispatch(int amount){
        if(amount>=TwoK){
            
        }
    }
}
