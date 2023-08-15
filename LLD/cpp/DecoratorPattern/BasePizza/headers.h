#include <iostream>

class BasePizza {
public:
    virtual int cost() = 0;
    virtual ~BasePizza() {} // Adding a virtual destructor for proper memory management
};

class FarmHouse : public BasePizza {
    public: 
    int cost() override;
};
class Margherita : public BasePizza {
    public: 
    int cost();
};
class VegDelight : public BasePizza {
    public: 
    int cost();
};
class ToppingDecorator : public BasePizza {
public:
    virtual ~ToppingDecorator() {}
};

class ExtraCheese: public ToppingDecorator {
    BasePizza* pizza;
    public:
    ExtraCheese(BasePizza* pizza);
    int cost() override;
};
class MushRoom: public ToppingDecorator {
    BasePizza* pizza;
    public:
    MushRoom(BasePizza* pizza) ;
    int cost();
};