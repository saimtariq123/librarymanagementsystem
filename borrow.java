import java.io.Serializable;

public class borrow {
    int checkid;
    String bookTitle;


    public borrow(int checkid, String bookTitle){
        this.checkid = checkid;
        this.bookTitle = bookTitle;
        
    }

    @Override
    public String toString() {
        return  checkid + "," + bookTitle;
    }
}
