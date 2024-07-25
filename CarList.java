public class CarList {
    public static void main(String[] args) {
        // Create an array to store 15 car names
        String[] cars = new String[15];
        cars[0] = "Toyota Camry";
        cars[1] = "Honda Accord";
        cars[2] = "Tesla Model S";
        cars[3] = "Ford Mustang";
        cars[4] = "Chevrolet Camaro";
        cars[5] = "BMW 3 Series";
        cars[6] = "Mercedes-Benz C-Class";
        cars[7] = "Audi A4";
        cars[8] = "Lexus RX";
        cars[9] = "Volkswagen Golf";
        cars[10] = "Porsche 911";
        cars[11] = "Mazda CX-5";
        cars[12] = "Nissan Altima";
        cars[13] = "Subaru Outback";
        cars[14] = "Jeep Grand Cherokee";

        System.out.println("List of Cars:");
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }
    }
}