/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;


public class Committee extends User{

    private String IC;

    public Committee(String IC,String userId, String password, String name, String gender, String email, String dateOfBirth, String contactNo, String state) {
        super(userId, password, name, gender, email, dateOfBirth, contactNo, state);
    }



    public String getIC() {
        return IC;
    }

    public void setIC(String IC) {
        this.IC = IC;
    }

    /*Methods*/
    public void managePeople(){
        
    }
    public void manageAppointment(){
        
    }public void manageVaccine(){
        
    }
    
}
