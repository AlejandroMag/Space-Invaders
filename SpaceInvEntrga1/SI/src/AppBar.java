
import javax.swing.*;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class AppBar extends JFrame implements MenuListener ,ActionListener, KeyListener{

    //Barra del Menu
    private JMenuBar menuBar;
    private JMenu Game, Help, Quit, LeaderScore;
    private JMenuItem Start,Creditos;


    //Centro del Menu
    private JLabel titulo= new JLabel("SPACE INVADER");

    private JButton jugar= new JButton("START");
    private JButton creditos= new JButton("Creditos");
    private JButton leadSco= new JButton("LeaderScore");
    private JButton quit= new JButton("Quit");


    public static void main(String[] args) {
        AppBar ap= new AppBar();
        //centerFRAME(ap);
        //maximiseFrame(ap); //no se que hace, maximisa los frames en la pantalla
        ap.setVisible(true);//Se puede ver lo creado, es decir el menu
    }

    public AppBar() {

        //Crear el diseno y las caracteristicas principales del la AppBar, mi clase, o JFrame, es lo mismo
            this.setTitle("SpaceInvader");
            this.setLayout(new FlowLayout());
            this.setSize(500, 500);// NO CAMBIA PORQ ESTA AUTO AL PC
            this.setResizable(false);
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//o desp ver q hacer


        //APP ESUCHA LA LETRA
            this.addKeyListener(this);//antes en vez de "f" era this

        //Crear un MenuBar
            menuBar = new JMenuBar();

        //Crear la primera linea del Menu, Game
            Game = new JMenu("Game...");
            Game.setMnemonic(KeyEvent.VK_S);
            Game.addMenuListener(this);
            menuBar.add(Game);  //Agregar al menu bar

        //Crear la Help en el MBar
            Help = new JMenu("Help...");
            Help.addMenuListener(this);
            menuBar.add(Help);  //Agregar al menu bar

        //Exit en el menu Bar
            Quit= new JMenu("Quit");
            Quit.setMnemonic(KeyEvent.VK_ESCAPE);
            Quit.addMenuListener(this);
            menuBar.add(Quit);  //Agregar al menu bar

        //Crear la LeaderScore
            LeaderScore = new JMenu("LeaderScore");
            LeaderScore.addMenuListener(this);
            LeaderScore.setEnabled(false);          //HASTA Q SE CONSTRUYA
            menuBar.add(LeaderScore);   //Agregar al menu bar

        //Sub-de la Lista Menu --> Me tira una foto x solo por probar
            Creditos= new JMenuItem("Creditos");
            Creditos.setMnemonic(KeyEvent.VK_C);
            Creditos.addActionListener(new Action1());
            Help.add(Creditos); //Agregar al menu bar

        //Sub de la Lista Menu
            Start= new JMenuItem("Start");
            Start.addActionListener(new Action3());
            Game.add(Start);    //Agregar al menu bar


        //Agregar el MenuBar y su "label" al frame
            this.setJMenuBar(menuBar);  //Aplicar el menuBar creado, puede ir "f"




        //Agregandole la accion a los botones
            creditos.addActionListener(new Action1());
            quit.addActionListener(new Action2());
            jugar.addActionListener(new Action3());
            leadSco.setEnabled(false);          //IGUAL QUE EL OTRO, HAY Q CONSTRUIRLO

        //JPANEL
            JPanel p1= new JPanel();    // son paneles para los botons, creo q tambient txt
            JPanel p2= new JPanel();
            JPanel p3= new JPanel();
            JPanel p4= new JPanel();

        //Crear el label para el fondo
            JLabel imageFondo = new JLabel();

        //Poner los bottons a los panels
            p1.add(titulo);
            p2.add(jugar);
            p2.add(quit);
            p3.add(creditos);
            p3.add(leadSco);


        //Poner el fondo al panel
            imageFondo.setIcon(new ImageIcon("C://Users//alejandro//Desktop//SpaceInvaderTp//src//images//fondoApp.png"));
            p4.add(imageFondo);

        //Incluir los paneles al Jframe
            this.add(p1);
            this.add(p2);
            this.add(p3);
            this.add(p4);

        //Darle el listener al botton, que responda
            Start.addActionListener(this);
            quit.addActionListener(this);
            creditos.addActionListener(this);
            leadSco.addActionListener(this);
            validate(); //Validar la foto, creo q hay cortoCirc con el layOut

        //Jframe/AppBar que se pueda ver, que se vean los bottons y eso
            this.setVisible(true);  //o podes hacer:    f.setVis.....


    }






    /*  Como suena, va al max size
    private static void maximiseFrame(JFrame fr){
        //Get the Size of the screen
        Dimension  dim = Toolkit.getDefaultToolkit().getScreenSize();

        //Determina el tamano de la pantalla
        int w=dim.width;
        int h=dim.height;

        //Frames = Screen
        fr.setSize(w,h);

        //Windows al costado izquierdo superior
        fr.setLocation(0,0);

    }
    */

    @Override
    public void actionPerformed(ActionEvent e) {
        //No se utiliza

    }

    @Override
    public void keyTyped(KeyEvent e) {
        //No se utiliza

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyChar()==(char)27){   //codigo ascII de "esc"
            System.exit(0); //Cerrar programa al tocar "esc"
        }
        if(e.getKeyChar()== 'c'){
            System.out.println("ccccc");
            new Action1();
        }
        if(e.getKeyChar()=='s'){
            new Action3();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        //No se utiliza
    }

    @Override
    public void menuSelected(MenuEvent e) {
        if(e.getSource().equals(Quit)){
            System.exit(0); //Cerrar programa una vez q toquemos quit
        }
    }

    @Override
    public void menuDeselected(MenuEvent e) {
        //No es utilizado
    }

    @Override
    public void menuCanceled(MenuEvent e) {
        //No es utilizado
    }
}









    class Action1 implements ActionListener {
        @Override

        public void actionPerformed(ActionEvent e) {
            /*
                     ImageIcon ii = new ImageIcon(playerImg);

                width = ii.getImage().getWidth(null);

                setImage(ii.getImage());
                setX(START_X);
                setY(START_Y);
             */

            Dimension d= new Dimension(358,350);
            JFrame ff = new JFrame("Clicked");
            ff.setVisible(true);
            ff.setResizable(false);
            ff.setSize(d.width, d.height);
            JLabel cred = new JLabel("-Medina,Maglio, Gayo");
            JPanel panel = new JPanel();
            panel.add(cred);
            ff.add(panel);
        }
    }



    class Action2 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
    }





    class Action3 extends JFrame implements ActionListener,Commons {

        @Override
        public void actionPerformed(ActionEvent e) {

            JFrame f= new Action3();
            f.setVisible(true);

            f.add(new Board());
            f.setTitle("Space Invaders");
            f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);  //Se puede cerrar el JFrame sin cerrar todo
            Dimension d= new Dimension(BOARD_WIDTH, BOARD_HEIGHT);
            f.setSize(d.width,d.height);
            f.setLocationRelativeTo(null);
            f.setResizable(false);
            Sprite ej = new Sprite();   //de aca lo metimos nosotros
            ej.setVisible(true);
        }
    }




