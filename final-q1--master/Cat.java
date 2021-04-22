public class Cat extends Animal implements Movable{
    public String colour ;
    public Cat(){}
    public Cat(int age,String colour){
        this.age = age;
        this.colour = colour;
    }
    public String getColor(){
        return colour;
    }
    public void setColor(String colour){
        this.colour = colour;
    }
    @Override
    public String eat(){
        return "Cat sound";
    }
    @Override
    public String sound(){
        return "Cat sound";
    }
    @Override
    public String howToMove(){
        return "Cat move";
    }
    public String toString(){
        return "age : " + age + ", color: " + colour;
    }
    
}