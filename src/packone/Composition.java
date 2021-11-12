
package packone;

class Pages{
    int pageCount;
    int hight;
    //constructor
    public Pages(int pageCount,int hight){
        this.hight = hight;
        this.pageCount = pageCount;
    }
}

class Book {
    String type;
    String product;
    Pages objPage;
    
    public Book(String type, String product,int pageCount,int hight){
        this.type = type;
        this.product = product;
        objPage = new Pages(pageCount, hight);
    }
    void printMethod(){
        System.out.println("Type : "+type+"\n"+"Product : "+product+"\n"+
                "Pages Count :"+objPage.pageCount+"\n"+"Height : "+objPage.hight);
    }
}


public class Composition{    
    public static void main(String[] args) {
        Book objBook = new Book("CR","Atlas", 80, 180);
        objBook.printMethod();
        
    }
    
}