package Assignment05_Interface;

interface Car {
    int enginesNo = 1;
    int wheelsNo = 4;
    int steeringNo = 1;

    double engineCapacity();

    int seatingCapacity();
}

interface LuxuriousCar extends Car {
    int hasEntertainmentSystem();

    int airbagsNo();

    int totalParkingSensor();
}