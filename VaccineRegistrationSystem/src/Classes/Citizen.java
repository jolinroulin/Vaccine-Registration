
package Classes;


public class Citizen extends People{
    
    private String IC;

    public Citizen(String userId,String password,String name,String gender,   String email, String dateOfBirth,  String contactNo,String IC,  String state) {
        super(userId, password, name, gender, email, dateOfBirth, contactNo, IC,state);
 
    }

}
