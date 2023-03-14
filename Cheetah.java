public class Cheetah extends Cat{

    // public void test(){
    //     Cat kitty = new Cat();
    //     kitty.eat();
    // }

    @Override
    public String purr(){
        return "meow";
    }

    @Override
    public Integer age(int age){
        return age;
    }

    @Override
    String eat(){
        return "I eat Antelope";
    }


    
}
