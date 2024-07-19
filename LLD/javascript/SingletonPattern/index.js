let Db = require("./Database");
console.log(Db.getInstance())
// Db.getInstance = () => console.log("changed")
console.log(Db.getInstance())
console.log(Db.getInstance())
console.log(Db.getInstance())

const a = Db.getInstance();
const c = new Db()
a.name = "chaturvedi"
console.log(a)
console.log(Db.getInstance())