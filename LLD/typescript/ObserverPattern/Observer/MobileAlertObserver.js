"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
var MobileAlertObserver = /** @class */ (function () {
    function MobileAlertObserver(username, observable) {
        this.username = username;
        this.observable = observable;
    }
    MobileAlertObserver.prototype.update = function () {
        this.sendMobileMsg(this.username, "Product is in stock! Hurry up!");
    };
    MobileAlertObserver.prototype.sendMobileMsg = function (username, msg) {
        console.log("Message sent to: ".concat(username));
    };
    return MobileAlertObserver;
}());
exports.default = MobileAlertObserver;
