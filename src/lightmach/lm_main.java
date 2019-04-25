package lightmach;

import java.awt.Cursor;
import java.awt.Desktop;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import org.jutils.jhardware.HardwareInfo;
import org.jutils.jhardware.model.ProcessorInfo;

public class lm_main extends javax.swing.JFrame {


    public static final String version_String = "Lightmach v1.0.01";
    private boolean iconshown = false;
    public lm_main() {
        this.setTitle( version_String );
        CursorInitializator();
        setIconImage( Toolkit.getDefaultToolkit().getImage( getClass().getResource( "appicon.png" ) ) );
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new keeptoo.KGradientPanel();
        kGradientPanel2 = new keeptoo.KGradientPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        kGradientPanel3 = new keeptoo.KGradientPanel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setOpacity(0.97F);

        kGradientPanel1.setkBorderRadius(0);
        kGradientPanel1.setkEndColor(new java.awt.Color(30, 30, 47));
        kGradientPanel1.setkGradientFocus(670);
        kGradientPanel1.setkStartColor(new java.awt.Color(38, 38, 38));

        kGradientPanel2.setkBorderRadius(0);
        kGradientPanel2.setkEndColor(new java.awt.Color(255, 255, 250));
        kGradientPanel2.setkGradientFocus(2000);
        kGradientPanel2.setkStartColor(new java.awt.Color(30, 30, 47));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lightmach/wifi_icon.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel1MouseExited(evt);
            }
        });

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lightmach/hardware_icon.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel2MouseExited(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lightmach/temp_icon.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel3MouseExited(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lightmach/off_icon.png"))); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel4MouseExited(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lightmach/settings_icon.png"))); // NOI18N
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel5MouseExited(evt);
            }
        });

        javax.swing.GroupLayout kGradientPanel2Layout = new javax.swing.GroupLayout(kGradientPanel2);
        kGradientPanel2.setLayout(kGradientPanel2Layout);
        kGradientPanel2Layout.setHorizontalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel2Layout.createSequentialGroup()
                        .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        kGradientPanel2Layout.setVerticalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(13, 13, 13)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 434, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addContainerGap())
        );

        kGradientPanel3.setkBorderRadius(0);
        kGradientPanel3.setkEndColor(new java.awt.Color(255, 255, 255));
        kGradientPanel3.setkGradientFocus(3000);
        kGradientPanel3.setkStartColor(new java.awt.Color(30, 30, 54));

        javax.swing.GroupLayout kGradientPanel3Layout = new javax.swing.GroupLayout(kGradientPanel3);
        kGradientPanel3.setLayout(kGradientPanel3Layout);
        kGradientPanel3Layout.setHorizontalGroup(
            kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        kGradientPanel3Layout.setVerticalGroup(
            kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 102, Short.MAX_VALUE)
        );

        jLabel6.setFont(new java.awt.Font("Leipziger Messe", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Lightmach 1.0.01");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel6MouseExited(evt);
            }
        });

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addComponent(kGradientPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(kGradientPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 1027, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                        .addGap(0, 948, Short.MAX_VALUE)
                        .addComponent(jLabel6))))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 655, Short.MAX_VALUE)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addComponent(kGradientPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1089, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 655, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    //          WIFI icon
    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked

    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseEntered
        sidebarIcon( 1 );
    }//GEN-LAST:event_jLabel1MouseEntered

    private void jLabel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseExited
        sidebarIcon( 1 );
    }//GEN-LAST:event_jLabel1MouseExited

    private void jLabel6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseEntered
        jLabel6.setText( "www.github.com/Bashovski" );
    }//GEN-LAST:event_jLabel6MouseEntered

    private void jLabel6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseExited
        jLabel6.setText( version_String );
    }//GEN-LAST:event_jLabel6MouseExited

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        try {
            ConvertPage( new URL( "https://github.com/Bashovski" ) );
        } catch (MalformedURLException ex) {
            Logger.getLogger( lm_main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseExited
        sidebarIcon( 4 );
    }//GEN-LAST:event_jLabel4MouseExited

    private void jLabel4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseEntered
        sidebarIcon( 4 );
    }//GEN-LAST:event_jLabel4MouseEntered

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        System.exit( 0 );
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseEntered
        sidebarIcon( 2 );
    }//GEN-LAST:event_jLabel2MouseEntered

    private void jLabel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseExited
        sidebarIcon( 2 );
    }//GEN-LAST:event_jLabel2MouseExited

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseEntered
        sidebarIcon( 3 );
    }//GEN-LAST:event_jLabel3MouseEntered

    private void jLabel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseExited
        sidebarIcon( 3 );
    }//GEN-LAST:event_jLabel3MouseExited

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseEntered
        sidebarIcon( 5 );
    }//GEN-LAST:event_jLabel5MouseEntered

    private void jLabel5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseExited
        sidebarIcon( 5 );
    }//GEN-LAST:event_jLabel5MouseExited

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked

    }//GEN-LAST:event_jLabel5MouseClicked

    public void sidebarIcon( int iconid ) {
        iconshown = !iconshown;
        if( iconshown == true ) {
            File sound = new File( "cursorsound.wav" );
            ps( sound );
        }
        if( iconid == 1 ) {
            if( iconshown ) jLabel1.setIcon( new javax.swing.ImageIcon(getClass().getResource("/Lightmach/wifi_icon_hover.png" ) ) );
            else jLabel1.setIcon( new javax.swing.ImageIcon(getClass().getResource("/Lightmach/wifi_icon.png" ) ) );
        }
        else if( iconid == 2 ) {
            if( iconshown ) jLabel2.setIcon( new javax.swing.ImageIcon(getClass().getResource("/Lightmach/hardware_icon_hover.png" ) ) );
            else jLabel2.setIcon( new javax.swing.ImageIcon(getClass().getResource("/Lightmach/hardware_icon.png" ) ) );
        }
        else if( iconid == 3 ) {
            if( iconshown ) jLabel3.setIcon( new javax.swing.ImageIcon(getClass().getResource("/Lightmach/temp_icon_hover.png" ) ) );
            else jLabel3.setIcon( new javax.swing.ImageIcon(getClass().getResource("/Lightmach/temp_icon.png" ) ) );
        }
        else if( iconid == 4 ) {
            if( iconshown ) jLabel4.setIcon( new javax.swing.ImageIcon(getClass().getResource("/Lightmach/off_icon_hover.png" ) ) );
            else jLabel4.setIcon( new javax.swing.ImageIcon(getClass().getResource("/Lightmach/off_icon.png" ) ) );
        }
        else if( iconid == 5 ) {
            if( iconshown ) jLabel5.setIcon( new javax.swing.ImageIcon(getClass().getResource("/Lightmach/settings_icon_hover.png" ) ) );
            else jLabel5.setIcon( new javax.swing.ImageIcon(getClass().getResource("/Lightmach/settings_icon.png" ) ) );
        }
    }
    
    public boolean openWebpage(URI uri) {
        Desktop desktop = Desktop.isDesktopSupported() ? Desktop.getDesktop() : null;
        if ( desktop != null && desktop.isSupported( Desktop.Action.BROWSE ) ) {
            try {
                desktop.browse(uri);
                return true;
            } catch ( Exception e ) {
                e.printStackTrace();
            }
        }
        return false;
    }
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new lm_main().setVisible(true);
            }
        });
    }
    
    public boolean ConvertPage( URL url ) {
        try {
            return openWebpage( url.toURI() );
        } catch ( URISyntaxException e ) {
            e.printStackTrace();
        }
        return false;
    }
    
    private void playSound( ) {
        File sound = new File( "sm_clicksound.wav" );
        ps( sound );
    }
    
    private void ps( File sound ) {
        try {
            Clip clip = AudioSystem.getClip();
            clip.open( AudioSystem.getAudioInputStream( sound ) );
            clip.start();
            
        } catch( Exception ex ) {
            System.out.println( ex );
        }
    }
    public void CursorInitializator( ) {
        
        Toolkit kit = Toolkit.getDefaultToolkit();
        Image image = kit.getImage( "cursor.png" );
        Point point = new Point( 0, 0 );
        Cursor cursor;
        cursor = kit.createCustomCursor( image, point, "Cursor" );

        setCursor( cursor );

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private keeptoo.KGradientPanel kGradientPanel1;
    private keeptoo.KGradientPanel kGradientPanel2;
    private keeptoo.KGradientPanel kGradientPanel3;
    // End of variables declaration//GEN-END:variables
}
