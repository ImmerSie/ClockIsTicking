/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author Max
 */
public class Content {
    private int contentID;
    private String type;
    private String content;
    
    // HAVE A THINK ABOUT WHETHER OR NOT TO DO THIS SUPER/SUBTYPE FOR POST/COMMENT
    private int postID;
    private int commentID;

    public Content() {
    }

    public Content(String type, String content, int parentID) {
        this.type = type;
        this.content = content;
        this.postID = parentID;
    }   

    public int getContentID() {
        return contentID;
    }

    public void setContentID(int contentID) {
        this.contentID = contentID;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getPostID() {
        return postID;
    }

    public void setPostID(int postID) {
        this.postID = postID;
    }

    public int getCommentID() {
        return commentID;
    }

    public void setCommentID(int commentID) {
        this.commentID = commentID;
    }
    
    
}
