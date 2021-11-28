
package Classes;


public class Citizen extends People{
    private String IC;
    public Citizen(int userId,String password, String name, String gender, String email, 
              String dateOfBirth, String contactNo,String IC) {
        super(userId, password, name, gender, email, dateOfBirth, contactNo);
        this.IC = IC;
    }

    public String getIC() {
        return IC;
    }

    public void setIC(String IC) {
        this.IC = IC;
    }
    
}
