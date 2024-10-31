package Observable;

import Observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class IPhoneStockObservable implements StockObservable{
    private int stockCount = 0;
    private List<NotificationAlertObserver> userList = new ArrayList<>();

    @Override
    public void add(NotificationAlertObserver observer){
        userList.add(observer);
    }

    @Override
    public void remove(NotificationAlertObserver observer) {
        userList.remove(observer);
    }

    @Override
    public void notifySubscriber() {
        for(NotificationAlertObserver observer: userList){
            observer.update();
        }
    }

    @Override
    public void setStockCount(int newStockAdded) {
        if(stockCount == 0){
            notifySubscriber();
        }
        stockCount += newStockAdded;
    }

    @Override
    public int getStockCount() {
        return stockCount;
    }
}
