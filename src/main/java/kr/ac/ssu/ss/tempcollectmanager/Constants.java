/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package kr.ac.ssu.ss.tempcollectmanager;

/**
 *
 * @author lssang
 */
public interface Constants {
    
    //User Id Control
    public int INIT_RESULT = 0;
    public int DONE = 1;
    public int ALREADY_EXIST = 2;
    
    //ButtonType
    public int ON = 1;
    public int OFF = 2;
    
    //Collector Type
    public int VISION = 10;
    public int BIO = 20;
    public int VOICE = 30;    
    
    //Collector Status
    public int RUNNING = 0;
    public int STOPPED = 1;
    
    //VISIOTN ERROR
    public int VISION_ERROR = -10;
    public int VISION_ERROR_SOMETHING = -11;
            
    //BIO_ERROR
    public int BIO_ERROR = -20;
    
    //VOICE_ERROR
    public int VOICE_ERROR = -30;
}
