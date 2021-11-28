
package library.service.system;

public class User {
    private int userId;
    private String password;
    private String name;
    private String gender;
    private String email;
    private String dateOfBirth;
    private String contactNo;

    public User(int userId, String password,String name, String gender, String email,  String dateOfBirth, String contactNo) {
        this.userId = userId;
        this.name = name;
        this.gender = gender;
        this.email = email;
        this.password = password;
        this.dateOfBirth = dateOfBirth;
        this.contactNo = contactNo;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }
    
   
    public void verifyLoginPeople(int userId, String password){
        int userFlag = 0;
        int passwordFlag = 1;               
        for(int i=0; i<DataIO.allPersonnel.size(); i++){
//            if(userId.equals(DataIO.allPersonnel.get(i).getUserId())){
//                passwordFlag = 1;
//            }
            if(password.equals(DataIO.allPersonnel.get(i).getPassword())){
                passwordFlag = 1;
            } 
        }
    }
}

