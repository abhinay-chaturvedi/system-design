const NotificationAlertObserver = require("./NotificationAlertObserver")

console.log(NotificationAlertObserver)
class EmailAlertObserver extends NotificationAlertObserver {
    constructor(emailId, observable) {
        super();
        this.emailId = emailId;
        this.observable = observable;
    }

    update() {
        super.update();
        this.sendEmail(this.emailId, "Product is in stock! Hurry up!");
    }

    sendEmail(emailId, msg) {
        console.log(`Email sent to: ${emailId}`);
    }
}
module.exports = EmailAlertObserver