"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
var IphoneObservable = /** @class */ (function () {
    function IphoneObservable() {
        this.observers = [];
        this.stockCount = 0;
    }
    IphoneObservable.prototype.add = function (observer) {
        this.observers.push(observer);
    };
    IphoneObservable.prototype.remove = function (observer) {
        var index = this.observers.indexOf(observer);
        if (index !== -1) {
            this.observers.splice(index, 1);
        }
    };
    IphoneObservable.prototype.notifySubscribers = function () {
        for (var _i = 0, _a = this.observers; _i < _a.length; _i++) {
            var observer = _a[_i];
            observer.update();
        }
    };
    IphoneObservable.prototype.setStockCount = function (newStockAdded) {
        if (this.stockCount === 0) {
            this.notifySubscribers();
        }
        this.stockCount += newStockAdded;
    };
    IphoneObservable.prototype.getStockCount = function () {
        return this.stockCount;
    };
    return IphoneObservable;
}());
exports.default = IphoneObservable;
