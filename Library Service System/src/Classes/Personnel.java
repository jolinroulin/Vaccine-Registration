
package Classes;

public class Personnel extends Committee{
    private VaccinationCentre post;
    public Personnel( int userId, String password, String name, String gender, 
            String email, String dateOfBirth, String contactNo, String IC,VaccinationCentre post) {
        super(userId, name, gender, email, password, dateOfBirth, contactNo,IC);
        this.post = post;
    }

    public VaccinationCentre getPost() {
        return post;
    }

    public void setPost(VaccinationCentre post) {
        this.post = post;
    }
    
}
