/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package kr.ac.ssu.ss.collectors;

/**
 *
 * @author lssang
 */
public interface Collector {
    public int startCollecting(String userId, String deviceId);
    public int stopCollecting(String userId, String deviceId);
    
    public int getStatus(String userId, String deviceId); // return 1 or 2 
}
