
public class Student extends Person{
    private String status;
    public Student(){
        status = "freshman";
    }
    public Student(String status){
        this.status = status;
    }
    public String getStatus(){
        return status;
    }
    public void setStatus(String status){
        this.status = status;
    }
}