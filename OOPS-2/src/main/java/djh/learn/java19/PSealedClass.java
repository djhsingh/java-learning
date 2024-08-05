package djh.learn.java19;

//public final class PClass
//final class cannot be inherited
public sealed class PSealedClass permits DClass{
    final String name;
   // final String NAME;//correct naming convention

    public PSealedClass(){
        name="Ramesh";
    }

   void print(){
       // this.name="Amit";
        System.out.println("printing in PClass");
    }
    //final method cannot be overridden
   /* final void print(){
        // this.name="Amit";
        System.out.println("printing in PClass");
    }*/
}
