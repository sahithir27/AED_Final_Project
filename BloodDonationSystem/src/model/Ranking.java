/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;

/**
 *
 * @author sahithigaddam
 */
public class Ranking {
    
        //EcoSystem ecoSystem;
        ArrayList<Double> heart = new ArrayList<>();
        ArrayList<Double> kidneys = new ArrayList<>();
        ArrayList<Double> liver = new ArrayList<>();
        ArrayList<Double> lungs = new ArrayList<>();
        ArrayList<Double> pancreas = new ArrayList<>();
        ArrayList<Double> intestines = new ArrayList<>();
        ArrayList<Double> blood = new ArrayList<>();
        
        public Ranking() {
        //this.ecoSystem = ecoSystem;
    }

    public void match(String organ){
  
    }

    public int findrank(String organ,double score){
        int rankFinal=0;
        JOptionPane.showMessageDialog(null, organ+" is an Organ");
        if(organ.equalsIgnoreCase("heart")){
            JOptionPane.showMessageDialog(null, "1");
            Collections.sort(heart);
            rankFinal+=(heart.indexOf(score))+1;
        }
        else if(organ.equalsIgnoreCase("kideny")){
            Collections.sort(kidneys);
            rankFinal+=(kidneys.indexOf(score))+1;
        }
        else if(organ.equalsIgnoreCase("liver")){
            Collections.sort(liver);
            rankFinal+=(liver.indexOf(score))+1;
        }
        else if(organ.equalsIgnoreCase("lungs")){
            Collections.sort(lungs);
            rankFinal+=(lungs.indexOf(score))+1;
        }
        else if(organ.equalsIgnoreCase("pancreas")){
            Collections.sort(pancreas);
            rankFinal+=(pancreas.indexOf(score))+1;
        }
        else if(organ.equalsIgnoreCase("intestines")){
            Collections.sort(intestines);
            rankFinal+=(intestines.indexOf(score))+1;
        }
        else if(organ.equalsIgnoreCase("blood")){
            Collections.sort(blood);
            rankFinal+=(blood.indexOf(score))+1;
        }
        return rankFinal;
    }
    
}
