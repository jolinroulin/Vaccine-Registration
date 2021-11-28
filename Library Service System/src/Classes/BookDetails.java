/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class BookDetails {
    File FILEPATHBook =new File("C:\\Users\\User\\Documents\\NetBeansProjects\\Library Service System\\BookData.txt");    
    public boolean addBookToTextFile(Book book){
        
        try {
            
            PrintWriter out = null;
            
        BufferedReader br = new BufferedReader(new FileReader(FILEPATHBook));
        Object[] Lines = br.lines().toArray();
        int i =0;
        int id =0;
        String BookId = null;
        for(i=0; i<Lines.length;i++){
            String Line = Lines[i].toString().trim();
            String[] Row = Line.split(" : ");
            id = Integer.parseInt(Row[0]) ;
            
        }
        int id2 = id + 1 ;
            
            String BookData = id2 + " : " + book.getBookName() + " : " + book.getBookAuthor() + " : " + book.getBookPublisher() + " : " + book.getBookType() + " : " + book.getBookPrice() + " : " + book.getBookQuantity() + " : " + book.getBookAvailable();
            
            out = new PrintWriter(new BufferedWriter(new FileWriter(FILEPATHBook,true)));
            out.println(BookData);
            
            out.close();
            
            JOptionPane.showMessageDialog(null, "Details are added. Your book id is " + id2 + ".");
        } catch (IOException ex) {
            Logger.getLogger(BookDetails.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
    }
    
    public Book findBookFromTextFile(String bookId) throws IOException{
            Book book = null;
        try {
            
            FileInputStream fileInputStream = new FileInputStream(FILEPATHBook);
            
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
            
            String readLine;
            
            while((readLine = bufferedReader.readLine()) != null){
                String[] detailBook = readLine.split(" : ");
                if(bookId.equals(detailBook[0])){
                    book = new Book();
                    book.setBookId(detailBook[0]);
                    book.setBookName(detailBook[1]);
                    book.setBookAuthor(detailBook[2]);
                    book.setBookPublisher(detailBook[3]);
                    book.setBookType(detailBook[4]);
                    book.setBookPrice(detailBook[5]);
                    book.setBookQuantity(detailBook[6]);
                    book.setBookAvailable(detailBook[7]);
                    
                    JOptionPane.showMessageDialog(null, "Record is found");
                }
            }
            
            } catch (FileNotFoundException ex) {
                Logger.getLogger(BookDetails.class.getName()).log(Level.SEVERE, null, ex);
            }
        return book;


    }
}
