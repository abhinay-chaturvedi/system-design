
class FarmHouse  {
    
    cost () {
        return 200;
    }
}
class Margherita {
    
    cost () {
        return 100;
    }
}
class VegDelight {
    
    cost () {
        return 200;
    }
}
class ExtraCheese {
    constructor(pizza) {
        this.pizza = pizza;
    }
    cost () {
        return this.pizza.cost() + 10;
    }
}
class MushRoom {
    constructor(pizza) {
        this.pizza = pizza;
    }
    cost () {
        return this.pizza.cost() + 30;
    }
}
module.exports = {
    FarmHouse,
    ExtraCheese,
    MushRoom
}