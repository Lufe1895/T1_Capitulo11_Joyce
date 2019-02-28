/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo_11;

/**
 *
 * @author luisl
 */
public abstract class Story {
    protected String title;
    protected String author;
    protected Integer pages;
    protected String message;

    public Story(String title, String author) {
        this.title = title;
        this.author = author;
        this.pages = 0;
        this.message = "";
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

    public Integer getPages() {
        return pages;
    }

    public abstract void setPages(Integer pages);

    public String getMessage() {
        return message;
    }

    public abstract void setMessage();
    
    public abstract String toString();

}
