/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOs;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Max
 */
public class ThreadDAO implements Serializable{
    
    public Thread addThread(Thread thread){
        return null;
    }
    
    public Thread getThread(int threadID){
        return null;
    }
    
    public ArrayList<Thread> getUserThreads(int userID){
        ArrayList<Thread> threads = new ArrayList<Thread>();
        return threads;
    }
    
    public void updateThread(Thread thread){
        
    }
}
