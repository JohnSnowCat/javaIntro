/*
2) Переписать код SpeedCalculation в соответствии с Open-Closed Principle:
*/

public class openClosedPrincipleOne {
    public class Vehicle {
        int maxSpeed;
        String type;

        public Vehicle(int maxSpeed, String type) {
            this.maxSpeed = maxSpeed;
            this.type = type;
        }

        public int getMaxSpeed() {
            return this.maxSpeed;
        }

        public String getType() {
            return this.type;
        }
    }

    // Подкласс Car
    public class Car extends Vehicle {
        public Car(int maxSpeed) {
            super(maxSpeed, "Car");
        }
    }

    // Подкласс Bus
    public class Bus extends Vehicle {
        public Bus(int maxSpeed) {
            super(maxSpeed, "Bus");
        }
    }

    // Класс SpeedCalculation переписали для соблюдения OCP
    public class SpeedCalculation {
        public double calculateAllowedSpeed(Vehicle vehicle) {
            if (vehicle instanceof Car) {
                return vehicle.getMaxSpeed() * 0.8;
            } else if (vehicle instanceof Bus) {
                return vehicle.getMaxSpeed() * 0.6;
            }
            return 0.0;
        }
    }
}
