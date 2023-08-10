package ObserverPattern.Observer;
import ObserverPattern.Observable.StocksObservable;

public class EmailAlertObserver implements NotificationAlertObserver {
    String emailId;
    StocksObservable observable;
    public EmailAlertObserver(String emailId, StocksObservable observable) {
        this.observable = observable;
        this. emailId = emailId;
    }

    @Override
    public void update() {
        sendMail(emailId, "Product is in stock Hurry Up!");
    }
    private void sendMail(String emailId, String msg) {
        System.out.println("mail sent to : " + emailId);
    }
}