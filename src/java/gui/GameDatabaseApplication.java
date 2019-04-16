import javax.swing.*;

public class GameDatabaseApplication {  
    public static void main(String[] args) {
        JFrame f=new JFrame();//creating instance of JFrame  
        
        JButton createButton = new JButton("Create Table");
        createButton.setBounds(0,0,150, 50);//x axis, y axis, width, height 
        JButton dropButton = new JButton("Drop Table");
        dropButton.setBounds(0,50,150, 50);//x axis, y axis, width, height
        JButton alterButton = new JButton("Alter Table");
        alterButton.setBounds(0,100,150, 50);//x axis, y axis, width, height 
        
        JTextField textField = new JTextField("Enter in query");
        textField.setBounds(150,0,250,50);
        JButton executeQueryButton = new JButton("Execute query");
        executeQueryButton.setBounds(150,100,150, 50);//x axis, y axis, width, height  
        
        f.add(textField);
        f.add(executeQueryButton);//adding button in JFrame
        f.add(createButton);
        f.add(dropButton);
        f.add(alterButton);
         
        f.setSize(400,500);//400 width and 500 height
        f.setLayout(null);//using no layout managers  
        f.setVisible(true);//making the frame visible  
    }  
}
