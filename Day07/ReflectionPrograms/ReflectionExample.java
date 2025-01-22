/*Write a Java program to demonstrate the use of reflection. Your program should:
Dynamically load a custom class (e.g., Person) using its fully qualified name.
Display the following details about the class:
All declared methods and their return types.
All declared fields and their types.
All constructors.
Dynamically invoke a method on an object of the class, provided the method name and arguments as input.
*/

package Day07.ReflectionPrograms;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionExample {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException,
            IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException,
            SecurityException, NoSuchFieldException {

        Class<?> clz = Class.forName("Day7.ReflectionPrograms.Person");
        System.out.println("");
        System.out.println(clz);

        Constructor<?>[] constructor = clz.getConstructors();
        for (int i = 0; i < constructor.length; i++) {
            System.out.println(constructor[i]);
        }
        Object obj = constructor[0].newInstance("Vignesh", 21);
        System.out.println(obj);

        Method method = clz.getMethod("display");
        method.invoke(obj);

        Class<?> type = method.getReturnType();
        System.out.println("Return type" + (type));

        Field filed = clz.getDeclaredField("name");
        filed.setAccessible(true);
        System.out.println("Name field: " + (filed));
        System.out.println("Name field type: " + filed.getType());

        Field filed1 = clz.getDeclaredField("age");
        filed1.setAccessible(true);
        System.out.println("Age field: " + (filed1));
        System.out.println("Age fieed type: " + filed1.getType());

        Field[] fileds = clz.getFields();
        for (Field filedValue : fileds) {
            System.out.println(filedValue);
        }

        Method[] methods = clz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            methods[i].setAccessible(true);
            if (methods[i].getParameterCount() == 1)
                System.out.println(methods[i].invoke(obj, "vignesh"));
            else
                System.out.println(methods[i].invoke(obj));
        }

        System.out.println();

    }

}
