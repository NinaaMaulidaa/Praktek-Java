/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

/**
 *
 * @author thinpad
 */
import java.awt.*;
public class FrameWControls extends Frame {
    public static void main(String args []) {
        FrameWControls fwc = new FrameWControls ();
        
        fwc.setLayout(new FlowLayout()); //menentukan posisi dan ukuran
        fwc.setSize (600, 600);
        fwc.add (new Button ("Test Me!"));
        fwc.add (new Label("Label"));
        fwc.add (new TextField());
        
        CheckboxGroup cbg = new CheckboxGroup();
        fwc.add (new Checkbox("Chk1", cbg, true));
        fwc.add (new Checkbox("Chk2", cbg, false));
        fwc.add (new Checkbox("Chk3", cbg, false));
        fwc.setVisible (true);
    }
    
    
}
