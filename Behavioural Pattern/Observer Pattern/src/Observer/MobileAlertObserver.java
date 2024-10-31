package Observer;

import Observable.StockObservable;

public class MobileAlertObserver implements NotificationAlertObserver{
    private String emailId;
    private StockObservable stockObservable;

    public MobileAlertObserver(StockObservable stockObservable, String emailId){
        this.stockObservable = stockObservable;
        this.emailId = emailId;
    }


    @Override
    public void update() {
        sendMessage(emailId, "stock added");
    }
    public void sendMessage(String emailId, String msg){
        System.out.println("mobile alert sent to:" + emailId);
    }
}
