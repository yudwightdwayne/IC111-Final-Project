import javax.swing.*;
import java.awt.*;

public class FinalProject_PP_Luz_Mohammad_Polbo_Yu {
    public static void main(String[] args) {
        JFrame frame = new JFrame("To-Do List");
        frame.setSize(600, 400); //This means the window will be 600 pixels wide and 400 pixels tall.
        frame.setVisible(true);
      
        double percentageOfTasksDone;
        String confirmationMessage = "Do you wish to input again?";
      
        char option = 'y';
        do {
            // ---------------------
            
            // ---------------------
            
            JOptionPane yesOrNo = new JOptionPane("Task added successfully.\nDo you wish to input again?", JOptionPane.QUESTION_MESSAGE, JOptionPane.YES_NO_OPTION);
         
            JDialog dialog = yesOrNo.createDialog(frame, "Continuation");
            dialog.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
            dialog.setLocationRelativeTo(frame);
            dialog.setVisible(true);
         
            int userResponse = (int)yesOrNo.getValue();
                  
            if(userResponse == JOptionPane.YES_OPTION) option = 'y';
            else if(userResponse == JOptionPane.NO_OPTION) option = 'n';
        } while(option == 'y');
        frame.dispose();
    }
}
