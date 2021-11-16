/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.role;

import business.ecosystem.EcoSystem;
import business.user.SystemUser;
import business.user.User;
import javax.swing.JFrame;
import javax.swing.JPanel;
import userinterface.system.SystemMainJPanel;

/**
 *
 * @author yi
 */
public class SystemManagerRole extends Role{
    
    @Override
    public JPanel createWorkArea(JPanel panel,JFrame frame,User user){
        return new SystemMainJPanel ((SystemUser) user,panel,frame);
    }
}
