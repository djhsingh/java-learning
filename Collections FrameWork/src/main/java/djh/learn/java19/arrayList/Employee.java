package djh.learn.java19.arrayList;

public record Employee(int id,String name,double salary) implements Comparable<Employee> {
    @Override
    public int compareTo(Employee o) {
        return Integer.compare(this.id,o.id);
    }
}
