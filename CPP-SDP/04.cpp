#include <iostream>
#include <string>

using namespace std;

class Doctor {
    public: 
    string name = "Dr. Smith";
    void treat() {
        cout << "Treating patients!" << endl;
    }
};

class Surgeon : public Doctor {
    public:
    string specialty = "Cardiac Surgery";
    void operate() {
        cout << "Performing surgery!" << endl;
    }
};

int main() {
    Surgeon mySurgeon;
    mySurgeon.treat();
    mySurgeon.operate();
    cout << "Surgeon Name: " << mySurgeon.name << endl;
    cout << "Specialty: " << mySurgeon.specialty << endl;
    return 0;
}
