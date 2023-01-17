import javax.swing.*;  
import javax.swing.tree.DefaultMutableTreeNode;  

public class JTreeEx {  
    JTreeEg(){  
    JFrame f = new JFrame();   
    DefaultMutableTreeNode menu = new DefaultMutableTreeNode("Kake Di Hatti");  
    DefaultMutableTreeNode tandoori = new DefaultMutableTreeNode("Tandoori");  
    DefaultMutableTreeNode drinks = new DefaultMutableTreeNode("Drinks");  
    menu.add(tandoori);  
    menu.add(drinks);  
    DefaultMutableTreeNode paneer = new DefaultMutableTreeNode("Paneer Tikka");   
    DefaultMutableTreeNode kebab = new DefaultMutableTreeNode("Assorted Kebab");  
    DefaultMutableTreeNode d1 = new DefaultMutableTreeNode("Coca cola");   
    DefaultMutableTreeNode d2 = new DefaultMutableTreeNode("Orange");  
    tandoori.add(paneer);
    tandoori.add(kebab);
    drinks.add(d1);
    drinks.add(d2);      
    JTree jt = new JTree(menu);  
    f.add(jt);  
    f.setSize(200,200);  
    f.setVisible(true);  
    }  
    public static void main(String[] args) {  
        new JTreeEx();  
    }
}
