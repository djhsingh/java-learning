package djh.learn.java19.classes;

public class Person {
    public String lastName;

    public String firstName;
    public void walk(){
        System.out.println(this.firstName+" "+this.lastName+" is walking!");
    }

    public String fullName(){
        return firstName + " "+ lastName;
    }

    public void eat(String food){
        System.out.println(this.fullName()+" is eating "+food);
    }
}
