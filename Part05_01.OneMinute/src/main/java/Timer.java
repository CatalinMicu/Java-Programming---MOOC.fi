/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CiCi
 */

public class Timer {
    private ClockHand sutimi;
    private ClockHand secunde;
    
    public Timer() {
        this.sutimi = new ClockHand(100);
        this.secunde = new ClockHand(60);
}
    
    public void advance() {
        this.sutimi.advance();
        
        if (this.sutimi.value() == 0) {
            this.secunde.advance();
            
        }
        
    }
   
    public String toString() {
        return secunde + ":" + sutimi;
    }
}




