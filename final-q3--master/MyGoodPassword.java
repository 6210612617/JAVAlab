public class MyGoodPassword implements GoodPassword{
    String password;
    public MyGoodPassword(){}
    public MyGoodPassword(String password){
        this.password = password;
    }
    @Override
    public  boolean isGoodPassword (String password){
        int i =0;
        String num = "0123456789";
        int count = 0;
        int count1 = 0;
        int count2  = 0;
        int korrect = 5;
        boolean t = true;
        boolean f = false;
        if (password.length() < 8){
            korrect -= 1;
        }
        if(Character.toUpperCase(password.charAt(0)) !=(password.charAt(0))){
            korrect -= 1;
        }
        while( i < (password.length()-1)){
            if (Character.toUpperCase(password.charAt(i)) ==(password.charAt(i))){
                count1++;
            }
            if (Character.toLowerCase(password.charAt(i)) ==(password.charAt(i))){
                count2++;
            }
            if(password.charAt(i) == num.charAt(i)){
                count++;
            }
            i++;
        }
        if(count < 2){
            korrect -= 1;
        }
        if(count1 <1){
            korrect -= 1;
        }
        if(count2 <1 ){
            korrect -= 1;
        }
    
       
        if (korrect == 5 ){
            return t ;
        }
        else {
            return f;
        }

    
    }

    
}