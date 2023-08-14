//importing the awt(abstract window toolkit) library
import java.awt.*;

class calculator extends Frame{
    calculator(){
        Button b = new Button("click Me");
        b.setBounds(30,100,80,30);
        add(b);
        setSize(300,300);
        setTitle("This is the first public commit");
        setLayout(null);
        setVisible(true);
    }
}

public class Main {
    public static void main(String[] args){
        calculator c = new calculator();
    }
}
