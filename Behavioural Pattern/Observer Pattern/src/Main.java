import Observable.IPhoneStockObservable;
import Observable.StockObservable;
import Observer.EmailAlertObserver;
import Observer.MobileAlertObserver;
import Observer.NotificationAlertObserver;

public class Main {
    public static void main(String[] args) {
        StockObservable stockObservable = new IPhoneStockObservable();
        NotificationAlertObserver observer1 = new EmailAlertObserver(stockObservable, "xyz@gmail.com");
        NotificationAlertObserver observer2 = new EmailAlertObserver(stockObservable, "abc@gmail.com");
        NotificationAlertObserver observer3 = new MobileAlertObserver(stockObservable, "mobile@gmail.com");
        stockObservable.add(observer1);
        stockObservable.add(observer2);
        stockObservable.add(observer3);
        stockObservable.setStockCount(10);
        stockObservable.setStockCount(100);
        System.out.println(stockObservable.getStockCount());

    }
}