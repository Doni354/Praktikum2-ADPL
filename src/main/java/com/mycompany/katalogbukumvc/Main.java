/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.katalogbukumvc;

import com.mycompany.katalogbukumvc.controller.BukuController;
import com.mycompany.katalogbukumvc.model.BukuModel;
import com.mycompany.katalogbukumvc.view.BukuView;

/**
 *
 * @author muhammadyoga
 */
public class Main {
    public static void main(String[] args) {
         try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
                System.err.println("Main: This Theme GUI Not Responding");
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            BukuModel model = new BukuModel();
            BukuView view = new BukuView();
            
            new BukuController(model, view);
            view.setVisible(true);
        });
    }
}











