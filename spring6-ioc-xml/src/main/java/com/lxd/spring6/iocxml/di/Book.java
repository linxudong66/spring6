package com.lxd.spring6.iocxml.di;

public class Book {
    private String bname ;
    private  String author ;

    private String others ;

    public Book(String bname, String author) {
        System.out.println("有参数构造。。");
        this.bname = bname;
        this.author = author;
    }

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    public String getAuthor() {
        return author;
    }

    public String getOthers() {
        return others;
    }

    public void setOthers(String others) {
        this.others = others;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Book() {
    }

    @Override
    public String toString() {
        return "Book{" +
                "bname='" + bname + '\'' +
                ", author='" + author + '\'' +
                ", others='" + others + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Book book = new Book();
        book.setBname("JAVA");
        book.setAuthor("lxd");

        Book book1 = new Book("java","lss");



    }
}
