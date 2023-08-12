import NotificationAlertObserver from "./NotificationAlertObserver";

class MobileAlertObserver implements NotificationAlertObserver {
    private username: string;
    private observable: any; // Replace 'any' with the appropriate type

    constructor(username: string, observable: any) {
        this.username = username;
        this.observable = observable;
    }

    update(): void {
        this.sendMobileMsg(this.username, "Product is in stock! Hurry up!");
    }

    sendMobileMsg(username: string, msg: string): void {
        console.log(`Message sent to: ${username}`);
    }
}

export default MobileAlertObserver;
