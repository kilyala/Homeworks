package homework1;

public class Fruit implements HasWeight{

    @Override
    public Fruit clone() throws CloneNotSupportedException {
        return new Fruit();
    }

    @Override
    public float getWeight() {
        return 0;
    }
}
