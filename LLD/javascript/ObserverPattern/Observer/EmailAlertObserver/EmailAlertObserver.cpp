#include "EmailAlertObserver.h"
// #include "Observable/StocksObservable/StocksObservable.h"

#include <iostream> // Include necessary headers for output
using namespace std;
EmailAlertObserver::EmailAlertObserver(const std::string& emailId, StocksObservable* observable)
    : emailId(emailId), observable(observable) {}

void EmailAlertObserver::update() {
    sendMail(emailId, "Product is in stock Hurry Up!");
}

void EmailAlertObserver::sendMail(const std::string& emailId, const std::string& msg) {
    std::cout << "mail sent to : " << emailId << std::endl;
}
