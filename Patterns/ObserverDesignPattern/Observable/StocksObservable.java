package ObserverDesignPattern.Observable;

import ObserverDesignPattern.Observer.NotificationAlertObserver;

public interface StocksObservable{

    public void add(NotificationAlertObserver observer);

    public void remove(NotificationAlertObserver obsrever);

    public void notifySubscribers();

    public void setStockCount(int newStockadded);

    public int getStock();
}