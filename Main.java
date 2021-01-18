public class Main {

    public static void main(String[] args) {
        Toyota toyotaCamry = new Toyota("Camry", "black", 4, false, 2.4);
        Mercedes mercedes500 = new Mercedes("500", "white", 4, false, 2.4);

        System.out.println(toyotaCamry.toString());
        System.out.println(mercedes500.toString());
    }
}
