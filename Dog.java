public class Dog extends Animal{

    public Dog(){

    }
    
    public Dog( String color, int age){
        super(color, age);
    }

    @Override
    public void sound(){
       System.out.println("woof");
        // return sound;
    }

    @Override
    public void swimming(){
        System.out.println("I paddle with my four paws!");
    }
    
}
