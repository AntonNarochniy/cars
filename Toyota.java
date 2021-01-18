public class Toyota extends Car {
    private String logo = "Toyota";


    @Override
    public String toString() {
        return "Toyota{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", doorCount=" + doorCount +
                ", logo='" + logo + '\'' +
                ", isElectric=" + isElectric +
                ", engineVolume=" + engineVolume +
                '}';
    }

    public Toyota(String model, String color, int doorCount, boolean isElectric, double engineVolume) {
        super(model, color, doorCount, isElectric, engineVolume);






    }


}
