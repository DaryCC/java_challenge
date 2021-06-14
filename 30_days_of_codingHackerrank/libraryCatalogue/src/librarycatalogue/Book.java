
package librarycatalogue;


public class Book {
  
    String title;
    int pageCount;
    int ISBN;
    boolean isCheckedout;
    int dayCheckedOut= -1;
    //constrcutor
    public Book(String title,int bookPageCount, int ISBN){
        this.ISBN=ISBN;
        this.pageCount=bookPageCount;
        this.title=title;
        isCheckedout=false;

    }
        public String getTitle() {
        return title;
    }

    public int getPageCount() {
        return pageCount;
    }

    public int getISBN() {
        return ISBN;
    }
     public int getdayCheckedOut() {
        return dayCheckedOut;
    }

    public boolean getisCheckedout() {
        return isCheckedout;
    }
    //STEERS

    public void setisCheckedout(boolean isCheckedout,int currentDayCheckedOut) {
        this.isCheckedout = isCheckedout;
        setDayCheckedOut(currentDayCheckedOut);
    }

    private void setDayCheckedOut(int dayCheckedOut) {
        this.dayCheckedOut = dayCheckedOut;
    }
    
}
