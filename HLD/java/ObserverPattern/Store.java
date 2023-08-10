package ObserverPattern;

import ObserverPattern.Observable.IphoneObservable;
import ObserverPattern.Observable.StocksObservable;
import ObserverPattern.Observer.EmailAlertObserver;
import ObserverPattern.Observer.MobileAlertObserver;
import ObserverPattern.Observer.NotificationAlertObserver;

public class Store {

    public static void main(String args[]) {
        StocksObservable iphoneStockObservable = new IphoneObservable();

        NotificationAlertObserver observer1 = new EmailAlertObserver("abc1@gmail.com", iphoneStockObservable);
        NotificationAlertObserver observer2 = new EmailAlertObserver("abc2@gmail.com", iphoneStockObservable);
        NotificationAlertObserver observer3 = new MobileAlertObserver("abc1@username", iphoneStockObservable);

        iphoneStockObservable.add(observer1);
        iphoneStockObservable.add(observer2);
        iphoneStockObservable.add(observer3);

        iphoneStockObservable.setStockCount(10);
    } 
}
///dlkjkdj