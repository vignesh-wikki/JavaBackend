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

    private T obj;

    @Override
    public String toString() {
        return "Box [obj=" + obj + "]";
    }

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }

    public boolean isTypeOf() {
        return obj instanceof T;
    }

    public void printItem() {
        System.out.println(obj.toString());
    }

    public static void main(String[] args) {
        Box<Object> box1 = new Box<>();
        box1.setObj(7);
        System.out.println("Stored item: " + box1.getObj());
        box1.printItem();
        System.out.println(box1.isTypeOf());

        box1.setObj("Vignesh");
        System.out.println("Stored item: " + box1.getObj());
        box1.printItem();
        System.out.println(box1.isTypeOf());

        box1.setObj(77.8686);
        System.out.println("Stored item: " + box1.getObj());
        box1.printItem();
        System.out.println(box1.isTypeOf());

        Data data = new Data();
        data.setValue(27);
        data.getValue();

        box1.setObj(data);
        System.out.println("Stored item: " + box1.getObj());
        box1.printItem();
        System.out.println(box1.isTypeOf());

    }

}
