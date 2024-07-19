class Database {
    static  instance;
    constructor() {
        console.log("constructor")
        
    }
    
    static getInstance() {
        if(this.instance == null) {
            this.instance = new Database();
            console.log("hi")
        }
        return this.instance;
    }
    name = "abhinay"
}

module.exports = Database