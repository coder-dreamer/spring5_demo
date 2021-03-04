package com.lhp.spring5_demo3.bean;

/**
 * @author 53137
 */
public class Book {

    private String bName;
    private String bAuthor;

    public String getbName() {
        return bName;
    }

    public void setbName(String bName) {
        this.bName = bName;
    }

    public String getbAuthor() {
        return bAuthor;
    }

    public void setbAuthor(String bAuthor) {
        this.bAuthor = bAuthor;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bName='" + bName + '\'' +
                ", bAuthor='" + bAuthor + '\'' +
                '}';
    }
}
