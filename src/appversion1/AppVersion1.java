
package appversion1;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class AppVersion1 {

    static ArrayList<Double> numbs = new ArrayList<Double>();
    public static void main(String[] args) {
        
        while (true){
            
        
            String message = "1) Add\n2) Subtract\n3) Multiply\n4) Divide\n5) Final Answer\n6) Exit";
            String options = JOptionPane.showInputDialog(message);
            calcAdd(options);
            calcSub(options);
            calcMultip(options);
            calcDiv(options);

            if(options.equals("5"))
            {
                double finalSum = 0;
                for(int i = 0; i < numbs.size();i++)
                {
                    finalSum += numbs.get(i);
                }
                JOptionPane.showMessageDialog(null, "Result: " + numbs + "\nFinal Result: " + finalSum);
                
                int choice = JOptionPane.showConfirmDialog(null, "Clear history?", "Clear Calculator", JOptionPane.YES_NO_OPTION); //This is the AC button on a physical calculator it is there to clear the clear calculator to allow new inputs
                if(choice == JOptionPane.YES_OPTION) {
                    numbs.clear();
                }
            }
            
            if(options.equals("6"))
            {
                JOptionPane.showMessageDialog(null, "Goodbye!");
                System.exit(0);
            }
            
        }
    }
    
    public static void calcAdd(String options)
    {
        if(options.equals("1"))
        {
            int addTotal = 0;
            while(true) {
                int num = Integer.parseInt(JOptionPane.showInputDialog("Enter number(0 to end): "));
                if(num == 0)
                    break;
                addTotal += num;
                
            }
            numbs.add((double) addTotal);
            JOptionPane.showMessageDialog(null,"Answer: " + addTotal, "Addition Total", JOptionPane.INFORMATION_MESSAGE);
        }
        
    }
    
    public static void calcSub(String options)
    {
        
        if(options.equals("2"))
        {
            int firstNum = Integer.parseInt(JOptionPane.showInputDialog("Enter number: "));
            
            double subTotal = firstNum;
            while(true)
            {
                int num = Integer.parseInt(JOptionPane.showInputDialog("Enter number(0 to end): "));
                if(num == 0)
                    break;
                
                subTotal -= num;
                
            }
            numbs.add(subTotal);
            JOptionPane.showMessageDialog(null,"Answer: " + subTotal, "Subtract Total", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    public static void calcMultip(String options){
        if(options.equals("3"))
        {
            int firstNum = Integer.parseInt(JOptionPane.showInputDialog("Enter number: "));
            
            double  multipTotal = firstNum;
            while(true)
            {
                String input = JOptionPane.showInputDialog("Enter a number (cancel to stop):");
                if (input == null) 
                    break;
                
                int num = Integer.parseInt(input);
                multipTotal *= num;
                
                        
            }
            numbs.add(multipTotal);
            JOptionPane.showMessageDialog(null,"Answer: " + multipTotal, "Multiply Total", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    public static void calcDiv(String options){
        if(options.equals("4"))
        {
            int firstNum = Integer.parseInt(JOptionPane.showInputDialog("Enter number: "));
            
            double divTotal = firstNum;
            while(true)
            {
                String input = JOptionPane.showInputDialog("Enter a number (cancel to stop):");
                if (input == null || input.equals("0"))
                {
                    break;
                }
                
                int num = Integer.parseInt(input);
                divTotal /= num;
                
            }
            numbs.add(divTotal);
            JOptionPane.showMessageDialog(null,"Answer: " + divTotal, "Divide Total", JOptionPane.INFORMATION_MESSAGE);
        }
    }
       
}
