public class Bird extends Animal implements Movable {
    public String colour ;
    public Bird(){}
    public Bird(int age,String colour){
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
        return "Bird food";
    }
    @Override
    public String sound(){
        return "Bird sound";
    }
    @Override
    public String howToMove(){
        return "Bird move";
    }
    public String toString(){
        return "age : " + age + ", color: " + colour;
    }
}