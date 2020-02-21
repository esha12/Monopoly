
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.Border;

/*
 * this class is useed to seet up the gui gameboard and changee graphic thtings during gameplay
 */
/**
 *
 * @author esha_umbarkar Project2 3/15/18
 */
public class GuiGameboard implements ActionListener {

    //instance variables
    static JLabel[][] labels;
    static JLabel[] red;
    static JLabel[] blue;
    static JLabel[] twoPlayers;
    static JLabel rollNum;
    static JFrame frame;
    static JLabel pp1;
    static JLabel pp2;
    static JLabel cp;
    static JLabel pl1;
    static JLabel pl2;
    static JLabel potMoney;

    //constructor
    public GuiGameboard() {
        frame = new JFrame("A Simple Grid Layout Demo");
        frame.setSize(1500, 1000);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(new GridLayout(11, 11, 1, 1)); //2 rows, 3 columns, 1 pixel padding
        labels = new JLabel[11][11];
        ImageIcon myIcon = new ImageIcon("big-red-button.jpg");
        Border border = BorderFactory.createLineBorder(Color.black);

        frame.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 25, 25));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel info = new JPanel();
        info.setLayout(new FlowLayout());

        pp1 = new JLabel("<html>PLAYER 1: <br>Name: " + PMonopoly.getP1().getName() + "<br>Balance: " + PMonopoly.getP1().getBalance()+"<br>Properties: " + Property.printPropNames(PMonopoly.getP1()));
        pp1.setForeground(Color.RED);
        pp2 = new JLabel("<html>PLAYER 2: <br>Name: " + PMonopoly.getP2().getName() + "<br>Balance: " + PMonopoly.getP2().getBalance()+"<br>Properties: " + Property.printPropNames(PMonopoly.getP2()));
        pp2.setForeground(Color.BLUE);

        pp1.setPreferredSize(new Dimension(500, 70));
        pp2.setPreferredSize(new Dimension(500, 70));

        info.add(pp1);
        info.add(pp2);
        info.setBorder(border);

        JPanel rolling = new JPanel();
        rolling.setLayout(new FlowLayout());
        rollNum = new JLabel("Rolled Dice Value: 0");
        rolling.add(rollNum);
        cp = new JLabel("player 1's turn!");
        cp.setForeground(Color.RED);
        rolling.add(cp);
        potMoney = new JLabel("Pot money: 0");
        rolling.add(potMoney);
        rolling.setBorder(border);

        JPanel actions = new JPanel();
        actions.setLayout(new FlowLayout());
        JButton roll = new JButton("Roll");
        JButton buy = new JButton("Buy");
        JButton sell = new JButton("Sell");
        JButton trade = new JButton("Trade");
        actions.add(roll);
        actions.add(buy);
        actions.add(sell);
        actions.add(trade);
        actions.setBorder(border);

        roll.addActionListener(this);
        buy.addActionListener(this);
        sell.addActionListener(this);
        trade.addActionListener(this);

        JPanel grid = new JPanel();

        grid.setLayout(new GridLayout(11, 11, 1, 1));

//initializes all the propeerty pictures into the labels array
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                if ((i == 0 && j < 11) || (j == 0 && i < 11) || (i == 10 && j < 11) || (j == 10 && i < 11)) {
                    if (i == 0 && j == 0) {
                        ImageIcon seniorParking = new ImageIcon("seniorParking!.jpg");
                        Image image = seniorParking.getImage();
                        Image resizedImage = image.getScaledInstance(60, 60, java.awt.Image.SCALE_SMOOTH);
                        ImageIcon sp = new ImageIcon(resizedImage);
                        JLabel jl = new JLabel("", sp, SwingConstants.CENTER);
                        jl.setPreferredSize(new Dimension(60, 60));
                        labels[i][j] = jl;
                    }
                    if (j == 0 && i == 1) {
                        ImageIcon hemiup = new ImageIcon("hemiup.jpg");
                        Image image = hemiup.getImage();
                        Image resizedImage = image.getScaledInstance(60, 60, java.awt.Image.SCALE_SMOOTH);
                        ImageIcon h = new ImageIcon(resizedImage);
                        JLabel jl = new JLabel("", h, SwingConstants.CENTER);
                        jl.setPreferredSize(new Dimension(60, 60));
                        labels[i][j] = jl;
                    }
                    if (j == 0 && i == 2) {
                        ImageIcon robotics = new ImageIcon("robotics!.jpg");
                        Image image = robotics.getImage();
                        Image resizedImage = image.getScaledInstance(60, 60, java.awt.Image.SCALE_SMOOTH);
                        ImageIcon r = new ImageIcon(resizedImage);
                        JLabel jl = new JLabel("", r, SwingConstants.CENTER);
                        jl.setPreferredSize(new Dimension(60, 60));
                        labels[i][j] = jl;
                    }
                    if (j == 0 && i == 3) {
                        ImageIcon lunch = new ImageIcon("lunch!.jpg");
                        Image image = lunch.getImage();
                        Image resizedImage = image.getScaledInstance(60, 60, java.awt.Image.SCALE_SMOOTH);
                        ImageIcon l = new ImageIcon(resizedImage);
                        JLabel jl = new JLabel("", l, SwingConstants.CENTER);
                        jl.setPreferredSize(new Dimension(60, 60));
                        labels[i][j] = jl;
                    }
                    if (j == 0 && i == 4) {
                        ImageIcon paige = new ImageIcon("paige.jpeg");
                        Image image = paige.getImage();
                        Image resizedImage = image.getScaledInstance(60, 60, java.awt.Image.SCALE_SMOOTH);
                        ImageIcon p = new ImageIcon(resizedImage);
                        JLabel jl = new JLabel("", p, SwingConstants.CENTER);
                        jl.setPreferredSize(new Dimension(60, 60));
                        labels[i][j] = jl;
                    }
                    if (j == 0 && i == 5) {
                        ImageIcon field = new ImageIcon("field!.jpg");
                        Image image = field.getImage();
                        Image resizedImage = image.getScaledInstance(60, 60, java.awt.Image.SCALE_SMOOTH);
                        ImageIcon f = new ImageIcon(resizedImage);
                        JLabel jl = new JLabel("", f, SwingConstants.CENTER);
                        jl.setPreferredSize(new Dimension(60, 60));
                        labels[i][j] = jl;
                    }
                    if (j == 0 && i == 6) {
                        ImageIcon hatzopoulos = new ImageIcon("hatzopoulos.jpg");
                        Image image = hatzopoulos.getImage();
                        Image resizedImage = image.getScaledInstance(60, 60, java.awt.Image.SCALE_SMOOTH);
                        ImageIcon h = new ImageIcon(resizedImage);
                        JLabel jl = new JLabel("", h, SwingConstants.CENTER);
                        jl.setPreferredSize(new Dimension(60, 60));
                        labels[i][j] = jl;
                    }
                    if (j == 0 && i == 7) {
                        ImageIcon payne = new ImageIcon("payne.jpg");
                        Image image = payne.getImage();
                        Image resizedImage = image.getScaledInstance(60, 60, java.awt.Image.SCALE_SMOOTH);
                        ImageIcon p = new ImageIcon(resizedImage);
                        JLabel jl = new JLabel("", p, SwingConstants.CENTER);
                        jl.setPreferredSize(new Dimension(60, 60));
                        labels[i][j] = jl;
                    }
                    if (j == 0 && i == 8) {
                        ImageIcon payTuition = new ImageIcon("payTuition!.png");
                        Image image = payTuition.getImage();
                        Image resizedImage = image.getScaledInstance(60, 60, java.awt.Image.SCALE_SMOOTH);
                        ImageIcon pt = new ImageIcon(resizedImage);
                        JLabel jl = new JLabel("", pt, SwingConstants.CENTER);
                        jl.setPreferredSize(new Dimension(60, 60));
                        labels[i][j] = jl;
                    }
                    if (j == 0 && i == 9) {
                        ImageIcon briggs = new ImageIcon("briggs.jpg");
                        Image image = briggs.getImage();
                        Image resizedImage = image.getScaledInstance(60, 60, java.awt.Image.SCALE_SMOOTH);
                        ImageIcon b = new ImageIcon(resizedImage);
                        JLabel jl = new JLabel("", b, SwingConstants.CENTER);
                        jl.setPreferredSize(new Dimension(60, 60));
                        labels[i][j] = jl;
                    }
                    if (i == 10 && j == 0) {
                        ImageIcon morris = new ImageIcon("morris.jpg");
                        Image image = morris.getImage();
                        Image resizedImage = image.getScaledInstance(60, 60, java.awt.Image.SCALE_SMOOTH);
                        ImageIcon m = new ImageIcon(resizedImage);
                        JLabel jl = new JLabel("", m, SwingConstants.CENTER);
                        jl.setPreferredSize(new Dimension(60, 60));
                        labels[i][j] = jl;
                    }
                    if (i == 0 && j == 10) {
                        ImageIcon wes = new ImageIcon("wes.jpg");
                        Image image = wes.getImage();
                        Image resizedImage = image.getScaledInstance(60, 60, java.awt.Image.SCALE_SMOOTH);
                        ImageIcon w = new ImageIcon(resizedImage);
                        JLabel jl = new JLabel("", w, SwingConstants.CENTER);
                        jl.setPreferredSize(new Dimension(60, 60));
                        labels[i][j] = jl;
                    }
                    if (j == 10 && i == 1) {
                        ImageIcon studentCenter = new ImageIcon("studentCenter!.jpg");
                        Image image = studentCenter.getImage();
                        Image resizedImage = image.getScaledInstance(60, 60, java.awt.Image.SCALE_SMOOTH);
                        ImageIcon sc = new ImageIcon(resizedImage);
                        JLabel jl = new JLabel("", sc, SwingConstants.CENTER);
                        jl.setPreferredSize(new Dimension(60, 60));
                        labels[i][j] = jl;
                    }
                    if (j == 10 && i == 2) {
                        ImageIcon garden = new ImageIcon("garden!.jpg");
                        Image image = garden.getImage();
                        Image resizedImage = image.getScaledInstance(60, 60, java.awt.Image.SCALE_SMOOTH);
                        ImageIcon g = new ImageIcon(resizedImage);
                        JLabel jl = new JLabel("", g, SwingConstants.CENTER);
                        jl.setPreferredSize(new Dimension(60, 60));
                        labels[i][j] = jl;
                    }
                    if (j == 10 && i == 3) {
                        ImageIcon lunch = new ImageIcon("lunch!.jpg");
                        Image image = lunch.getImage();
                        Image resizedImage = image.getScaledInstance(60, 60, java.awt.Image.SCALE_SMOOTH);
                        ImageIcon l = new ImageIcon(resizedImage);
                        JLabel jl = new JLabel("", l, SwingConstants.CENTER);
                        jl.setPreferredSize(new Dimension(60, 60));
                        labels[i][j] = jl;
                    }
                    if (j == 10 && i == 4) {
                        ImageIcon cafeteria = new ImageIcon("cafeteria!.jpg");
                        Image image = cafeteria.getImage();
                        Image resizedImage = image.getScaledInstance(60, 60, java.awt.Image.SCALE_SMOOTH);
                        ImageIcon c = new ImageIcon(resizedImage);
                        JLabel jl = new JLabel("", c, SwingConstants.CENTER);
                        jl.setPreferredSize(new Dimension(60, 60));
                        labels[i][j] = jl;
                    }
                    if (j == 10 && i == 5) {
                        ImageIcon tennisCourts = new ImageIcon("tennisCourts!.jpg");
                        Image image = tennisCourts.getImage();
                        Image resizedImage = image.getScaledInstance(60, 60, java.awt.Image.SCALE_SMOOTH);
                        ImageIcon tc = new ImageIcon(resizedImage);
                        JLabel jl = new JLabel("", tc, SwingConstants.CENTER);
                        jl.setPreferredSize(new Dimension(60, 60));
                        labels[i][j] = jl;
                    }
                    if (j == 10 && i == 6) {
                        ImageIcon lunch = new ImageIcon("lunch!.jpg");
                        Image image = lunch.getImage();
                        Image resizedImage = image.getScaledInstance(60, 60, java.awt.Image.SCALE_SMOOTH);
                        ImageIcon l = new ImageIcon(resizedImage);
                        JLabel jl = new JLabel("", l, SwingConstants.CENTER);
                        jl.setPreferredSize(new Dimension(60, 60));
                        labels[i][j] = jl;
                    }
                    if (j == 10 && i == 7) {
                        ImageIcon founders = new ImageIcon("foundersHall!.jpg");
                        Image image = founders.getImage();
                        Image resizedImage = image.getScaledInstance(60, 60, java.awt.Image.SCALE_SMOOTH);
                        ImageIcon f = new ImageIcon(resizedImage);
                        JLabel jl = new JLabel("", f, SwingConstants.CENTER);
                        jl.setPreferredSize(new Dimension(60, 60));
                        labels[i][j] = jl;
                    }
                    if (j == 10 && i == 8) {
                        ImageIcon playTickets = new ImageIcon("playTickets!.png");
                        Image image = playTickets.getImage();
                        Image resizedImage = image.getScaledInstance(60, 60, java.awt.Image.SCALE_SMOOTH);
                        ImageIcon pt = new ImageIcon(resizedImage);
                        JLabel jl = new JLabel("", pt, SwingConstants.CENTER);
                        jl.setPreferredSize(new Dimension(60, 60));
                        labels[i][j] = jl;
                    }
                    if (j == 10 && i == 9) {
                        ImageIcon monastery = new ImageIcon("monastery!.jpg");
                        Image image = monastery.getImage();
                        Image resizedImage = image.getScaledInstance(60, 60, java.awt.Image.SCALE_SMOOTH);
                        ImageIcon m = new ImageIcon(resizedImage);
                        JLabel jl = new JLabel("", m, SwingConstants.CENTER);
                        jl.setPreferredSize(new Dimension(60, 60));
                        labels[i][j] = jl;
                    }
                    if (i == 10 && j == 10) {
                        ImageIcon newDay = new ImageIcon("newDay!.png");
                        Image image = newDay.getImage();
                        Image resizedImage = image.getScaledInstance(60, 60, java.awt.Image.SCALE_SMOOTH);
                        ImageIcon nd = new ImageIcon(resizedImage);
                        JLabel jl = new JLabel("", nd, SwingConstants.CENTER);
                        jl.setPreferredSize(new Dimension(60, 60));
                        labels[i][j] = jl;
                    }
                    if (i == 0 && j == 1) {
                        ImageIcon miu = new ImageIcon("miu.jpg");
                        Image image = miu.getImage();
                        Image resizedImage = image.getScaledInstance(60, 60, java.awt.Image.SCALE_SMOOTH);
                        ImageIcon m = new ImageIcon(resizedImage);
                        JLabel jl = new JLabel("", m, SwingConstants.CENTER);
                        jl.setPreferredSize(new Dimension(60, 60));
                        labels[i][j] = jl;
                    }
                    if (i == 0 && j == 2) {
                        ImageIcon break1 = new ImageIcon("break!.jpg");
                        Image image = break1.getImage();
                        Image resizedImage = image.getScaledInstance(60, 60, java.awt.Image.SCALE_SMOOTH);
                        ImageIcon b = new ImageIcon(resizedImage);
                        JLabel jl = new JLabel("", b, SwingConstants.CENTER);
                        jl.setPreferredSize(new Dimension(60, 60));
                        labels[i][j] = jl;
                    }
                    if (i == 0 && j == 3) {
                        ImageIcon faisal = new ImageIcon("faisal.jpg");
                        Image image = faisal.getImage();
                        Image resizedImage = image.getScaledInstance(60, 60, java.awt.Image.SCALE_SMOOTH);
                        ImageIcon f = new ImageIcon(resizedImage);
                        JLabel jl = new JLabel("", f, SwingConstants.CENTER);
                        jl.setPreferredSize(new Dimension(60, 60));
                        labels[i][j] = jl;
                    }
                    if (i == 0 && j == 4) {
                        ImageIcon lee = new ImageIcon("lee.jpg");
                        Image image = lee.getImage();
                        Image resizedImage = image.getScaledInstance(60, 60, java.awt.Image.SCALE_SMOOTH);
                        ImageIcon l = new ImageIcon(resizedImage);
                        JLabel jl = new JLabel("", l, SwingConstants.CENTER);
                        jl.setPreferredSize(new Dimension(60, 60));
                        labels[i][j] = jl;
                    }
                    if (i == 0 && j == 5) {
                        ImageIcon pool = new ImageIcon("pool!.jpg");
                        Image image = pool.getImage();
                        Image resizedImage = image.getScaledInstance(60, 60, java.awt.Image.SCALE_SMOOTH);
                        ImageIcon p = new ImageIcon(resizedImage);
                        JLabel jl = new JLabel("", p, SwingConstants.CENTER);
                        jl.setPreferredSize(new Dimension(60, 60));
                        labels[i][j] = jl;
                    }
                    if (i == 0 && j == 6) {
                        ImageIcon bessin = new ImageIcon("bessin.jpg");
                        Image image = bessin.getImage();
                        Image resizedImage = image.getScaledInstance(60, 60, java.awt.Image.SCALE_SMOOTH);
                        ImageIcon b = new ImageIcon(resizedImage);
                        JLabel jl = new JLabel("", b, SwingConstants.CENTER);
                        jl.setPreferredSize(new Dimension(60, 60));
                        labels[i][j] = jl;
                    }
                    if (i == 0 && j == 7) {
                        ImageIcon trudelle = new ImageIcon("trudelle.jpg");
                        Image image = trudelle.getImage();
                        Image resizedImage = image.getScaledInstance(60, 60, java.awt.Image.SCALE_SMOOTH);
                        ImageIcon t = new ImageIcon(resizedImage);
                        JLabel jl = new JLabel("", t, SwingConstants.CENTER);
                        jl.setPreferredSize(new Dimension(60, 60));
                        labels[i][j] = jl;
                    }
                    if (i == 0 && j == 8) {
                        ImageIcon danceTickets = new ImageIcon("danceTickets!.png");
                        Image image = danceTickets.getImage();
                        Image resizedImage = image.getScaledInstance(60, 60, java.awt.Image.SCALE_SMOOTH);
                        ImageIcon dt = new ImageIcon(resizedImage);
                        JLabel jl = new JLabel("", dt, SwingConstants.CENTER);
                        jl.setPreferredSize(new Dimension(60, 60));
                        labels[i][j] = jl;
                    }
                    if (i == 0 && j == 9) {
                        ImageIcon parker = new ImageIcon("parker.jpg");
                        Image image = parker.getImage();
                        Image resizedImage = image.getScaledInstance(60, 60, java.awt.Image.SCALE_SMOOTH);
                        ImageIcon p = new ImageIcon(resizedImage);
                        JLabel jl = new JLabel("", p, SwingConstants.CENTER);
                        jl.setPreferredSize(new Dimension(60, 60));
                        labels[i][j] = jl;
                    }
                    if (i == 10 && j == 1) {
                        ImageIcon carroll = new ImageIcon("carroll.jpeg");
                        Image image = carroll.getImage();
                        Image resizedImage = image.getScaledInstance(60, 60, java.awt.Image.SCALE_SMOOTH);
                        ImageIcon c = new ImageIcon(resizedImage);
                        JLabel jl = new JLabel("", c, SwingConstants.CENTER);
                        jl.setPreferredSize(new Dimension(60, 60));
                        labels[i][j] = jl;
                    }
                    if (i == 10 && j == 2) {
                        ImageIcon O = new ImageIcon("O!.jpeg");
                        Image image = O.getImage();
                        Image resizedImage = image.getScaledInstance(60, 60, java.awt.Image.SCALE_SMOOTH);
                        ImageIcon o = new ImageIcon(resizedImage);
                        JLabel jl = new JLabel("", o, SwingConstants.CENTER);
                        jl.setPreferredSize(new Dimension(60, 60));
                        labels[i][j] = jl;
                    }
                    if (i == 10 && j == 3) {
                        ImageIcon break1 = new ImageIcon("break!.jpg");
                        Image image = break1.getImage();
                        Image resizedImage = image.getScaledInstance(60, 60, java.awt.Image.SCALE_SMOOTH);
                        ImageIcon b = new ImageIcon(resizedImage);
                        JLabel jl = new JLabel("", b, SwingConstants.CENTER);
                        jl.setPreferredSize(new Dimension(60, 60));
                        labels[i][j] = jl;
                    }
                    if (i == 10 && j == 4) {
                        ImageIcon dubose = new ImageIcon("dubose.jpg");
                        Image image = dubose.getImage();
                        Image resizedImage = image.getScaledInstance(60, 60, java.awt.Image.SCALE_SMOOTH);
                        ImageIcon d = new ImageIcon(resizedImage);
                        JLabel jl = new JLabel("", d, SwingConstants.CENTER);
                        jl.setPreferredSize(new Dimension(60, 60));
                        labels[i][j] = jl;
                    }
                    if (i == 10 && j == 5) {
                        ImageIcon gym = new ImageIcon("gym!.jpg");
                        Image image = gym.getImage();
                        Image resizedImage = image.getScaledInstance(60, 60, java.awt.Image.SCALE_SMOOTH);
                        ImageIcon g = new ImageIcon(resizedImage);
                        JLabel jl = new JLabel("", g, SwingConstants.CENTER);
                        jl.setPreferredSize(new Dimension(60, 60));
                        labels[i][j] = jl;
                    }
                    if (i == 10 && j == 6) {
                        ImageIcon pantherShack = new ImageIcon("pantherShack!.jpg");
                        Image image = pantherShack.getImage();
                        Image resizedImage = image.getScaledInstance(60, 60, java.awt.Image.SCALE_SMOOTH);
                        ImageIcon ps = new ImageIcon(resizedImage);
                        JLabel jl = new JLabel("", ps, SwingConstants.CENTER);
                        jl.setPreferredSize(new Dimension(60, 60));
                        labels[i][j] = jl;
                    }
                    if (i == 10 && j == 7) {
                        ImageIcon cohen = new ImageIcon("cohen.jpg");
                        Image image = cohen.getImage();
                        Image resizedImage = image.getScaledInstance(60, 60, java.awt.Image.SCALE_SMOOTH);
                        ImageIcon c = new ImageIcon(resizedImage);
                        JLabel jl = new JLabel("", c, SwingConstants.CENTER);
                        jl.setPreferredSize(new Dimension(60, 60));
                        labels[i][j] = jl;
                    }
                    if (i == 10 && j == 8) {
                        ImageIcon break1 = new ImageIcon("break!.jpg");
                        Image image = break1.getImage();
                        Image resizedImage = image.getScaledInstance(60, 60, java.awt.Image.SCALE_SMOOTH);
                        ImageIcon b = new ImageIcon(resizedImage);
                        JLabel jl = new JLabel("", b, SwingConstants.CENTER);
                        jl.setPreferredSize(new Dimension(60, 60));
                        labels[i][j] = jl;
                    }
                    if (i == 10 && j == 9) {
                        ImageIcon neale = new ImageIcon("neale.jpg");
                        Image image = neale.getImage();
                        Image resizedImage = image.getScaledInstance(60, 60, java.awt.Image.SCALE_SMOOTH);
                        ImageIcon n = new ImageIcon(resizedImage);
                        JLabel jl = new JLabel("", n, SwingConstants.CENTER);
                        jl.setPreferredSize(new Dimension(60, 60));
                        labels[i][j] = jl;
                    }
                    labels[i][j].setBorder(border);
                } else {
                    labels[i][j] = new JLabel(" ", SwingConstants.CENTER);

                }
                grid.add(labels[i][j]);
            }
        }
        
        //adds everything to the frrame and makes it visible
        frame.getContentPane().add(info);
        frame.getContentPane().add(grid);
        frame.getContentPane().add(actions);
        frame.getContentPane().add(rolling);
        frame.setVisible(true);
    }

    //shows on the screen where the player moved
    public static void makeVisualMove() {
        Border border = BorderFactory.createLineBorder(Color.BLACK);
        Border borderP1 = BorderFactory.createLineBorder(Color.RED, 5);
        Border borderP2 = BorderFactory.createLineBorder(Color.BLUE, 5);
        Border borderBoth = BorderFactory.createLineBorder(Color.MAGENTA, 5);
        int redI = PMonopoly.getCurrentProperty(PMonopoly.getP1()).getI();
        int redJ = PMonopoly.getCurrentProperty(PMonopoly.getP1()).getJ();
        int blueI = PMonopoly.getCurrentProperty(PMonopoly.getP2()).getI();
        int blueJ = PMonopoly.getCurrentProperty(PMonopoly.getP2()).getJ();
        for (int i = 0; i <= 10; i++) {
            for (int j = 0; j <= 10; j++) {
                if (labels[i][j] == labels[redI][redJ] && labels[i][j] == labels[blueI][blueJ]) {
                    labels[i][j].setBorder(borderBoth);
                } else if (labels[i][j] == labels[redI][redJ]) {
                    labels[i][j].setBorder(borderP1);
                } else if (labels[i][j] == labels[blueI][blueJ]) {
                    labels[i][j].setBorder(borderP2);
                } else {
                    if ((i == 0 && j < 11) || (j == 0 && i < 11) || (i == 10 && j < 11) || (j == 10 && i < 11)) {
                        labels[i][j].setBorder(border);
                    }
                }
            }
        }
    }

    //upgrades the balance and properties list display on the GUI
    public static void updateVisualStats(Player p) {
        if (p == PMonopoly.getP1()) {
            pp1.setText("<html>PLAYER 1: <br>Name: " + PMonopoly.getP1().getName() + "<br>Balance: " + PMonopoly.getP1().getBalance()+"<br>Properties: " + Property.printPropNames(PMonopoly.getP1()));
        } else {
            pp2.setText("<html>PLAYER 2: <br>Name: " + PMonopoly.getP2().getName() + "<br>Balance: " + PMonopoly.getP2().getBalance()+"<br>Properties: " + Property.printPropNames(PMonopoly.getP2()));
        }
    }

    //shows what valuue the player rolled
    public static void displayRoll(int rollValue) {
        rollNum.setText("Rolled Dice Value: " + Integer.toString(rollValue));
    }

    //shows the potMoney valuee
    public static void potMoneyVisual(int pm){
        potMoney.setText("Pot money: "+ pm);
    }
    
    //tells who's turn it is/is next
    public static void changePlayerVisualP1() {
        cp.setText("player 1's turn!");
        cp.setForeground(Color.RED);
    }

    //tells who's turn it is/is next
    public static void changePlayerVisualP2() {
        cp.setText("player 2's turn!");
        cp.setForeground(Color.BLUE);
    }

    //responds to the buttons being pressed
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Roll")) {
            PMonopoly.play();
        } 
        else if (e.getActionCommand().equals("Buy")) {
            if (!PMonopoly.getCurrentProperty(PMonopoly.currentPlayer).getIsBuyable()) {
                JOptionPane.showMessageDialog(null, "You can't buy this! Check to see if it's already owned, or if it is an unbuyable property.");
            } else {
                if (PMonopoly.currentPlayer.getBalance() >= PMonopoly.getCurrentProperty(PMonopoly.currentPlayer).getPrice()) {
                    PMonopoly.currentPlayer.buyProperty(PMonopoly.getCurrentProperty(PMonopoly.currentPlayer));
                } else {
                    JOptionPane.showMessageDialog(null, "Sorry, you don't have enough money.");
                }
            }
        } 
        else if (e.getActionCommand().equals("Sell")) {
            PMonopoly.sellProperty();
        }
        else if (e.getActionCommand().equals("Trade")){
            PMonopoly.trade();
        }
    }
}
