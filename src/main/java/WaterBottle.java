public class WaterBottle {
    private int volume = 100;

    public void WaterBottle(int volume) {
        this.volume = volume;
    }

    public int drink(int drinkAmount) {
        return this.volume -= drinkAmount;
    }

    public void emptyBottle() {
        this.volume = 0;
    }
}
