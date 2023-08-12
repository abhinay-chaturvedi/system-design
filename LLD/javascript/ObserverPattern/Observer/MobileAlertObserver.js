const NotificationAlertObserver = require("./NotificationAlertObserver")
class MobileAlertObserver extends NotificationAlertObserver {
    constructor(username, observable) {
        super();
        this.username = username;
        this.observable = observable;
    }

    update() {
        super.update();
        this.sendMobileMsg(this.username, "Product is in stock! Hurry up!");
    }

    sendMobileMsg(username, msg) {
        console.log(`Message sent to: ${username}`);
    }
}
module.exports = MobileAlertObserver