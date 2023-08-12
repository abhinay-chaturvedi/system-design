class StocksObservable {
    constructor() {
        this.observers = [];
        this.stockCount = 0;
    }

    add(observer) {
        this.observers.push(observer);
    }

    remove(observer) {
        const index = this.observers.indexOf(observer);
        if (index !== -1) {
            this.observers.splice(index, 1);
        }
    }

    notifySubscribers() {
        for (const observer of this.observers) {
            observer.update();
        }
    }

    setStockCount(newStockAdded) {
        if (this.stockCount === 0) {
            this.notifySubscribers();
        }
        this.stockCount += newStockAdded;
    }

    getStockCount() {
        return this.stockCount;
    }
}
module.exports = StocksObservable