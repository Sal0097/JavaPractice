public class AnimalList {
    public static void main(String[] args) {
        String[] animals = new String[20];


        animals[0] = "Lion";
        animals[1] = "Tiger";
        animals[2] = "Elephant";
        animals[3] = "Giraffe";
        animals[4] = "Zebra";
        animals[5] = "Kangaroo";
        animals[6] = "Panda";
        animals[7] = "Koala";
        animals[8] = "Penguin";
        animals[9] = "Dolphin";
        animals[10] = "Whale";
        animals[11] = "Shark";
        animals[12] = "Eagle";
        animals[13] = "Owl";
        animals[14] = "Falcon";
        animals[15] = "Cheetah";
        animals[16] = "Leopard";
        animals[17] = "Rhinoceros";
        animals[18] = "Hippopotamus";
        animals[19] = "Crocodile";

        System.out.println("List of Animals:");
        for (int i = 0; i < animals.length; i++) {
            System.out.println(animals[i]);
        }
    }
}