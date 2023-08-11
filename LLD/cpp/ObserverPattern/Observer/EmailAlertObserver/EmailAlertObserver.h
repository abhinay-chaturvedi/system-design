#pragma once
#include "../../Observable/StocksObservable/StocksObservable.h"
#include "../NotificationAlertObserver/NotificationAlertObserver.h"
using namespace std;
#include <string>
class EmailAlertObserver : public NotificationAlertObserver {
public:
    EmailAlertObserver(const std::string& emailId, StocksObservable* observable);

    void update() override;

private:
    std:: string emailId;
    StocksObservable* observable;

    void sendMail(const std::string& emailId, const std::string& msg);
};
