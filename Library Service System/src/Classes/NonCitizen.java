
package Classes;


public class NonCitizen extends People{
    private String passport;

    public NonCitizen(String userId,String password,String name,String gender,   String email, String dateOfBirth,  String contactNo,String passport,   String state) {
        super(userId, password, name, gender, email, dateOfBirth, contactNo, state);
        this.passport = passport;
    }


    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }
    
}
