package day30_inheritance;

public class EBook extends Book {

    private String size;
    private int pages;


    public EBook(String title, String type, String author, double price) {
        super(title, type, author, price);


    }

    public EBook(String title, String type, String author, double price, String size, int pages) {
        super(title, type, author, price);
        this.size = size;

        if(pages<= 0){
            System.err.println("Invalid number of pages");
            System.exit(1);      // setPages(pages);
        }else{
            this.pages=pages;
        }
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        if(pages<=0){
            System.err.println("invalid number of pages");
            System.exit(1);
        }else {
            this.pages = pages;
        }

    }


    @Override
    public String toString() {
        return "EBook{" +
                "size='" + size + '\'' +
                ", pages=" + pages +
                "} " + super.toString();
    }
}
/*
 Create a sub class of Book named EBook:
			Extra variables:
				size, pages

			Encapsulate all the extra fields
					Conditions:
						1. pages can not be set to zero or negative

			Add a constructor that can set all the fields

			Extra Methods:
				readBook()

 */