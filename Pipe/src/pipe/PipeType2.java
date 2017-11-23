/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pipe;

/**
 *
 * @author Jack
 */
public class PipeType2 extends Pipe {
    private double costPerInch,totalPrice,pipeLength,pipeRadius,pipeAdditional;
    private int pipeGrade,pipeColour,pipeQuantity;
    private boolean pipeInsulation,pipeReinforcedOuter,pipeChemicalReinforced;
    
    // Default Constructer
    public PipeType2()
    {
        pipeLength = 4;
        pipeRadius = 2;
        pipeGrade = 3;
        pipeColour = 0;
        pipeQuantity = 1;
        pipeInsulation = true;
        pipeReinforcedOuter = true;
        pipeChemicalReinforced = true;
        if (pipeGrade == 2) {costPerInch = 0.6;}
        else if (pipeGrade == 3) {costPerInch = 0.75;}
        else if (pipeGrade == 4) {costPerInch = 0.8;}
        pipeAdditional = 0;
    }
    
   // Construter that takes inputs
    public PipeType2(double pipeLength, double pipeRadius, int pipeGrade,int pipeColour,int pipeQuantity,
            boolean pipeInsulation, boolean pipeReinforcedOuter, boolean pipeChemicalReinforced)
    {
        this.pipeLength = pipeLength;
        this.pipeRadius = pipeRadius;
        this.pipeGrade = pipeGrade;
        this.pipeColour = pipeColour;
        this.pipeQuantity = pipeQuantity;
        this.pipeInsulation = pipeInsulation;
        this.pipeReinforcedOuter = pipeReinforcedOuter;
        this.pipeChemicalReinforced = pipeChemicalReinforced;
        if (pipeGrade == 2) {costPerInch = 0.6;}
        else if (pipeGrade == 3) {costPerInch = 0.75;}
        else if (pipeGrade == 4) {costPerInch = 0.8;}
        pipeAdditional = 0;
    }
    
    //Method that calculates the price
    public double calculatePrice()
    {
        //If the pipe has Chemical resistance
        pipeAdditional = 0;
        if(pipeChemicalReinforced){
            // adds 14% to the additional cost variable
            pipeAdditional = pipeAdditional + 0.14;
        }
        //The pipe has to have 1 colour so 13% is added
        pipeAdditional = pipeAdditional + 0.13;
        // This times the price per inch by the percentage of additional charges
        costPerInch = costPerInch * (1 + pipeAdditional);
        //This converts the meters provided into inches for calculation
        double metersToInches;
        metersToInches = pipeLength * 39.37;
        //This calculates the inner radius
        double pipeMaterialRad;
        pipeMaterialRad = pipeRadius * 0.90;
        // Calculates the difference between the inner and outer radius (so we can calculate based on material used)
        double radDifference;
        radDifference = pipeRadius - pipeMaterialRad;
        //Calculates the volume
        double pipeVolume;
        pipeVolume = (Math.PI * radDifference*radDifference* metersToInches);
        //Calculates the total cost of the order
        double totalCost = (pipeVolume * costPerInch) * pipeQuantity;
        totalPrice = totalCost;
        return totalCost;
    }
    public double returnPrice()
    {
        return totalPrice;
    }
    public int returnGrade()
    {
        return pipeGrade;
    }
    public double returnLength()
    {
        return pipeLength;
    }
    public double returnRadius()
    {
        return pipeRadius;
    }
    public int returnColour()
    {
        return pipeColour;
    }
    public int returnQuantity()
    {
        return pipeQuantity;
    }
    public boolean returnInsulation()
    {
        return pipeInsulation;
    }
    public boolean returnReinforcedOuter()
    {
        return pipeReinforcedOuter;
    }
    public boolean returnChemicalReinforced()
    {
        return pipeChemicalReinforced;
    }
        public void printOut() {
        System.out.println(totalPrice);
    }
}
