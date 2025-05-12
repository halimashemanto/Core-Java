
package librarymanagementsystem.sup;


public class LibrarySuper {
  
    private String title;
    private String author;
    private int yearPublished;

    public LibrarySuper() {
    }

    public LibrarySuper(String title, String author, int yearPublished) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }

    @Override
    public String toString() {
        return "LibrarySuper{" + "title=" + title + ", author=" + author + ", yearPublished=" + yearPublished + '}';
    }
    
    public void detailsBased (){
    
        System.out.println("Title = " + title +"\n" + "Author = " + author  +"\n"+ "Year Published = " + yearPublished );
    }
    
}
