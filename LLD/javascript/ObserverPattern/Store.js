
const StocksObservable = require('./Observable/StocksObservable');
const EmailAlertObserver = require('./Observer/EmailAlertObserver');
const MobileAlertObserver = require('./Observer/MobileAlertObserver');

const iphoneStockObservable = new StocksObservable();

const observer1 = new EmailAlertObserver('abc1@gmail.com', iphoneStockObservable);
const observer2 = new EmailAlertObserver('abc2@gmail.com', iphoneStockObservable);
const observer3 = new MobileAlertObserver('abc1@username', iphoneStockObservable);

iphoneStockObservable.add(observer1);
iphoneStockObservable.add(observer2);
iphoneStockObservable.add(observer3);

iphoneStockObservable.setStockCount(10);
