package djh.learn.java19;

public record MyRecord (int id,String name,double salary,boolean isMarried) implements MyInterface{

    static String address;
    public MyRecord{
        if(id<0){
            throw new IllegalArgumentException("Id cannot be less than zero");
        }
    }
    @Override
    public String name() {
        return "My name is: "+name;
    }

    public static void main(String[] args) {
        MyRecord record1 = new MyRecord(3,"Ajay",343442.323,true);
        MyRecord record2 = new MyRecord(0,"Ajay",343442.323,true);
        System.out.println(record1.salary());
        System.out.println(record1.name());
        System.out.println(record1.hashCode());
        System.out.println(record2.hashCode());
        System.out.println(record1.equals(record2));
    }
}
