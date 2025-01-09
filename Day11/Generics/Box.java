package Day11.Generics;

class Data {
    private int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Data [value=" + value + ", getValue()=" + getValue() + "]";
    }

}

public class Box<T> {
    private T item;

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }

    public void printItem() {
        System.out.print(item + " ");
    }

    public boolean isTypeOf(Class<?> obj) {
        if (item instanceof Box) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Box<Integer> box1 = new Box<>();
        box1.setItem(7);
        box1.printItem();
        System.out.println(box1.isTypeOf(Integer.class));

        Box<String> box2 = new Box<>();
        box2.setItem("Vignesh");
        box2.printItem();
        System.out.println(box2.isTypeOf(String.class));

        Box<Double> box3 = new Box<>();
        box3.setItem(77.8686);
        box3.printItem();
        System.out.println(box3.isTypeOf(Double.class));

        Data data = new Data();
        data.setValue(7);
        data.getValue();

        Box<Data> box4 = new Box<>();
        box4.setItem(data);
        box4.printItem();
        System.out.println(box4.isTypeOf(Data.class));

    }

}
