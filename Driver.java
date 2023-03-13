public class Driver{
    public static void main(String[] args){

        // Dog d = new Dog();
        // d.sound();

        // System.out.println();

        // Rabbit r = new Rabbit();
        // r.sound();

        // JackRabbit jr = new JackRabbit();
        // jr.sound();

        Object obj1 = new Object();
        System.out.println(obj1.hashCode()); //2060468723

        Object obj2 = new Object(); 
        System.out.println(obj2.hashCode()); //622488023

        System.out.println("Objects are not equal " + obj1.equals(obj2)); //false

        Object obj3 = obj2; //622488023

        System.out.println("Objects are equal " + obj3.equals(obj2)); //true

        //== compares memory references (do these two exist in the same location in memory)
        //.equals() this checks the actual value do the actual values match. 

        System.out.println(obj3.hashCode());
        System.out.println(obj2.hashCode());
    }


}