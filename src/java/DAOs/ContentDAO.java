/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOs;

import java.io.Serializable;
import java.util.ArrayList;
import models.Content;

/**
 *
 * @author Max
 */
public class ContentDAO implements Serializable{
    
    public Content addContent(Content content){
        return null;
    }
    
    public Content getContent(int contentID){
        return null;
    }
    
    public ArrayList<Content> getPostContent(int postID){
        ArrayList<Content> contents = new ArrayList<Content>();
        return contents;
    }
    
    public ArrayList<Content> getCommentContent(int commentID){
        ArrayList<Content> contents = new ArrayList<Content>();
        return contents;
    }
    
    public void updateContent(Content content){
        
    }
}
