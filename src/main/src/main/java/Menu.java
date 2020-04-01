import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu extends Component implements ActionListener {

    JMenuBar menu;
    JMenu menu1, menu2, menu3;
    JMenuItem itemPacientes, itemPacienteNuevo, itemConsultorios, itemConsultorioNuuevo, itemCitas, itemCitaNueva;
   // PacienteView pacientes;
    //PacienteNuevoView pacienteNuevo;

    public Menu() throws HeadlessException {

    }

    public JMenuBar createMenuBar() {
        menu = new JMenuBar();
        menu1 = new JMenu("Paciente");
        menu2 = new JMenu("Consulturio");
        menu3 = new JMenu("Cita");
        itemCitas = new JMenuItem("Citas");
        itemCitaNueva = new JMenuItem("Cita Nueva");
        itemConsultorios = new JMenuItem("Consultorios");
        itemConsultorioNuuevo = new JMenuItem("Cosultorio Nuevo");
        itemPacientes = new JMenuItem("Pacientes");
        itemPacienteNuevo = new JMenuItem("Paciente Nuevo");

        itemPacientes.addActionListener(this);
        itemPacienteNuevo.addActionListener(this);
        itemConsultorios.addActionListener(this);
        itemConsultorioNuuevo.addActionListener(this);
        itemCitas.addActionListener(this);
        itemCitaNueva.addActionListener(this);

        menu1.add(itemPacientes);
        menu1.add(itemPacienteNuevo);
        menu2.add(itemConsultorios);
        menu2.add(itemConsultorioNuuevo);
        menu3.add(itemCitas);
        menu3.add(itemCitaNueva);

        menu.add(menu3);
        menu.add(menu2);
        menu.add(menu1);
        return menu;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
      /*  Object event = e.getSource();
        if(event == itemPacientes)
            pacientes.setVisible(true);
        if(event == itemPacienteNuevo)
            pacienteNuevo.setVisible(true);

    }*/
    }

}

