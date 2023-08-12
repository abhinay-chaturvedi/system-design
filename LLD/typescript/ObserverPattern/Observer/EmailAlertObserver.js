"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
var EmailAlertObserver = /** @class */ (function () {
    function EmailAlertObserver(emailId, observable) {
        this.emailId = emailId;
        this.observable = observable;
    }
    EmailAlertObserver.prototype.update = function () {
        this.sendEmail(this.emailId, "Product is in stock! Hurry up!");
    };
    EmailAlertObserver.prototype.sendEmail = function (emailId, msg) {
        console.log("Email sent to: ".concat(emailId));
    };
    return EmailAlertObserver;
}());
exports.default = EmailAlertObserver;
