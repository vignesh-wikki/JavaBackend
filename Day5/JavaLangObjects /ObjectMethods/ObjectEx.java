package Day5.JavaLangObjects.ObjectMethods;

public class ObjectEx implements Cloneable {

    public Integer number;
    public Character str;

    public ObjectEx(Integer number, Character str) {
        this.number = number;
        this.str = str;
    }

    public void showClassName(ObjectEx obj) {
        System.out.println("Getting Class name by Object method: " + obj.getClass());
    }

    public void display() {
        System.out.println("Number: " + number);
        System.out.println("String: " + str);
    }

    @Override
    public String toString() {
        return "ObjectEx [number=" + number + ", str=" + str + "]";
    }

    public static void main(String[] args) {
        ObjectEx obj = new ObjectEx(127, 'C');
        obj.showClassName(obj);
        obj.display();
        System.out.println(obj);
    }

}
