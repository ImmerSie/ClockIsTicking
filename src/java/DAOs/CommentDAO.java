/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOs;

import java.io.Serializable;
import java.util.ArrayList;
import models.Comment;

/**
 *
 * @author Max
 */
public class CommentDAO implements Serializable{
    
    public Comment addComment(Comment comment){
        return null;
    }
    
    public Comment getComment(int commentID){
        return null;
    }
    
    public ArrayList<Comment> getPostComments(int postID){
        ArrayList<Comment> comments = new ArrayList<Comment>();
        return comments;
    }
    
    public void updateComment(Comment comment){
        
    }
}
