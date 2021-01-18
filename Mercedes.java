public class Mercedes extends Car {
    private String logo = "Mercedes";

    public Mercedes(String model, String color, int doorCount, boolean isElectric, double engineVolume) {
        super(model, color, doorCount, isElectric, engineVolume);
    }
    @Override
    public String toString() {
        return "Mercedes{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", doorCount=" + doorCount +
                ", logo='" + logo + '\'' +
                ", isElectric=" + isElectric +
                ", engineVolume=" + engineVolume +
                '}';
    }
}
