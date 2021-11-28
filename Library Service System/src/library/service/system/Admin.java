
package library.service.system;


public class Admin extends Committee{

    public Admin(int userId, String name, String gender, String email, 
            String password, String dateOfBirth, String contactNo, String IC) {
        super(userId, name, gender, email, password, dateOfBirth, contactNo,IC);
    }

    
    /*Methods*/
    public void registerCommittee(){
//        Personnel person1;
//        int userId = JOptionPane.showInputDialog("Enter Personnel's Identification Number :");
//        Personnel exist = checkPersonnel(userId);
//        if(exist != null){
//            JOptionPane.showMessageDialog("The Personnel is already registered!!");
//        }else{
//            String name = JOptionPane.showInputDialog("Enter Name:");
//            char gender = JOptionPane.showInputDialog("Enter Gender:");
//            String email = JOptionPane.showInputDialog("Enter Email:");
//            String DOB = JOptionPane.showInputDialog("Enter Date of Birth:");
//            String contactNumber = JOptionPane.showInputDialog("Enter Contact Number:");
//            VacinationCentre post = JOptionPane.showInputDialog("Enter Vaccine Centre:");
////            int IC = userId;
//            String password = JOptionPane.showInputDialog("Set Password:");
//            person1 =new Personnel(name,gender,email,DOB,contactNumber,IC,post,userId,password);
//        }     
    }
    public void printReport(){
        
    }
}
