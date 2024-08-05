package djh.learn.java19;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Encapsulation {
    public static void main(String[] args) {
        Worker worker = new Worker();
      //  worker.salary=45000000; data is exposed
        worker.setSalary(-34343);
        System.out.println(worker.getSalary());


        //reflection

        System.out.println(worker.getClass().getSimpleName());
        System.out.println(worker.getClass().getPackageName());

        for(Field field: worker.getClass().getFields()){
            System.out.println(field.getName()+"-------"+field.getType());
        }

        for(Method method: worker.getClass().getMethods()){
            System.out.println(method.getName()+"-------"+method.getReturnType());
        }

        for(Constructor constructor:worker.getClass().getConstructors()){
            System.out.println(constructor.getName());
        }

        Worker w1 = new Worker(535333,"tom");
        Worker w2 = new Worker(535333,"tom");
        System.out.println(w1.toString());
        System.out.println(w2.toString());
        System.out.println(w1.hashCode());
        System.out.println(w2.hashCode());
        System.out.println(w1.equals(w2));
    }
}
