
public class Faculty extends Employer {
    private String officeHour;
    public Faculty(){
        this.officeHour = "8:00 - 16:00";
        
    }
    public Faculty(String officeHour){
        this.officeHour = officeHour;
    }
    public void setOfficeHour(String officeHour){
        this.officeHour = officeHour;
    }
    public String getOfficeHour(){
        return officeHour;
    }
}