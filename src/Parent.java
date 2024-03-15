public class Parent {
    public void marry(){
        System.out.println("Amrish Puri has fixed marriage of Simran");
    }
}

class Child extends Parent{
    public void marry(){
        System.out.println("DDLJ"); //here child class has overriding parent class
        // and Parent class is overridden by Child class
    }
}

class Test{
    public static void main(String ...x) {
        Parent p = new Parent();
        p.marry();
        Child ch = new Child();
        ch.marry();
        Parent p1 = new Child();
        p1.marry(); //runtime polymorphism, dynamic polymorphism,late binding method
        //resolution at runtime taken care by JVM
        //and Overloading is compile time resolution, state binding or early binding taken care by compiler
    }
}
