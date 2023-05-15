package ObserverDesignPattern.Observable;

import ObserverDesignPattern.Observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneObservableImple implements StocksObservable{

    public List<NotificationAlertObserver> observerList = new ArrayList<>();
    public int stockCount = 10;

    @Override
    public void add(NotificationAlertObserver observer){observerList.add(observer);}

    @Override
    public void remove(NotificationAlertObserver observer){observerList.remove(observer);}

    @Override
    public void notifySubscribers(){

        for(NotificationAlertObserver observer: observerList){
            
            observer.update();
        }
    }

    @Override
    public void setStockCount(int newStockadded){
        if(stockCount == 0){
            notifySubscribers();
        }

        stockCount = stockCount + newStockadded;
    }

    @Override
    public int getStock(){return stockCount;}
}