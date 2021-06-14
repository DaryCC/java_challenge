
package librarycatalogue;

import java.util.HashMap;
import java.util.Map;


public class LibraryCatalogue {
Map <String, Book> bookCollection = new HashMap<String,Book>();
int currentDay=0;
int lengthOfCheckoutPeriod=7;
double initialLateFee= 0.5;
double feePerLateDay = 1.00;
//constructor
public LibraryCatalogue(Map <String, Book> collection ){
    this.bookCollection= collection;
}
//getters

    public Map<String, Book> getBookCollection() {
        return bookCollection;
    }

    public int getCurrentDay() {
        return currentDay;
    }
    public Book getBook(String bookTitle) {
        return getBookCollection().get(bookTitle);
    }

    public int getLengthOfCheckoutPeriod() {
        return lengthOfCheckoutPeriod;
    }

    public double getInitialLateFee() {
        return initialLateFee;
    }

    public double getFeePerLateDay() {
        return feePerLateDay;
    }

//SETTERS
    public void nextDay(){
        currentDay++;
    }
    public void setDay(int day){
        currentDay=day;
    }
 //instance methods
    public void checkOutBook(String title){
        Book  book =getBook(title);
        if(book.getisCheckedout()){
            sorryBookAlreadyCheckedOut(book);
        }else{
            book.setisCheckedout(true, currentDay);
            System.out.println("You just checked "+title+" in due day "+(getCurrentDay()+getLengthOfCheckoutPeriod())+".");
        }
    }
    
    
    public void returnBook(String title){
        Book book = getBook(title);
        int daysLate=currentDay-(book.getdayCheckedOut()+getLengthOfCheckoutPeriod());
        if(daysLate>0){
            System.out.println("You owe the library $"+(getInitialLateFee()+daysLate*getFeePerLateDay())+
                    "because book is "+daysLate+"days overdue");
        }else{
            System.out.println("Book returned. ty");
        }
        book.setisCheckedout(false, -1);
    }
    public void sorryBookAlreadyCheckedOut(Book book){
        System.out.println("Sorry, "+book.getTitle()+ " is already checked out."+"It should be back on day."+(book.getdayCheckedOut()+getLengthOfCheckoutPeriod()));
        
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Map <String, Book> bookCollection = new HashMap<String, Book>();
        Book harry = new Book("Harry Potter",43124,341412);
        bookCollection.put("Harry Potter", harry);
        LibraryCatalogue lib = new LibraryCatalogue(bookCollection);
        lib.checkOutBook("Harry Potter");
        lib.nextDay();
        lib.nextDay();
        lib.checkOutBook("Harry Potter");
        lib.setDay(17);
        lib.returnBook("Harry Potter");
        lib.checkOutBook("Harry Potter");
        
        
    }
    
}
