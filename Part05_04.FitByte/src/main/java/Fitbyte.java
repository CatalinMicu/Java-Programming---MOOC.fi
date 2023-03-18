/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CiCi
 */
public class Fitbyte {
    private int Age;
    private int restingHeartRate;
    
    public Fitbyte(int Age, int restingHeartRate) {
        this.Age = Age;
        this.restingHeartRate = restingHeartRate;
    }
    
    public double targetHeartRate (double percentageOfMaximum) {
        double maximumHeartRate = 206.3 - (0.711 * Age);
        double targetHeartRate = (maximumHeartRate - restingHeartRate) * percentageOfMaximum;
        return targetHeartRate + restingHeartRate; 
    }
}
