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
public final class ShortStory extends Story{
    private static final Integer LIMIT = 50;

    public ShortStory(String title, String author,Integer pages) {
        super(title, author);
        setPages(pages);
        setMessage();
    }
    
    public void setPages(Integer pages){
        super.pages=pages;
    }
    
    public void setMessage(){
        if(super.pages>=LIMIT){
            super.message=String.format("You need %d pages less.",super.pages-LIMIT);
        }
    }
    
    public String toString(){
        return String.format("Title: %s\nAuthor: %s\nNumber of pages: %d\n%s\n",super.getTitle(),super.getAuthor(),super.getPages(),super.getMessage());
    }
    
}
