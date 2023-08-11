// #include <iostream>
#include <list> // Include necessary headers

// class NotificationAlertObserver;
#include "../StocksObservable/StocksObservable.h"

class IphoneObservable : public StocksObservable {
public:
    IphoneObservable();
    void add(NotificationAlertObserver* observer);
    void remove(NotificationAlertObserver* observer);
    void notifySubscriber();
    void setStockCount(int newStockAdded);
    int getStockCount();

private:
    std::list<NotificationAlertObserver*> observerList;
    int stockCount;
};