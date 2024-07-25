public class VehicleRegistrationNumbers {
    public static void main(String[] args) {
        String[] vehicleRegNum = new String[10];

        vehicleRegNum[0] = "KA01AB1234";
        vehicleRegNum[1] = "MH02CD5678";
        vehicleRegNum[2] = "DL03EF9101";
        vehicleRegNum[3] = "TN04GH2345";
        vehicleRegNum[4] = "AP05IJ6789";
        vehicleRegNum[5] = "GJ06KL0123";
        vehicleRegNum[6] = "HR07MN4567";
        vehicleRegNum[7] = "WB08OP8910";
        vehicleRegNum[8] = "RJ09QR3456";
        vehicleRegNum[9] = "UP10ST7890";


        for (String ref : vehicleRegNum) {
            System.out.println("Vehicle registration numbers " + ref);
        }
    }
}