package learn.kj.domain;

import java.io.Serializable;
import java.util.List;
import java.util.Map;


public class Book implements Serializable {

    private Integer id;
    private String bookName;
    private Integer kind_id;
    private String author;
    private String company;
    private Double price;

    private Kind kind;


    public Kind getKind() {
        return kind;
    }

    public void setKind(Kind kind) {
        this.kind = kind;
    }





    public Integer getId() {

        return id;
    }



    public void setId(Integer id) {

        this.id = id;
    }



    public String getBookName() {

        return bookName;
    }



    public void setBookName(String bookName) {

        this.bookName = bookName;
    }



    public Integer getKind_id() {

        return kind_id;
    }



    public void setKind_id(Integer kind_id) {

        this.kind_id = kind_id;
    }


    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCompany() {

        return company;
    }



    public void setCompany(String company) {

        this.company = company;
    }



    public Double getPrice() {

        return price;
    }



    public void setPrice(Double price) {

        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", bookName='" + bookName + '\'' +
                ", kind_id=" + kind_id +
                ", author='" + author + '\'' +
                ", company='" + company + '\'' +
                ", price=" + price +
                ", kind=" + kind +
                '}';
    }
}
