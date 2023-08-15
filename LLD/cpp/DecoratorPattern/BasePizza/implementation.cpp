#include "headers.h"

int FarmHouse::cost() {
    return 200;
}
int Margherita::cost() {
    return 100;
}
int VegDelight::cost() {
    return 120;
}
ExtraCheese :: ExtraCheese(BasePizza* pizza): pizza(pizza) {};
int ExtraCheese::cost() {
    return this->pizza->cost() + 10;
}
MushRoom :: MushRoom(BasePizza* pizza): pizza(pizza) {};
int MushRoom :: cost() {
    return this->pizza->cost() + 15;
}
