#include <iostream>
#include "./BasePizza/headers.h"
int main() {
    BasePizza *pizza = new MushRoom(new ExtraCheese(new FarmHouse()));

    int cost = pizza->cost();
    std::cout << "Cost is: " << cost << std::endl;

    delete pizza; // Don't forget to free memory
    return 0;
}