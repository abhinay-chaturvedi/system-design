import NotificationAlertObserver from "./NotificationAlertObserver";

class EmailAlertObserver implements NotificationAlertObserver {
    private emailId: string;
    private observable: any; // You can replace 'any' with a proper type

    constructor(emailId: string, observable: any) {
        this.emailId = emailId;
        this.observable = observable;
    }

    update(): void {
        this.sendEmail(this.emailId, "Product is in stock! Hurry up!");
    }

    sendEmail(emailId: string, msg: string): void {
        console.log(`Email sent to: ${emailId}`);
    }
}

export default EmailAlertObserver;
