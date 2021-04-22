abstract class Animal{
    public int age;
    public Animal(){}
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public abstract String eat();
    public abstract String sound();

    
}