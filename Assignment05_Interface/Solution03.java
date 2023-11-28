/**
 * @question: Create a base class interface Car having three properties – number
 *            of engines=1, number of wheels=4 and number steering=1 and two
 *            abstract methods – engine capacity and seating capacity. Create
 *            one interface LuxuriousCar having three abstract methods –
 *            entertainment system, number of airbags and parking sensor.
 *            Mercedes Benz is a luxurious car and Alto is a non-luxurious car.
 *            Design the two categories of car from another class that contains
 *            the main method.
 * @author: Nirmalya Dhara
 * @date: 24 Nov, 2023
 */
package assignment05Classes;

import Assignment05_Interface.Car;
import Assignment05_Interface.LuxuriousCar;

class Alto implements Car {
    public double engineCapacity() {
        return 9;
    }

    public int seatingCapacity() {
        return 4;
    }

    public String toString() {
        return " no. of engines : " + enginesNo + ", no. of wheels : " + wheelsNo + ", no. of steering : " + steeringNo
                + ", total engine capacity : " + engineCapacity() + ", total seating capacity : " + seatingCapacity();
    }
}

class MercedesBenz implements LuxuriousCar {
    public double engineCapacity() {
        return 9;
    }

    public int seatingCapacity() {
        return 4;
    }

    public int hasEntertainmentSystem() {
        return 6;
    }

    public int airbagsNo() {
        return 4;
    }

    public int totalParkingSensor() {
        return 14;
    }

    public String toString() {
        return " no. of engines : " + enginesNo + ", no. of wheels : " + wheelsNo + ", no. of steering : " + steeringNo
                + ", total engine capacity : " + engineCapacity() + ", total seating capacity : " + seatingCapacity()
                + ", total entertainment system : " + hasEntertainmentSystem() + ", total airbags : " + airbagsNo()
                + ", total parking sensors : " + totalParkingSensor();
    }
}

/**
 * Solution03
 */
public class Solution03 {

    public static void main(String[] args) {
        MercedesBenz mercedesBenz = new MercedesBenz();
        Alto alto = new Alto();
        System.out.println("MercedesBenz : " + mercedesBenz);
        System.out.println("Alto : " + alto);
    }
}
