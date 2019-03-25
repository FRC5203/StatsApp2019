package desktop;

import javax.swing.*;
import java.io.Serializable;
import java.util.HashMap;

public class Form extends JPanel implements Serializable {

    JPanel panel;
    HashMap<JTextField, JTextField> fields = new HashMap<>();
    HashMap<String, Integer> vars = new HashMap<>();

    public Form(JPanel panel){
        this.panel = panel;

        newField("Team Number");
    }

    public void newVar(String name, Integer val){
        vars.put(name, val);
    }

    public void newField(String name){
        JTextField f = new JTextField();
        panel.add(f);
        f.setText(name);
        f.setEditable(false);

        JTextField f2 = new JTextField();
        panel.add(f2);
        f2.setBounds();
    }
}
