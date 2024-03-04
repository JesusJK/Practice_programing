package books;

public class Book {
    String title;
    int quantity;
    int id;
    String genre;
    String loanDate;
    String returnDate;
    boolean avaliable;
    
    
    public Book(String title, int quantity, int id, String genre) {       
        this.title = title;
        this.quantity = quantity;
        this.id = id;
        this.genre = genre; 
        this.loanDate = loanDate;
        this.returnDate = returnDate;
        this.avaliable = true;
    }
    void lendBook(){
        this.avaliable = false;
        
    }
    
     void returnBook(){
        
        this.avaliable = true;
    }
     
     
    
    
    

    
}
