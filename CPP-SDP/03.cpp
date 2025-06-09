#include <iostream>
#include <string>

using namespace std;

class Vehicle {
    public: 
    string brand = "Ford";
    void honk() {
        cout << "Super Class !" << endl;
    }
};

class Car : public Vehicle {
    public:
    string model = "Mustang";
    void display() {
        cout << brand + " " + model << endl;
    }
};
int main() {
    Car myCar;
    myCar.honk();
    myCar.display();
    return 0;
}
