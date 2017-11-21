/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOs;

import java.io.Serializable;
import java.util.ArrayList;
import models.Post;

/**
 *
 * @author Max
 */
public class PostDAO implements Serializable{
    
    public Post addPost(Post post){
        return null;
    }
    
    public Post getPost(int postID){
        return null;
    }
    
    public ArrayList<Post> getThreadPosts(int threadID){
        ArrayList<Post> posts = new ArrayList<Post>();
        return posts;
    }
    
    public void updatePost(Post post){

    }
}
