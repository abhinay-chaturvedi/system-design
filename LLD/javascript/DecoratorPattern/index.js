
const { FarmHouse, ExtraCheese, MushRoom } = require("./BasePizza.js");

// const pizza = new MushRoom(new ExtraCheese(new FarmHouse));
const pizza = new FarmHouse;
console.log(pizza.cost());