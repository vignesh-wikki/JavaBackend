package Day4.AdditionalQuickChallenge.Utilities;

public class Container<T> {
    private T obj;

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }

    public Container(T obj) {
        this.obj = obj;
    }

    public void display() {
        System.out.println("The received object is: " + (obj));
    }

}
