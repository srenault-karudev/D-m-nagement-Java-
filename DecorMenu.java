
     

    import javax.swing.JComponent;
    import java.awt.Graphics;
    import javax.swing.*;
    import java.awt.*;


    public class DecorMenu extends JComponent {
        /**
         *la variable qui va contenir l'image de la decor pour le menu principal
         */
      private Image decor;
      public DecorMenu(){
        super();
        decor=Toolkit.getDefaultToolkit().getImage("images/decor.png");
      }
      @Override
      public void paintComponent(Graphics pinceau) {
     
        Graphics secondPinceau = pinceau.create();
        
        if (this.isOpaque()) {
       
          secondPinceau.setColor(this.getBackground());
          secondPinceau.fillRect(0, 0, this.getWidth(), this.getHeight());
        }
          secondPinceau.drawImage(decor,100,0,this);
      }
    }
