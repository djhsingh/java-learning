package djh.learn.java19;

import java.util.Objects;

public class Worker {

   private double salary ;

   private  String name;

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public double getSalary(){
      return this.salary;
   }

   public void setSalary(double salary){
      if(salary<0){
         System.out.println("Invalid number for salary");
         return;
      }
      this.salary=salary;
   }


   @Override
   public String toString() {
      return "Worker{" +
              "salary=" + salary +
              ", name='" + name + '\'' +
              '}';
   }

   public Worker(double salary, String name) {
      this.salary = salary;
      this.name = name;
   }

   public Worker() {
   }

   @Override
   public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;
      Worker worker = (Worker) o;
      return Double.compare(worker.salary, salary) == 0 && name.equals(worker.name);
   }

   @Override
   public int hashCode() {
      return Objects.hash(salary, name);
   }
}
