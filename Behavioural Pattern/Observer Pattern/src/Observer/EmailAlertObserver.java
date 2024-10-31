package Observer;

import Observable.StockObservable;

public class EmailAlertObserver implements NotificationAlertObserver{
    private String emailId;
    StockObservable stockObservable;

    public EmailAlertObserver(StockObservable stockObservable, String emailId){
        this.emailId = emailId;
        this.stockObservable = stockObservable;
    }
    @Override
    public void update() {
        sendMessage(emailId, "stock updated");
    }
    public void sendMessage(String emailId, String msg){
        System.out.println("email sent to: " + emailId);
    }
}
