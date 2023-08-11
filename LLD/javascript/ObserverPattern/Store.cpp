#include <iostream>
using namespace std;
#include "Observable/IphoneObservable/IphoneObservable.h"
#include "Observable/StocksObservable/StocksObservable.h"
#include "Observer/EmailAlertObserver/EmailAlertObserver.h"
#include "Observer/MobileAlertObserver/MobileAlertObserver.h"
#include "Observer/NotificationAlertObserver/NotificationAlertObserver.h"
// #include "test/test.h"
int main() {
    StocksObservable* iphoneStockObservable = new IphoneObservable();

    NotificationAlertObserver* observer1 = new EmailAlertObserver("abc1@gmail.com", iphoneStockObservable);
    NotificationAlertObserver* observer2 = new EmailAlertObserver("abc2@gmail.com", iphoneStockObservable);
    NotificationAlertObserver* observer3 = new MobileAlertObserver("abc1@username", iphoneStockObservable);

    iphoneStockObservable->add(observer1);
    iphoneStockObservable->add(observer2);
    iphoneStockObservable->add(observer3);

    iphoneStockObservable->setStockCount(10);

    // Clean up memory
    delete observer1;
    delete observer2;
    delete observer3;
    delete iphoneStockObservable;
    cout<<"hello world";
    
    return 0;
}
