package ObserverDesignPattern.Observer;

import ObserverDesignPattern.Observable.StockObservable;

public class MobileAlertObserverImple implements NotificationAlertObserver {

    String mobileNo;
    StockObservable observable;

    public MobileAlertObserverImple(String mobileNo, StockObservable observable){
        this.mobileNo = mobileNo;
        this.observable = observable;
    }

    @Override
    public void update(){

        sendMsg(mobileNo, msg:"product is in the stock hurry up!");
    }

    private void sendMsg(String mobileNo, String msg){

        System.out.println("message is send to:" + mobileNo);
    }
}