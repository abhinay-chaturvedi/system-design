package ObserverPattern.Observer;
import ObserverPattern.Observable.StocksObservable;

public class MobileAlertObserver implements NotificationAlertObserver {
    String username;
    StocksObservable observable;
    public MobileAlertObserver(String username, StocksObservable observable) {
        this.observable = observable;
        this.username = username;
    }

    @Override
    public void update() {
        sendMsgOnMobile(username, "Product is in stock Hurry Up!");
    }
    private void sendMsgOnMobile(String username, String msg) {
        System.out.println("msg sent to : " + username);
    }
}