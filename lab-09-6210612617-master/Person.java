
public class Person {
    private String name;
    private String address;
    private String phone;
    private String email;
    private String status;

    public Person(){
        this.name = "John Doe";
        this.address = "Thailand";
        this.phone = "empty";
        this.email = "empty";
    }
    public Person(String name ,String adress ,String phone , String email){
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.email = email;
     }
     public void setName(String name){
        this.name = name;
     }
     public String getName(){
        return name;
     }
     public void setAddress(String address){
        this.address = address;
     }
     public String getAddress(){
        return address;
     }
     public void setPhone(String phone){
        this.phone = phone;
     }
     public String getPhone(){
        return phone;
     }
     public void setEmail(String email){
        this.email = email;
     }
     public String getEmail(){
        return email;
     }


}