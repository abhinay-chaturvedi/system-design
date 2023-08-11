// #include "Observer/MobileAlertObserver/MobileAlertObserver.h"
// #include "Observable/StocksObservable/StocksObservable.h"
#include "MobileAlertObserver.h"

#include <iostream> // Include necessary headers for output
#include <string>

MobileAlertObserver::MobileAlertObserver(const std::string& username, StocksObservable* observable)
    : username(username), observable(observable) {}

void MobileAlertObserver::update() {
    sendMsgOnMobile(username, "Product is in stock Hurry Up!");
}

void MobileAlertObserver::sendMsgOnMobile(const std::string& username, const std::string& msg) {
    std::cout << "msg sent to : " << username << std::endl;
}
