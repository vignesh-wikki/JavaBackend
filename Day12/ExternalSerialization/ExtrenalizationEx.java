package Day12.ExternalSerialization;

import java.io.Externalizable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class ExtrenalizationEx implements Externalizable {

    private String name;
    transient private int id;
    private String workingDepartment;

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

    public String getWorkingDepartment() {
        return workingDepartment;
    }

    public void setWorkingDepartment(String workingDepartment) {
        this.workingDepartment = workingDepartment;
    }

    @Override
    public String toString() {
        return "ExtrenalizationEx [name=" + name + ", id=" + id + ", workingDepartment=" + workingDepartment + "]";
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        name = in.readUTF();
        id = in.readInt();
        workingDepartment = in.readUTF();
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeUTF(name);
        out.writeInt(id);
        out.writeUTF(workingDepartment);
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ExtrenalizationEx obj = new ExtrenalizationEx();
        obj.setName("Vignesh");
        obj.setId(101);
        obj.setWorkingDepartment("Backend developer");

        System.out.println(obj);

        File file = new File("/home/vignesh/Downloads/JavaBackend/Day12/ExternalSerialization/Employee.ser");
        if (file.createNewFile())
            System.out.println("File created");
        else
            System.out.println("File not created");

        ObjectOutputStream serialize = new ObjectOutputStream(new FileOutputStream(file));
        serialize.writeObject(obj);
        System.out.println("Employee object Serialized: " + serialize);

        ObjectInputStream deserialize = new ObjectInputStream(new FileInputStream(
                "/home/vignesh/Downloads/JavaBackend/Day12/ExternalSerialization/Employee.ser"));
        ExtrenalizationEx deserializedObj = (ExtrenalizationEx) deserialize.readObject();
        System.out.println("Deserialized object is" + deserializedObj);

        serialize.flush();
        serialize.close();
        deserialize.close();
    }

}
