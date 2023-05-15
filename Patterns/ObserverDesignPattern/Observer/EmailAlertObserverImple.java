package ObserverDesignPattern.Observer;

import ObserverDesignPattern.Observable.StocksObservable;

public class EmaiAlertObserverImple implements NotificationAlertObserver {
    String emailId;
    StockObservable observable;

    public EmaiAlertObserverImple(String emailId,StockObservable observable){
        this.observable = observable;
        this.emailId = emailId;
    }

    @Overridepublic 
    public void update(){
        sendMail(emailId,msg: "product is in stock hurry up!");
    }

    private void sendMail(String emailId, String msg){

        System.out.println("mail sent to:" + emailId);
    }
}