import NotificationAlertObserver from "../Observer/NotificationAlertObserver";
import StocksObservable from "./StocksObservable";
class IphoneObservable implements StocksObservable {
    private observers: NotificationAlertObserver[] = [];
    private stockCount: number = 0;

    add(observer: NotificationAlertObserver): void {
        this.observers.push(observer);
    }

    remove(observer: NotificationAlertObserver): void {
        const index = this.observers.indexOf(observer);
        if (index !== -1) {
            this.observers.splice(index, 1);
        }
    }

    notifySubscribers(): void {
        for (const observer of this.observers) {
            observer.update();
        }
    }

    setStockCount(newStockAdded: number): void {
        if (this.stockCount === 0) {
            this.notifySubscribers();
        }
        this.stockCount += newStockAdded;
    }

    getStockCount(): number {
        return this.stockCount;
    }
}
export default IphoneObservable;