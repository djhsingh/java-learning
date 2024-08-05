package djh.learn.java19;

import java.io.*;

public class Serializing {
    static String filePath = "C:/Users/DEEPAK SINGH JANGRA/Downloads/employee.ser";

    public static void main(String[] args) throws Exception {
       // serialize();
        deSerialize();
    }
    static void serialize() throws Exception{
        Employee e1 = new Employee(1,"deepak","djshingh");
        Employee e2 = new Employee(2,"ajay","ajay");
        Employee e3 = new Employee(3,"sunil","sunil");

        try(FileOutputStream fileOutputStream = new FileOutputStream(filePath)){
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(e1);
            objectOutputStream.writeObject(e2);
            objectOutputStream.writeObject(e3);
        }
    }

    static void deSerialize() throws Exception{

        try(FileInputStream fileInputStream = new FileInputStream(filePath)){
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            Employee employee;
            System.out.println(objectInputStream.read());
            while(objectInputStream.read()==-1){
                System.out.println(objectInputStream.readObject());
            }
        }
    }
}
