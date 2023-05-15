package ObserverDesignPattern;

import ObserverDesignPattern.Observable.StocksObservable;
import ObserverDesignPattern.Observable.IphoneObservableImple;
import ObserverDesignPattern.Observer.NotificationAlertObserver;
import ObserverDesignPattern.Observer.EmaiAlertObserverImple;
import ObserverDesignPattern.Observer.MobileAlertObserverImple;

public class Store{
 
    public static void main(String arg[]){

        StocksObservable iphoneStockObservable = new IphoneObservableImple();

        NotificationAlertObserver observer1 = new EmaiAlertObserverImple(emailId:"xyz1@gmail.com",iphoneStockObservable);
        NotificationAlertObserver observer2 = new EmaiAlertObserverImple(emailId:"xyz2@gmail.com",iphoneStockObservable);
        NotificationAlertObserver observer3 = new MobileAlertObserverImple(mobileNo:"99XXXXXXXX",iphoneStockObservable);

        iphoneStockObservable.add(observer1);
        iphoneStockObservable.add(observer2);
        iphoneStockObservable.add(observer3);

        iphoneStockObservable.setStockCount(10);
    }
}