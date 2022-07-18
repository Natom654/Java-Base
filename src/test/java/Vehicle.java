public class Vehicle {

    public class Wheel {
        public void printWheel() {
            System.out.println("Wheel is important");
        }
    }

    public class Door {
        public void printDoor() {
            System.out.println("Door is beautiful");
        }
    }

    public void printVehicle() {
        System.out.println("Vehicle has door and Wheel");
    }

    public static void main(String[] args) {
        Vehicle.Wheel wheel = new Vehicle().new Wheel();
        Vehicle.Door door = new Vehicle().new Door();
        wheel.printWheel();
        door.printDoor();
        Vehicle vehicle = new Vehicle();
        vehicle.printVehicle();
    }
}


//Создать класс Vehicle с методом print.
// В классе Vehicle, создайте внутренний класс Wheel и Door,
// которые также должны содержать метод print.
// Создайте экземпляры классов Wheel и Door.