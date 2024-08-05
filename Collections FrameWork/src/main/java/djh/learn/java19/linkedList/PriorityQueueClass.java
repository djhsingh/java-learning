package djh.learn.java19.linkedList;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class PriorityQueueClass {
    public static void main(String[] args) {
        PriorityQueue<Integer> integerPriorityQueue = new PriorityQueue<>();
        //default priority is sorted in accending order
        integerPriorityQueue.offer(34);
        integerPriorityQueue.offer(67);
        integerPriorityQueue.offer(23);
        integerPriorityQueue.offer(16);
        System.out.println(integerPriorityQueue);


        Customer c1 = new Customer(1,"Deepak",5);
        Customer c2 = new Customer(2,"Ajay",1);
        Customer c3 = new Customer(3,"Rahul",3);
        Customer c4 = new Customer(4,"Sunil",2);
        Customer c5 = new Customer(5,"Kiran",4);
        PriorityQueue<Customer> customers = new PriorityQueue<>(List.of(c1,c2,c3,c4,c5));
        System.out.println(customers);

        PriorityQueue<Customer> customerz = new PriorityQueue<>(List.of(c1,c2,c3,c4,c5));
        customerz.stream().sorted(Comparator.comparing(Customer::name));
        System.out.println(customerz);
    }
}
