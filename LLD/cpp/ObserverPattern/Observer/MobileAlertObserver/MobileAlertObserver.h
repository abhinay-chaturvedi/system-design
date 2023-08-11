#pragma once

#include "../../Observable/StocksObservable/StocksObservable.h"
#include "../NotificationAlertObserver/NotificationAlertObserver.h"
#include <string>

class MobileAlertObserver : public NotificationAlertObserver {
public:
    MobileAlertObserver(const std::string& username, StocksObservable* observable);

    void update() override;

private:
    std::string username;
    StocksObservable* observable;

    void sendMsgOnMobile(const std::string& username, const std::string& msg);
};
