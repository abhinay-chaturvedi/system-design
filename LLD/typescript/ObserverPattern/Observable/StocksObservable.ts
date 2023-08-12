import NotificationAlertObserver from "../Observer/NotificationAlertObserver";
interface StocksObservable {
    add(observer: NotificationAlertObserver): void;
    remove(observer: NotificationAlertObserver): void;
    notifySubscribers(): void;
    setStockCount(newStockAdded: number): void;
    getStockCount(): number;
}
export default StocksObservable;