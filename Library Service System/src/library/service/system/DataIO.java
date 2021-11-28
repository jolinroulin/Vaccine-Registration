
package library.service.system;

import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;


public class DataIO {
   public static ArrayList<Personnel> allPersonnel = new ArrayList<Personnel>();
   public static ArrayList<People> allPeople = new ArrayList<People>();
   public static ArrayList<Citizen> allCitizen = new ArrayList<Citizen>();
   public static ArrayList<NonCitizen> allNonCitizen = new ArrayList<NonCitizen>();
   public static ArrayList<Vaccine> allVaccine = new ArrayList<Vaccine>();
   public static ArrayList<Appointment> allAppointment = new ArrayList<Appointment>();
   public static ArrayList<Admin> allAdmin = new ArrayList<Admin>();
   
   public static void readData(){
       try {
           Scanner s = new Scanner(new File("Personnel.txt"));
           while(s.hasNext()){
               int userId = Integer.parseInt(s.nextLine());
               String name = s.nextLine();
               String gender = s.nextLine();                         
               String email = s.nextLine();
               String password = s.nextLine();
               String DOB = s.nextLine();
               String contactNumber = s.nextLine();
               String IC = s.nextLine();
               VaccinationCentre post = VaccinationCentre.valueOf(s.nextLine());   
               s.nextLine();
               Personnel person1;
               person1 = new Personnel(userId,password,name,gender,email,DOB,contactNumber,IC,post);
               allPersonnel.add(person1);
           }
           Scanner s1 = new Scanner(new File("Citizen.txt"));
           while(s1.hasNext()){
               int userId = Integer.parseInt(s1.nextLine());
               String password = s1.nextLine();
               String name = s1.nextLine();                         
               String gender = s1.nextLine();
               String email = s1.nextLine();
               String DOB = s1.nextLine();
               String contactNumber = s1.nextLine();
               String IC = s1.nextLine();
               s1.nextLine();
               Citizen x = new Citizen(userId,password,name,gender,email,DOB,contactNumber,IC);
               allCitizen.add(x);
               People x1 = new People(userId,password,name,gender,email,DOB,contactNumber);
               allPeople.add(x1);
           }
           
           Scanner s2 = new Scanner(new File("NonCitizen.txt"));
           while(s2.hasNext()){
               int userId = Integer.parseInt(s2.nextLine());
               String password = s2.nextLine();
               String name = s2.nextLine();                         
               String gender = s2.nextLine();
               String email = s2.nextLine();
               String DOB = s2.nextLine();
               String contactNumber = s2.nextLine();
               String passport = s2.nextLine();
               s2.nextLine();
               NonCitizen x = new NonCitizen(userId,password,name,gender,email,DOB,contactNumber,passport);
               allNonCitizen.add(x);
               People x1 = new People(userId,password,name,gender,email,DOB,contactNumber);
               allPeople.add(x1);
           }
           
           Scanner s3 = new Scanner(new File("Vaccine.txt"));
           while(s3.hasNext()){
               
           }
           Scanner s4 = new Scanner(new File("Appointment.txt"));
           while(s4.hasNext()){
               
           }
           Scanner s5 = new Scanner(new File("Admin.txt"));
           while(s5.hasNext()){
               
           }
       }catch(Exception e){
            System.out.println("Error in read!");
       }
       
   }
   
   public static void writeData(){
       try{
           PrintWriter a = new PrintWriter("Personnel.txt");
           for(int i = 0; i<allPersonnel.size();i++){
               a.println(allPersonnel.get(i).getUserId());
               a.println(allPersonnel.get(i).getPassword());
               a.println(allPersonnel.get(i).getName());
               a.println(allPersonnel.get(i).getGender());
               a.println(allPersonnel.get(i).getEmail());
               a.println(allPersonnel.get(i).getDateOfBirth());
               a.println(allPersonnel.get(i).getContactNo());
               a.println(allPersonnel.get(i).getIC());
               a.println(allPersonnel.get(i).getPost());
               a.println();
           }
           a.close();
          
           PrintWriter b = new PrintWriter("Citizen.txt");
           for(int i = 0; i<allCitizen.size();i++){
               b.println(allCitizen.get(i).getUserId());
               b.println(allCitizen.get(i).getPassword());
               b.println(allCitizen.get(i).getGender());
               b.println(allCitizen.get(i).getEmail());
               b.println(allCitizen.get(i).getPassword());
               b.println(allCitizen.get(i).getDateOfBirth());
               b.println(allCitizen.get(i).getContactNo());
               b.println(allCitizen.get(i).getIC());
               b.println();
           }
           b.close();
           PrintWriter c = new PrintWriter("NonCitizen.txt");
           for(int i = 0; i<allNonCitizen.size();i++){
               c.println(allNonCitizen.get(i).getUserId());
               c.println(allNonCitizen.get(i).getPassword());
               c.println(allNonCitizen.get(i).getGender());
               c.println(allNonCitizen.get(i).getEmail());
               c.println(allNonCitizen.get(i).getPassword());
               c.println(allNonCitizen.get(i).getDateOfBirth());
               c.println(allNonCitizen.get(i).getContactNo());
               c.println(allNonCitizen.get(i).getPassport());
               c.println();
           }
           c.close();
           
           PrintWriter d = new PrintWriter("Vaccine.txt");
           for(int i = 0; i<allAdmin.size();i++){
 
           }
           d.close();
           
           PrintWriter e = new PrintWriter("Appointment.txt");
           for(int i = 0; i<allAdmin.size();i++){
 
           }
           e.close();
           
           PrintWriter f = new PrintWriter("Admin.txt");
           for(int i = 0; i<allAdmin.size();i++){
 
           }
           f.close();
           
       }catch (Exception e){
           System.out.println("Error in write!");
       }
   }
    public static Personnel checkPersonnel(String IC)  {
        for(int i=0; i<allPersonnel.size(); i++){
            if(IC.equals(allPersonnel.get(i).getUserId())){
                return allPersonnel.get(i);
            }
        }
        return null;
    }
    
    public static People checkPeopleUserId(String userId)  {
        for(int i=0; i<allPeople.size(); i++){
            if(userId.equals(allPeople.get(i).getUserId())){
                return allPeople.get(i);
            }
        }
        return null;
    }
    public static boolean checkPeoplePassword(String userId,String password)  {
        for(int i=0; i<allPeople.size(); i++){
            if(userId.equals(allPeople.get(i).getUserId())){
                if(password.equals(allPeople.get(i).getPassword())){
                    return true;
                }
            }
        }
        return false;
    }
    public static Citizen checkCitizenExist(String IC)  {
        for(int i=0; i<allCitizen.size(); i++){
            if(IC.equals(allCitizen.get(i).getIC())){
                return allCitizen.get(i);
            }
        }
        return null;
    }
    public static NonCitizen checkNonCitizenExist(String passport)  {
        for(int i=0; i<allNonCitizen.size(); i++){
            if(passport.equals(allNonCitizen.get(i).getPassport())){
                return allNonCitizen.get(i);
            }
        }
        return null;
    }
    
    //ic 
    
    
//    public static People checkPeople(String IC)  {
//        for(int i=0; i<allPeople.size(); i++){
//            if(IC.equals(allPeople.get(i).getIC())){
//                return allPeople.get(i);
//            }
//        }
//        return null;
//    }
    
}
