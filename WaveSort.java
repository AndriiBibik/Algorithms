
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Potato
 */
public class WaveSort {
    public static void main(String[] args){
        long time1 = (new Date()).getTime();
        int[] waveSort = {8,1,12, 1, 5, 8, 3, 13, 6, 4, 16, 3, 1, 7, 5, 
                    3, 8,1,12, 1, 5, 8, 3, 13, 6, 4, 16, 3, 1, 7, 5, 3, 8, 1, 
                    12, 1, 5, 8, 3, 13, 6, 4, 16, 3, 1, 7, 5, 3, 8,1,12, 1, 5, 8, 3, 13, 6, 4, 16, 3, 1, 7, 5, 
                    3, 8,1,12, 1, 5, 8, 3, 13, 6, 4, 16, 3, 1, 7, 5, 3, 8, 1, 
                    12, 1, 5, 8, 3, 13, 6, 4, 16, 3, 1, 7, 5, 3, 8,1,12, 1, 5, 8, 3, 13, 6, 4, 16, 3, 1, 7, 5, 
                    3, 8,1,12, 1, 5, 8, 3, 13, 6, 4, 16, 3, 1, 7, 5, 3, 8, 1, 
                    12, 1, 5, 8, 3, 13, 6, 4, 16, 3, 1, 7, 5, 3, 8,1,12, 1, 5, 8, 3, 13, 6, 4, 16, 3, 1, 7, 5, 
                    3, 8,1,12, 1, 5, 8, 3, 13, 6, 4, 16, 3, 1, 7, 5, 3, 8, 1, 
                    12, 1, 5, 8, 3, 13, 6, 4, 16, 3, 1, 7, 5, 3, 8,1,12, 1, 5, 8, 3, 13, 6, 4, 16, 3, 1, 7, 5, 
                    3, 8,1,12, 1, 5, 8, 3, 13, 6, 4, 16, 3, 1, 7, 5, 3, 8, 1, 
                    12, 1, 5, 8, 3, 13, 6, 4, 16, 3, 1, 7, 5, 3, 8,1,12, 1, 5, 8, 3, 13, 6, 4, 16, 3, 1, 7, 5, 
                    3, 8,1,12, 1, 5, 8, 3, 13, 6, 4, 16, 3, 1, 7, 5, 3, 8, 1, 
                    12, 1, 5, 8, 3, 13, 6, 4, 16, 3, 1, 7, 5, 3, 8,1,12, 1, 5, 8, 3, 13, 6, 4, 16, 3, 1, 7, 5, 
                    3, 8,1,12, 1, 5, 8, 3, 13, 6, 4, 16, 3, 1, 7, 5, 3, 8, 1, 
                    12, 1, 5, 8, 3, 13, 6, 4, 16, 3, 1, 7, 5, 3, 8,1,12, 1, 5, 8, 3, 13, 6, 4, 16, 3, 1, 7, 5, 
                    3, 8,1,12, 1, 5, 8, 3, 13, 6, 4, 16, 3, 1, 7, 5, 3, 8, 1, 
                    12, 1, 5, 8, 3, 13, 6, 4, 16, 3, 1, 7, 5, 3, 8,1,12, 1, 5, 8, 3, 13, 6, 4, 16, 3, 1, 7, 5, 
                    3, 8,1,12, 1, 5, 8, 3, 13, 6, 4, 16, 3, 1, 7, 5, 3, 8, 1, 
                    12, 1, 5, 8, 3, 13, 6, 4, 16, 3, 1, 7, 5, 3, 8,1,12, 1, 5, 8, 3, 13, 6, 4, 16, 3, 1, 7, 5, 
                    3, 8,1,12, 1, 5, 8, 3, 13, 6, 4, 16, 3, 1, 7, 5, 3, 8, 1, 
                    12, 1, 5, 8, 3, 13, 6, 4, 16, 3, 1, 7, 5, 3, 8,1,12, 1, 5, 8, 3, 13, 6, 4, 16, 3, 1, 7, 5, 
                    3, 8,1,12, 1, 5, 8, 3, 100, 13, 6, 4, 16, 3, 1, 7, 5, 3, 8, 1, 
                    12, 1, 5, 8, 3, 13, 6, 4, 16, 3, 1, 7, 5, 3, 8,1,12, 1, 5, 8, 3, 13, 6, 4, 16, 3, 1, 7, 5, 
                    3, 8,1,12, 1, 5, 8, 3, 13, 6, 4, 16, 3, 1, 7, 5, 3, 8, 1, 
                    12, 1, 5, 8, 3, 13, 6, 4, 16, 3, 1, 7, 5, 3, 8,1,12, 1, 5, 8, 3, 13, 6, 4, 16, 3, 1, 7, 5, 
                    3, 8,1,12, 1, 5, 8, 3, 13, 6, 4, 16, 3, 1, 7, 5, 3, 8, 1, 
                    12, 1, 5, 8, 3, 13, 6, 4, 16, 3, 1, 7, 5, 3, 8,1,12, 1, 5, 8, 3, 13, 6, 4, 16, 3, 1, 7, 5, 
                    3, 8,1,12, 1, 5, 8, 3, 13, 6, 4, 16, 3, 1, 7, 5, 3, 8, 1, 
                    12, 1, 5, 8, 3, 13, 6, 4, 16, 3, 1, 7, 5, 3, 8,1,12, 1, 5, 8, 3, 13, 6, 4, 16, 3, 1, 7, 5, 
                    3, 8,1,12, 1, 5, 8, 3, 13, 6, 4, 16, 3, 1, 7, 5, 3, 8, 1, 
                    12, 1, 5, 8, 3, 13, 6, 4, 16, 3, 1, 7, 5, 3, 8,1,12, 1, 5, 8, 3, 13, 6, 4, 16, 3, 1, 7, 5, 
                    3, 8,1,12, 1, 5, 8, 3, 13, 6, 4, 16, 3, 1, 7, 5, 3, 8, 1, 
                    12, 1, 5, 8, 3, 13, 6, 4, 16, 3, 1, 7, 5, 3};
        
        int arrayLength = waveSort.length;
        
        int firstElementInd = 0;
        int lastElementInd = arrayLength - 1;
        
        int indMax = 0;
        int indMin = 0;
        
        int index = 0;
        
        int numSteps = 0;
        
        while(lastElementInd - firstElementInd >= 2){
            indMax = firstElementInd;
            indMin = firstElementInd;
            
            index = firstElementInd;
            
            while(index < lastElementInd){
                if (waveSort[index + 1] > waveSort[indMax]){
                    indMax = index + 1;
                }
                else if (waveSort[index + 1] < waveSort[indMin]){
                    indMin = index + 1;
                }
                index +=1;
                numSteps += 1;
                
            }
            int buffMax = waveSort[indMax];
            int buffMin = waveSort[indMin];
            
            waveSort[indMin] = waveSort[firstElementInd];
            waveSort[indMax] = waveSort[lastElementInd];
            
            waveSort[firstElementInd] = buffMin;
            waveSort[lastElementInd] = buffMax;
            
            firstElementInd += 1;
            lastElementInd -= 1;
        }
        for (int arrEl : waveSort){
            System.out.print(arrEl + " ");
        }
        long time2 = (new Date()).getTime();
        long processingTime = time2 - time1;
        System.out.println("\nprogram WaveSort worked for " + processingTime + " miliseconds. Number of steps = " + numSteps);
    }
}
