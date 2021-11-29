
package Classes;

public class Personnel extends Committee{
    private String centre;
    public Personnel( String userId, String password, String name, String gender, 
            String email, String dateOfBirth, String contactNo, String IC,String centre) {
        super(userId, name, gender, email, password, dateOfBirth, contactNo,IC);
        this.centre = centre;
    }

    public String getCentre() {
        return centre;
    }

    public void setCentre(String centre) {
        this.centre = centre;
    }
    
}
