package Day12.SerializationAndDeserialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerialAndDeserialion implements Serializable {
    private String name;
    transient  private int id;
    private long rollNumber;
    private String department;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(long rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "SerialAndDeserialion [name=" + name + ", id=" + id + ", rollNumber=" + rollNumber + ", department="
                + department + "]";
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        SerialAndDeserialion obj = new SerialAndDeserialion();
        obj.setName("Vignesh");
        obj.setId(101);
        obj.setRollNumber(54);
        obj.setDepartment("CSBS");

        System.out.println(obj);

        File file = new File("/home/vignesh/Downloads/JavaBackend/Day12/SerializationAndDeserialization/Student.ser");
        if (file.createNewFile())
            System.out.println("File created");
        else
            System.out.println("File not created");

        ObjectOutputStream serialize = new ObjectOutputStream(new FileOutputStream(file));
        serialize.writeObject(obj);
        System.out.println("Student object Serialized" + serialize);

        ObjectInputStream deserialize = new ObjectInputStream(new FileInputStream(
                "/home/vignesh/Downloads/JavaBackend/Day12/SerializationAndDeserialization/Student.ser"));
        SerialAndDeserialion deserializedObj = (SerialAndDeserialion) deserialize.readObject();
        System.out.println("Deserialized object is" + deserializedObj);

    }
}
