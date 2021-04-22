
public class Staff extends Employer {
    private String position;
    public Staff(){
        this.position = "job potisition";
    }
    public Staff(String position){
        this.position = position;
    }
    public void setPosition(String position){
        this.position = position;
    }
    public String getPosition(){
        return position;
    }
}