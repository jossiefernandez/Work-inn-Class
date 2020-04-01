import javax.swing.*;
import java.awt.*;

public class MenuView extends JFrame {

    Menu base = new Menu();
    JMenuBar barraMenu = base.createMenuBar();

    public MenuView() throws HeadlessException {
        super("Prueba Barra Menu");
        setSize(1370, 720);
        setResizable(false);

        add(barraMenu);

        /* ---------SE PUEDE PROBAR DE ESTA MANERA PERO NO ME SIRVE MUCHO PORQUE
        -----------YO AGREGO LA BARRA DIRECTAMENTE
        JPanel panel = new JPanel();
        panel.setName("panelControl");
        panel.add(barraPrueba);
        add(panel);
*/
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) { MenuView m = new MenuView(); }

}
