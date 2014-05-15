package password.verifier;

class PasswordCheck {
    private String password;
    private boolean hasUpperCase=false, hasLowerCase=false, hasNumber=false, hasLength=false;
    public PasswordCheck(String pass) {
        password = pass;
        for(int i=0; i<password.length(); i++){
            if(Character.isLowerCase(password.charAt(i))){
                hasLowerCase=true;
            }
            if(Character.isUpperCase(password.charAt(i))){
                hasUpperCase=true;
            }
            if(Character.isDigit(password.charAt(i))){
                hasNumber=true;
            }
            if(password.length()>=6){
                hasLength=true;
            }
        }
    }
    public boolean checkPassword(){
        if(hasLowerCase&&hasUpperCase&&hasNumber&&hasLength){
            return true;
        }else{
            return false;
        }
    }
}