// #include "ObserverPattern/Observable/IphoneObservable.h"
#include "IphoneObservable.h"
// #include "Observer/NotificationAlertObserver/NotificationAlertObserver.h" // Include necessary headers

IphoneObservable::IphoneObservable() : stockCount(0) {}

void IphoneObservable::add(NotificationAlertObserver* observer) {
    observerList.push_back(observer);
}

void IphoneObservable::remove(NotificationAlertObserver* observer) {
    observerList.remove(observer);
}

void IphoneObservable::notifySubscriber() {
    for (NotificationAlertObserver* observer : observerList) {
        observer->update();
    }
}

void IphoneObservable::setStockCount(int newStockAdded) {
    if (stockCount == 0) {
        notifySubscriber();
    } 
    stockCount += newStockAdded;
}

int IphoneObservable::getStockCount() {
    return stockCount;
}
