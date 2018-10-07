/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kidnopoly;
import java.util.Scanner;
import javax.swing.JOptionPane;
import java.util.Random;
/**
 *
 * @author Administrator
 */
public class BoardFrame extends javax.swing.JFrame {
        public static Board board;
        int currentPlayer=1;
        boolean win=false;
        public static Player player_1 = new Player(1, 1, 256, null);  //initial the players
        public static Player player_2 = new Player(2, 1, 256, null);
        public static Player player_3 = new Player(3, 2, 256, null);
        public static Player player_4 = new Player(4, 2, 256, null);
        public static Score score_1 = new Score(0);       //initial the score board
        public static Score score_2 = new Score(0);
        public static Score score_3 = new Score(0);
        public static Score score_4 = new Score(0);  
        public static int team_1_score=512;
        public static int team_2_score=512;
    
      public static void main(String[] args) { 
        
        BoardFrame.board = new Board();     //initial the board
        Land land_1 = new Land(0, "Lucky_3", 0, 0, null, 0);
        board.position[0][0] = land_1;
        Land land_2 = new Land(8, "Double", 0, 1, null, 0);
        board.position[0][1] = land_2;
        Land land_3 = new Land(8, "Double", 0, 2, null, 0);
        board.position[0][2] = land_3;
        Land land_4 = new Land(0, "Challenge", 0, 3, null, 0);
        board.position[0][3] = land_4;
        Land land_5 = new Land(8, "Long", 0, 4, null, 0);
        board.position[0][4] = land_5;
        Land land_6 = new Land(8, "Long", 0, 5, null, 0);
        board.position[0][5] = land_6;
        Land land_7 = new Land(8, "Long", 0, 6, null, 0);
        board.position[0][6] = land_7;
        Land land_8 = new Land(0, "Lucky_3", 0, 7, null, 0);
        board.position[0][7] = land_8;
        Land land_9 = new Land(0, "Challenge", 1, 0, null, 0);
        board.position[1][0] = land_9;
        Land land_10 = new Land(0, "Challenge", 1, 7, null, 0);
        board.position[1][7] = land_10;
        Land land_11 = new Land(4, "Integer", 2, 0, null, 0);
        board.position[2][0] = land_11;  
        Land land_12 = new Land(16, "Long Long", 2, 7, null, 0);
        board.position[2][7] = land_12;
        Land land_13 = new Land(4, "Integer", 3, 0, null, 0);
        board.position[3][0] = land_13;       
        Land land_14 = new Land(16, "Long Long", 3, 7, null, 0);
        board.position[3][7] = land_14;      
        Land land_15 = new Land(0, "Challenge", 4, 0, null, 0);
        board.position[4][0] = land_15;
        Land land_16 = new Land(0, "Challenge", 4, 7, null, 0);
        board.position[4][7] = land_16;
        Land land_17 = new Land(0, "Lucky_3", 5, 0, null, 0);
        board.position[5][0] = land_17;    
        Land land_18 = new Land(4, "Short", 5, 1, null, 0);
        board.position[5][1] = land_18;  
        Land land_19 = new Land(4, "Short", 5, 2, null, 0);
        board.position[5][2] = land_19; 
        Land land_20 = new Land(0, "Challenge", 5, 3, null, 0);
        board.position[5][3] = land_20;       
        Land land_21 = new Land(1, "Char", 5, 4, null, 0);
        board.position[5][4] = land_21;
        Land land_22 = new Land(1, "Char", 5, 5, null, 0);
        board.position[5][5] = land_22;
        Land land_23 = new Land(1, "Char", 5, 6, null, 0);
        board.position[5][6] = land_23;
        Land land_24 = new Land(0, "Start", 5, 7, null, 0);
        board.position[5][7] = land_24;         
        
                /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BoardFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BoardFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BoardFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BoardFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BoardFrame().setVisible(true);
            }
        });
        
        
        //initialize challenges and hints
        Scanner input = new Scanner(System.in);
        
        System.out.println("There are four challengers here!!");     //get challengers names
        System.out.println("Enter your names here!!");
        
        String defaultResponse = "Your name?";
       // System.out.printf("The First Challenger's Name here!! ");
        String name_1; //= input.nextLine();
        name_1 = JOptionPane.showInputDialog(null,"The First Challenger's Name here!! ", defaultResponse);
       // System.out.printf("The Second Challenger's Name here!! ");
        String name_2; // = input.nextLine();
        name_2 = JOptionPane.showInputDialog(null,"The Second Challenger's Name here!! ", defaultResponse);
       // System.out.printf("The Next Challenger's Name here!! ");
        String name_3; // = input.nextLine();
        name_3 = JOptionPane.showInputDialog(null,"The Next Challenger's Name here!! ", defaultResponse);
       // System.out.printf("The Last Challenger's Name here!! ");
        String name_4; // = input.nextLine();
        name_4 = JOptionPane.showInputDialog(null,"The Last Challenger's Name here!! ", defaultResponse);
        
        player_1.setName(name_1);        //set challengers name to players
        player_2.setName(name_2);
        player_3.setName(name_3);
        player_4.setName(name_4);
        player_1.setPlace(5, 7);
        player_2.setPlace(5, 7);
        player_3.setPlace(5, 7);
        player_4.setPlace(5, 7);
        
        System.out.printf("OK!! The game starts!! NOW!! ");
        
         team_1_score = score_1.getScore() + score_2.getScore();
         team_2_score = score_3.getScore() + score_4.getScore();

    }
                
    public BoardFrame() {
        initComponents();   
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel25 = new javax.swing.JPanel();
        Bonus_2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        Land_8 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Land_9 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        Challenge_4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Land_10 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        Land_11 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        Land_12 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        Bonus_1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        Challenge_3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        Land_7 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        Land_6 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        Challenge_2 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        Bonus_3 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        Land_5 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        Land_4 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        Challenge_1 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        Land_3 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        Land_2 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        Land_1 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        Start = new javax.swing.JPanel();
        Player01 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        Challenge_5 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        Land_13 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        Land_14 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        Challenge_6 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        Text = new javax.swing.JTextField();
        Team1Score = new javax.swing.JTextField();
        Team2Score = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        Player1S = new javax.swing.JLabel();
        Player2S = new javax.swing.JLabel();
        Player3S = new javax.swing.JLabel();
        Player4S = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        Player1Score = new javax.swing.JLabel();
        Player2Score = new javax.swing.JLabel();
        Player3Score = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        Player4Score = new javax.swing.JLabel();

        jPanel25.setBackground(new java.awt.Color(204, 255, 255));
        jPanel25.setForeground(new java.awt.Color(102, 0, 204));

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 255, 51));
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(java.awt.Color.white);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Bonus_2.setLayout(new java.awt.BorderLayout());

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bonus.png"))); // NOI18N
        jLabel5.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel5MouseMoved(evt);
            }
        });
        Bonus_2.add(jLabel5, java.awt.BorderLayout.CENTER);

        getContentPane().add(Bonus_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, 100));

        Land_8.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                Land_8MouseMoved(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cabin.png"))); // NOI18N

        javax.swing.GroupLayout Land_8Layout = new javax.swing.GroupLayout(Land_8);
        Land_8.setLayout(Land_8Layout);
        Land_8Layout.setHorizontalGroup(
            Land_8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Land_8Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        Land_8Layout.setVerticalGroup(
            Land_8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Land_8Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(Land_8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, 100, 100));

        Land_9.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                Land_9MouseMoved(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cabin.png"))); // NOI18N
        jLabel3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel3MouseMoved(evt);
            }
        });

        javax.swing.GroupLayout Land_9Layout = new javax.swing.GroupLayout(Land_9);
        Land_9.setLayout(Land_9Layout);
        Land_9Layout.setHorizontalGroup(
            Land_9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Land_9Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        Land_9Layout.setVerticalGroup(
            Land_9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Land_9Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(Land_9, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 100, 100));

        Challenge_4.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                Challenge_4MouseMoved(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/game.png"))); // NOI18N

        javax.swing.GroupLayout Challenge_4Layout = new javax.swing.GroupLayout(Challenge_4);
        Challenge_4.setLayout(Challenge_4Layout);
        Challenge_4Layout.setHorizontalGroup(
            Challenge_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Challenge_4Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        Challenge_4Layout.setVerticalGroup(
            Challenge_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Challenge_4Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(Challenge_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 100, 100));

        Land_10.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                Land_10MouseMoved(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cabin.png"))); // NOI18N

        javax.swing.GroupLayout Land_10Layout = new javax.swing.GroupLayout(Land_10);
        Land_10.setLayout(Land_10Layout);
        Land_10Layout.setHorizontalGroup(
            Land_10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Land_10Layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        Land_10Layout.setVerticalGroup(
            Land_10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Land_10Layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(Land_10, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 0, -1, -1));

        Land_11.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                Land_11MouseMoved(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cabin.png"))); // NOI18N

        javax.swing.GroupLayout Land_11Layout = new javax.swing.GroupLayout(Land_11);
        Land_11.setLayout(Land_11Layout);
        Land_11Layout.setHorizontalGroup(
            Land_11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Land_11Layout.createSequentialGroup()
                .addComponent(jLabel6)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        Land_11Layout.setVerticalGroup(
            Land_11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Land_11Layout.createSequentialGroup()
                .addComponent(jLabel6)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(Land_11, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 0, -1, -1));

        Land_12.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                Land_12MouseMoved(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cabin.png"))); // NOI18N

        javax.swing.GroupLayout Land_12Layout = new javax.swing.GroupLayout(Land_12);
        Land_12.setLayout(Land_12Layout);
        Land_12Layout.setHorizontalGroup(
            Land_12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Land_12Layout.createSequentialGroup()
                .addComponent(jLabel7)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        Land_12Layout.setVerticalGroup(
            Land_12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Land_12Layout.createSequentialGroup()
                .addComponent(jLabel7)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(Land_12, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 0, -1, -1));

        Bonus_1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                Bonus_1MouseMoved(evt);
            }
        });

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bonus.png"))); // NOI18N

        javax.swing.GroupLayout Bonus_1Layout = new javax.swing.GroupLayout(Bonus_1);
        Bonus_1.setLayout(Bonus_1Layout);
        Bonus_1Layout.setHorizontalGroup(
            Bonus_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Bonus_1Layout.createSequentialGroup()
                .addComponent(jLabel8)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        Bonus_1Layout.setVerticalGroup(
            Bonus_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Bonus_1Layout.createSequentialGroup()
                .addComponent(jLabel8)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(Bonus_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 0, 100, 100));

        Challenge_3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                Challenge_3MouseMoved(evt);
            }
        });

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/game.png"))); // NOI18N

        javax.swing.GroupLayout Challenge_3Layout = new javax.swing.GroupLayout(Challenge_3);
        Challenge_3.setLayout(Challenge_3Layout);
        Challenge_3Layout.setHorizontalGroup(
            Challenge_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Challenge_3Layout.createSequentialGroup()
                .addComponent(jLabel9)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        Challenge_3Layout.setVerticalGroup(
            Challenge_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Challenge_3Layout.createSequentialGroup()
                .addComponent(jLabel9)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(Challenge_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, -1, -1));

        Land_7.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                Land_7MouseMoved(evt);
            }
        });

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cabin.png"))); // NOI18N

        javax.swing.GroupLayout Land_7Layout = new javax.swing.GroupLayout(Land_7);
        Land_7.setLayout(Land_7Layout);
        Land_7Layout.setHorizontalGroup(
            Land_7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Land_7Layout.createSequentialGroup()
                .addComponent(jLabel10)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        Land_7Layout.setVerticalGroup(
            Land_7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Land_7Layout.createSequentialGroup()
                .addComponent(jLabel10)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(Land_7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, -1, -1));

        Land_6.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                Land_6MouseMoved(evt);
            }
        });

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cabin.png"))); // NOI18N
        jLabel11.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel11MouseMoved(evt);
            }
        });

        javax.swing.GroupLayout Land_6Layout = new javax.swing.GroupLayout(Land_6);
        Land_6.setLayout(Land_6Layout);
        Land_6Layout.setHorizontalGroup(
            Land_6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Land_6Layout.createSequentialGroup()
                .addComponent(jLabel11)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        Land_6Layout.setVerticalGroup(
            Land_6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Land_6Layout.createSequentialGroup()
                .addComponent(jLabel11)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(Land_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, -1, -1));

        Challenge_2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                Challenge_2MouseMoved(evt);
            }
        });

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/game.png"))); // NOI18N

        javax.swing.GroupLayout Challenge_2Layout = new javax.swing.GroupLayout(Challenge_2);
        Challenge_2.setLayout(Challenge_2Layout);
        Challenge_2Layout.setHorizontalGroup(
            Challenge_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Challenge_2Layout.createSequentialGroup()
                .addComponent(jLabel12)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        Challenge_2Layout.setVerticalGroup(
            Challenge_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Challenge_2Layout.createSequentialGroup()
                .addComponent(jLabel12)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(Challenge_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, -1, -1));

        Bonus_3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                Bonus_3MouseMoved(evt);
            }
        });

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bonus.png"))); // NOI18N

        javax.swing.GroupLayout Bonus_3Layout = new javax.swing.GroupLayout(Bonus_3);
        Bonus_3.setLayout(Bonus_3Layout);
        Bonus_3Layout.setHorizontalGroup(
            Bonus_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Bonus_3Layout.createSequentialGroup()
                .addComponent(jLabel13)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        Bonus_3Layout.setVerticalGroup(
            Bonus_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Bonus_3Layout.createSequentialGroup()
                .addComponent(jLabel13)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(Bonus_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 500, -1, -1));

        Land_5.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                Land_5MouseMoved(evt);
            }
        });

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cabin.png"))); // NOI18N

        javax.swing.GroupLayout Land_5Layout = new javax.swing.GroupLayout(Land_5);
        Land_5.setLayout(Land_5Layout);
        Land_5Layout.setHorizontalGroup(
            Land_5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Land_5Layout.createSequentialGroup()
                .addComponent(jLabel14)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        Land_5Layout.setVerticalGroup(
            Land_5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Land_5Layout.createSequentialGroup()
                .addComponent(jLabel14)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(Land_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 500, -1, -1));

        Land_4.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                Land_4MouseMoved(evt);
            }
        });

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cabin.png"))); // NOI18N

        javax.swing.GroupLayout Land_4Layout = new javax.swing.GroupLayout(Land_4);
        Land_4.setLayout(Land_4Layout);
        Land_4Layout.setHorizontalGroup(
            Land_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Land_4Layout.createSequentialGroup()
                .addComponent(jLabel15)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        Land_4Layout.setVerticalGroup(
            Land_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Land_4Layout.createSequentialGroup()
                .addComponent(jLabel15)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(Land_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 500, -1, -1));

        Challenge_1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                Challenge_1MouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                Challenge_1MouseMoved(evt);
            }
        });

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/game.png"))); // NOI18N
        jLabel16.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel16MouseMoved(evt);
            }
        });

        javax.swing.GroupLayout Challenge_1Layout = new javax.swing.GroupLayout(Challenge_1);
        Challenge_1.setLayout(Challenge_1Layout);
        Challenge_1Layout.setHorizontalGroup(
            Challenge_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Challenge_1Layout.createSequentialGroup()
                .addComponent(jLabel16)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        Challenge_1Layout.setVerticalGroup(
            Challenge_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Challenge_1Layout.createSequentialGroup()
                .addComponent(jLabel16)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(Challenge_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 500, -1, -1));

        Land_3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                Land_3MouseMoved(evt);
            }
        });

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cabin.png"))); // NOI18N

        javax.swing.GroupLayout Land_3Layout = new javax.swing.GroupLayout(Land_3);
        Land_3.setLayout(Land_3Layout);
        Land_3Layout.setHorizontalGroup(
            Land_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Land_3Layout.createSequentialGroup()
                .addComponent(jLabel17)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        Land_3Layout.setVerticalGroup(
            Land_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Land_3Layout.createSequentialGroup()
                .addComponent(jLabel17)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(Land_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 500, -1, -1));

        Land_2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                Land_2MouseMoved(evt);
            }
        });

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cabin.png"))); // NOI18N

        javax.swing.GroupLayout Land_2Layout = new javax.swing.GroupLayout(Land_2);
        Land_2.setLayout(Land_2Layout);
        Land_2Layout.setHorizontalGroup(
            Land_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Land_2Layout.createSequentialGroup()
                .addComponent(jLabel18)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        Land_2Layout.setVerticalGroup(
            Land_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Land_2Layout.createSequentialGroup()
                .addComponent(jLabel18)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(Land_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 500, -1, -1));

        Land_1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                Land_1MouseMoved(evt);
            }
        });
        Land_1.setLayout(new javax.swing.OverlayLayout(Land_1));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cabin.png"))); // NOI18N
        Land_1.add(jLabel19);

        getContentPane().add(Land_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 500, -1, -1));

        Start.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                StartMouseMoved(evt);
            }
        });
        Start.setLayout(new javax.swing.OverlayLayout(Start));

        Player01.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mono1.png"))); // NOI18N
        Player01.setLabelFor(Start);
        Player01.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        Player01.setNextFocusableComponent(Bonus_1);
        Player01.setOpaque(true);
        Start.add(Player01);
        Player01.getAccessibleContext().setAccessibleParent(Land_1);

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/workspace.png"))); // NOI18N
        Start.add(jLabel20);

        getContentPane().add(Start, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 500, -1, 100));

        Challenge_5.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                Challenge_5MouseMoved(evt);
            }
        });

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/game.png"))); // NOI18N

        javax.swing.GroupLayout Challenge_5Layout = new javax.swing.GroupLayout(Challenge_5);
        Challenge_5.setLayout(Challenge_5Layout);
        Challenge_5Layout.setHorizontalGroup(
            Challenge_5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Challenge_5Layout.createSequentialGroup()
                .addComponent(jLabel21)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        Challenge_5Layout.setVerticalGroup(
            Challenge_5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Challenge_5Layout.createSequentialGroup()
                .addComponent(jLabel21)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(Challenge_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 100, -1, -1));

        Land_13.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                Land_13MouseMoved(evt);
            }
        });

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cabin.png"))); // NOI18N

        javax.swing.GroupLayout Land_13Layout = new javax.swing.GroupLayout(Land_13);
        Land_13.setLayout(Land_13Layout);
        Land_13Layout.setHorizontalGroup(
            Land_13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Land_13Layout.createSequentialGroup()
                .addComponent(jLabel22)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        Land_13Layout.setVerticalGroup(
            Land_13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Land_13Layout.createSequentialGroup()
                .addComponent(jLabel22)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(Land_13, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 200, -1, -1));

        Land_14.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                Land_14MouseMoved(evt);
            }
        });

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cabin.png"))); // NOI18N

        javax.swing.GroupLayout Land_14Layout = new javax.swing.GroupLayout(Land_14);
        Land_14.setLayout(Land_14Layout);
        Land_14Layout.setHorizontalGroup(
            Land_14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Land_14Layout.createSequentialGroup()
                .addComponent(jLabel23)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        Land_14Layout.setVerticalGroup(
            Land_14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Land_14Layout.createSequentialGroup()
                .addComponent(jLabel23)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(Land_14, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 300, -1, -1));

        Challenge_6.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                Challenge_6MouseMoved(evt);
            }
        });

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/game.png"))); // NOI18N

        javax.swing.GroupLayout Challenge_6Layout = new javax.swing.GroupLayout(Challenge_6);
        Challenge_6.setLayout(Challenge_6Layout);
        Challenge_6Layout.setHorizontalGroup(
            Challenge_6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Challenge_6Layout.createSequentialGroup()
                .addComponent(jLabel24)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        Challenge_6Layout.setVerticalGroup(
            Challenge_6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Challenge_6Layout.createSequentialGroup()
                .addComponent(jLabel24)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(Challenge_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 400, -1, -1));

        jButton1.setFont(new java.awt.Font("微软雅黑", 0, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 102, 102));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/下载.jpg"))); // NOI18N
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 340, 100, 90));

        jLabel25.setFont(new java.awt.Font("Segoe UI Historic", 1, 24)); // NOI18N
        jLabel25.setText("GO!");
        getContentPane().add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 430, -1, -1));

        Text.setEditable(false);
        Text.setFont(new java.awt.Font("Segoe UI Symbol", 1, 24)); // NOI18N
        Text.setText("                   Start!");
        Text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextActionPerformed(evt);
            }
        });
        getContentPane().add(Text, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 230, 390, 50));

        Team1Score.setEditable(false);
        Team1Score.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        Team1Score.setText("Team1 Score:  512");
        Team1Score.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Team1ScoreActionPerformed(evt);
            }
        });
        getContentPane().add(Team1Score, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 120, 190, 30));

        Team2Score.setEditable(false);
        Team2Score.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        Team2Score.setText("Team2 Score:  512");
        Team2Score.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Team2ScoreActionPerformed(evt);
            }
        });
        getContentPane().add(Team2Score, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 150, 190, 30));

        jLabel26.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        jLabel26.setText("Goal:");
        getContentPane().add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 390, 50, 40));

        Player1S.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        Player1S.setText("Player1:");
        getContentPane().add(Player1S, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 130, -1, -1));

        Player2S.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        Player2S.setText("Player2:");
        getContentPane().add(Player2S, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 170, -1, -1));

        Player3S.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        Player3S.setText("Player3:");
        getContentPane().add(Player3S, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 250, -1, -1));

        Player4S.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        Player4S.setText("Player4:");
        getContentPane().add(Player4S, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 290, -1, -1));

        jLabel31.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel31.setText("1000");
        getContentPane().add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 400, -1, -1));

        Player1Score.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        Player1Score.setText("256");
        getContentPane().add(Player1Score, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 130, -1, -1));

        Player2Score.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        Player2Score.setText("256");
        getContentPane().add(Player2Score, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 170, -1, -1));

        Player3Score.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        Player3Score.setText("256");
        getContentPane().add(Player3Score, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 250, -1, -1));

        jLabel36.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        jLabel36.setText("ScoreBoard");
        getContentPane().add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 40, 140, 40));

        Player4Score.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        Player4Score.setText("256");
        getContentPane().add(Player4Score, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 290, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Random rand = new Random();
        int dice = rand.nextInt(4) + 1;
        team_1_score=player_1.money+player_2.money;
        team_2_score=player_3.money+player_4.money;
    /*    if(!(team_1_score>0&&team_1_score<1024&&team_2_score>0&&team_2_score<1024))
        {
            win=true;
        }
        else
     */   
            int currentRow, currentCol;
            if(currentPlayer==1)
            {
                
                player_1.Move(player_1.row,player_1.col,dice);
                currentRow=player_1.row;
                currentCol=player_1.col;
                if(board.position[currentRow][currentCol].value>0&& board.position[currentRow][currentCol].team==0)
                {
                     board.position[currentRow][currentCol].team=1;
                    Text.setText(board.position[currentRow][currentCol].landName+": " +board.position[currentRow][currentCol].value*8+" points"
                    + "Owner: "+board.position[currentRow][currentCol].team);
                    if(player_1.money>board.position[currentRow][currentCol].value*8)
                    {
                        String responds = JOptionPane.showInputDialog(null,"Your points are enough for buying this land, do you want to buy it?(Yes/No) ", "Your Answer:");
                        if(responds.equalsIgnoreCase("Yes")||responds.equalsIgnoreCase("Y"))
                        {
                            player_1.money=player_1.money-board.position[currentRow][currentCol].value*8;
                            Player1Score.setText(Integer.toString(player_1.money));
                            team_1_score=player_1.money+player_2.money;
                            Team1Score.setText("Team1 Score: "+Integer.toString(team_1_score));
                            if(team_1_score>1024||team_2_score<=0)
                            {
                                JOptionPane.showMessageDialog(null, "Team 1 win!!","Kidsnopoly", JOptionPane.INFORMATION_MESSAGE);
                                System.exit(0);
                            }
                            if(team_2_score>1024||team_1_score<=0)
                            {
                                JOptionPane.showMessageDialog(null, "Team 2 win!!","Kidsnopoly", JOptionPane.INFORMATION_MESSAGE);
                                System.exit(0);
                            }
                        }
                        }
                    }
                else if(board.position[currentRow][currentCol].team==2)
                {
                     player_1.money=player_1.money-(board.position[currentRow][currentCol].value * 2);
                     Player1Score.setText(Integer.toString(player_1.money));
                     team_1_score=player_1.money+player_2.money;
                     Team1Score.setText("Team1 Score: "+Integer.toString(team_1_score)); 
                     team_2_score=team_2_score+board.position[currentRow][currentCol].value * 2;
                     if(team_1_score>1024||team_2_score<=0)
                            {
                                JOptionPane.showMessageDialog(null, "Team 1 win!!","Kidsnopoly", JOptionPane.INFORMATION_MESSAGE);
                                System.exit(0);
                            }
                            if(team_2_score>1024||team_1_score<=0)
                            {
                                JOptionPane.showMessageDialog(null, "Team 2 win!!","Kidsnopoly", JOptionPane.INFORMATION_MESSAGE);
                                System.exit(0);
                            }
                     if(team_1_score>1024||team_2_score>1024)
                            {
                                return;
                            }
                     Team2Score.setText("Team2 Score: "+Integer.toString(team_2_score)); 
                }
                else if(board.position[currentRow][currentCol].value==0)
                {
                    if(board.position[currentRow][currentCol].landName.equals("Challenge"))
                    {
                        String selections[] = {"1", "2", "3"};
                         String choice;
                        choice = (String) JOptionPane.showInputDialog(null, "Select the difficulty:","Kidsnopoly", JOptionPane.QUESTION_MESSAGE, null, selections, selections[0]);
                       //Question
                        JOptionPane.showMessageDialog(null, "Here is the question!","Kidsnopoly", JOptionPane.INFORMATION_MESSAGE);
                        String response;
                        response = JOptionPane.showInputDialog(null,"", "Kidsnopoly");   //question here
                        String answer = "";                                             //answer here
                        if (response.equalsIgnoreCase(answer))
                        {
                            JOptionPane.showMessageDialog(null, "You are right! \nThe points are added in your account!","Kidsnopoly", JOptionPane.INFORMATION_MESSAGE);
                            int theNumber = Integer.parseInt(choice);
                            player_1.setMoney(player_1.money + theNumber * 12);
                            team_1_score=player_1.money+player_2.money;
                            Team1Score.setText("Team1 Score: "+Integer.toString(team_1_score));
                            Player1Score.setText(Integer.toString(player_1.money));
                             if(team_1_score>1024||team_2_score<=0)
                            {
                                JOptionPane.showMessageDialog(null, "Team 1 win!!","Kidsnopoly", JOptionPane.INFORMATION_MESSAGE);
                                System.exit(0);
                            }
                            if(team_2_score>1024||team_1_score<=0)
                            {
                                JOptionPane.showMessageDialog(null, "Team 2 win!!","Kidsnopoly", JOptionPane.INFORMATION_MESSAGE);
                                System.exit(0);
                            }
                    
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(null, "You are Wrong! \nNo points added","Kidsnopoly", JOptionPane.INFORMATION_MESSAGE);   
                        }  
                    }
                    else if(board.position[currentRow][currentCol].landName.equals("Lucky_3"))
                    {
                        player_1.lucky_3();
                    }
                    if(currentRow == 5 && currentCol == 7)
                    {
                        player_1.money = player_1.money + 64;
                        Player1Score.setText(Integer.toString(player_1.money));
                        team_1_score=player_1.money+player_2.money;
                        Team1Score.setText("Team1 Score: "+Integer.toString(team_1_score)); 
                        if(team_1_score>1024||team_2_score<=0)
                            {
                                JOptionPane.showMessageDialog(null, "Team 1 win!!","Kidsnopoly", JOptionPane.INFORMATION_MESSAGE);
                                System.exit(0);
                            }
                            if(team_2_score>1024||team_1_score<=0)
                            {
                                JOptionPane.showMessageDialog(null, "Team 2 win!!","Kidsnopoly", JOptionPane.INFORMATION_MESSAGE);
                                System.exit(0);
                            }
                    }
                    
                }
                }
               
            else if(currentPlayer==2)
            {
                player_2.Move(player_2.row,player_2.col,dice);
                currentRow=player_2.row;
                currentCol=player_2.col;
                if(board.position[currentRow][currentCol].value>0&& board.position[currentRow][currentCol].team==0)
                {
                     board.position[currentRow][currentCol].team=1;
                    Text.setText(board.position[currentRow][currentCol].landName+": " +board.position[currentRow][currentCol].value*8+" points"
                    + "Owner: "+board.position[currentRow][currentCol].team);
                    if(player_2.money>board.position[currentRow][currentCol].value*8)
                    {
                        String responds = JOptionPane.showInputDialog(null,"Your points are enough for buying this land, do you want to buy it?(Yes/No) ", "Your A\n" +
"                        String responds = JOptionPane.showInputDialog(null,\"Your points are nswer:");
                        if(responds.equalsIgnoreCase("Yes")||responds.equalsIgnoreCase("Y"))
                        {
                            player_2.money=player_2.money-board.position[currentRow][currentCol].value*8;
                            Player2Score.setText(Integer.toString(player_2.money));
                            team_1_score=player_2.money+player_2.money;
                            Team1Score.setText("Team1 Score: "+Integer.toString(team_1_score));
                            if(team_1_score>1024||team_2_score<=0)
                            {
                                JOptionPane.showMessageDialog(null, "Team 1 win!!","Kidsnopoly", JOptionPane.INFORMATION_MESSAGE);
                                System.exit(0);
                            }
                            if(team_2_score>1024||team_1_score<=0)
                            {
                                JOptionPane.showMessageDialog(null, "Team 2 win!!","Kidsnopoly", JOptionPane.INFORMATION_MESSAGE);
                                System.exit(0);
                            }
                        }
                        }
                    }
                else if(board.position[currentRow][currentCol].team==2)
                {
                     player_2.money=player_2.money-(board.position[currentRow][currentCol].value * 2);
                     Player2Score.setText(Integer.toString(player_2.money));
                     team_1_score=player_1.money+player_2.money;
                     Team1Score.setText("Team1 Score: "+Integer.toString(team_1_score)); 
                     team_2_score=team_2_score+board.position[currentRow][currentCol].value * 2;
                     Team2Score.setText("Team2 Score: "+Integer.toString(team_2_score)); 
                }
                else if(board.position[currentRow][currentCol].value==0)
                {
                    if(board.position[currentRow][currentCol].landName.equals("Challenge"))
                    {
                        String selections[] = {"1", "2", "3"};
                         String choice;
                        choice = (String) JOptionPane.showInputDialog(null, "Select the difficulty:","Kidsnopoly", JOptionPane.QUESTION_MESSAGE, null, selections, selections[0]);
                       //Question
                        JOptionPane.showMessageDialog(null, "Here is the question!","Kidsnopoly", JOptionPane.INFORMATION_MESSAGE);
                        String response;
                        response = JOptionPane.showInputDialog(null,"", "Kidsnopoly");   //question here
                        String answer = "";                                             //answer here
                        if (response.equalsIgnoreCase(answer))
                        {
                            JOptionPane.showMessageDialog(null, "You are right! \nThe points are added in your account!","Kidsnopoly", JOptionPane.INFORMATION_MESSAGE);
                            int theNumber = Integer.parseInt(choice);
                            player_2.setMoney(player_2.money + theNumber * 12);
                            team_1_score=player_1.money+player_2.money;
                            Team1Score.setText("Team1 Score: "+Integer.toString(team_1_score));
                            Player2Score.setText(Integer.toString(player_2.money));
                            if(team_1_score>1024||team_2_score<=0)
                            {
                                JOptionPane.showMessageDialog(null, "Team 1 win!!","Kidsnopoly", JOptionPane.INFORMATION_MESSAGE);
                                System.exit(0);
                            }
                            if(team_2_score>1024||team_1_score<=0)
                            {
                                JOptionPane.showMessageDialog(null, "Team 2 win!!","Kidsnopoly", JOptionPane.INFORMATION_MESSAGE);
                                System.exit(0);
                            }
                    
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(null, "You are Wrong! \nNo points added","Kidsnopoly", JOptionPane.INFORMATION_MESSAGE);   
                        }  
                    }
                    else if(board.position[currentRow][currentCol].landName.equals("Lucky_3"))
                    {
                        player_2.lucky_3();
                    }
                    if(currentRow == 5 && currentCol == 7)
                    {
                        player_2.money = player_2.money + 64;
                        Player2Score.setText(Integer.toString(player_2.money));
                        team_1_score=player_1.money+player_2.money;
                        Team1Score.setText("Team1 Score: "+Integer.toString(team_1_score)); 
                        if(team_1_score>1024||team_2_score<=0)
                            {
                                JOptionPane.showMessageDialog(null, "Team 1 win!!","Kidsnopoly", JOptionPane.INFORMATION_MESSAGE);
                                System.exit(0);
                            }
                            if(team_2_score>1024||team_1_score<=0)
                            {
                                JOptionPane.showMessageDialog(null, "Team 2 win!!","Kidsnopoly", JOptionPane.INFORMATION_MESSAGE);
                                System.exit(0);
                            }
                    }
                    
                }
            }
            else if(currentPlayer==3)
            {
                player_3.Move(player_3.row,player_3.col,dice);
                currentRow=player_3.row;
                currentCol=player_3.col;
                if(board.position[currentRow][currentCol].value>0&& board.position[currentRow][currentCol].team==0)
                {
                     board.position[currentRow][currentCol].team=2;
                    Text.setText(board.position[currentRow][currentCol].landName+": " +board.position[currentRow][currentCol].value*8+" points"
                    + "Owner: "+board.position[currentRow][currentCol].team);
                    if(player_3.money>board.position[currentRow][currentCol].value*8)
                    {
                        String responds = JOptionPane.showInputDialog(null,"Your points are enough for buying this land, do you want to buy it?(Yes/No) ", "Your Answer:");
                        if(responds.equalsIgnoreCase("Yes")||responds.equalsIgnoreCase("Y"))
                        {
                            player_3.money=player_3.money-board.position[currentRow][currentCol].value*8;
                            Player3Score.setText(Integer.toString(player_3.money));
                            team_2_score=player_3.money+player_4.money;
                            Team2Score.setText("Team2 Score: "+Integer.toString(team_2_score));
                            if(team_1_score>1024||team_2_score<=0)
                            {
                                JOptionPane.showMessageDialog(null, "Team 1 win!!","Kidsnopoly", JOptionPane.INFORMATION_MESSAGE);
                                System.exit(0);
                            }
                            if(team_2_score>1024||team_1_score<=0)
                            {
                                JOptionPane.showMessageDialog(null, "Team 2 win!!","Kidsnopoly", JOptionPane.INFORMATION_MESSAGE);
                                System.exit(0);
                            }
                        }
                        }
                    }
                else if(board.position[currentRow][currentCol].team==1)
                {
                     player_3.money=player_3.money-(board.position[currentRow][currentCol].value * 2);
                     Player3Score.setText(Integer.toString(player_3.money));
                     team_2_score=player_3.money+player_4.money;
                     Team2Score.setText("Team2 Score: "+Integer.toString(team_2_score)); 
                     team_1_score=team_1_score+board.position[currentRow][currentCol].value * 2;
                     Team1Score.setText("Team1 Score: "+Integer.toString(team_1_score)); 
                     if(team_1_score>1024||team_2_score<=0)
                            {
                                JOptionPane.showMessageDialog(null, "Team 1 win!!","Kidsnopoly", JOptionPane.INFORMATION_MESSAGE);
                                System.exit(0);
                            }
                            if(team_2_score>1024||team_1_score<=0)
                            {
                                JOptionPane.showMessageDialog(null, "Team 2 win!!","Kidsnopoly", JOptionPane.INFORMATION_MESSAGE);
                                System.exit(0);
                            }
                }
                else if(board.position[currentRow][currentCol].value==0)
                {
                    if(board.position[currentRow][currentCol].landName.equals("Challenge"))
                    {
                        String selections[] = {"1", "2", "3"};
                         String choice;
                        choice = (String) JOptionPane.showInputDialog(null, "Select the difficulty:","Kidsnopoly", JOptionPane.QUESTION_MESSAGE, null, selections, selections[0]);
                       //Question
                        JOptionPane.showMessageDialog(null, "Here is the question!","Kidsnopoly", JOptionPane.INFORMATION_MESSAGE);
                        String response;
                        response = JOptionPane.showInputDialog(null,"", "Kidsnopoly");   //question here
                        String answer = "";                                             //answer here
                        if (response.equalsIgnoreCase(answer))
                        {
                            JOptionPane.showMessageDialog(null, "You are right! \nThe points are added in your account!","Kidsnopoly", JOptionPane.INFORMATION_MESSAGE);
                            int theNumber = Integer.parseInt(choice);
                            player_3.setMoney(player_3.money + theNumber * 12);
                            team_2_score=player_3.money+player_4.money;
                            Team2Score.setText("Team2 Score: "+Integer.toString(team_2_score));
                            Player3Score.setText(Integer.toString(player_3.money));
                            if(team_1_score>1024||team_2_score<=0)
                            {
                                JOptionPane.showMessageDialog(null, "Team 1 win!!","Kidsnopoly", JOptionPane.INFORMATION_MESSAGE);
                                System.exit(0);
                            }
                            if(team_2_score>1024||team_1_score<=0)
                            {
                                JOptionPane.showMessageDialog(null, "Team 2 win!!","Kidsnopoly", JOptionPane.INFORMATION_MESSAGE);
                                System.exit(0);
                            }
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(null, "You are Wrong! \nNo points added","Kidsnopoly", JOptionPane.INFORMATION_MESSAGE);   
                        }  
                    }
                    else if(board.position[currentRow][currentCol].landName.equals("Lucky_3"))
                    {
                        player_3.lucky_3();
                    }
                    if(currentRow == 5 && currentCol == 7)
                    {
                        player_3.money = player_3.money + 64;
                        Player3Score.setText(Integer.toString(player_3.money));
                        team_2_score=player_3.money+player_4.money;
                        Team2Score.setText("Team2 Score: "+Integer.toString(team_2_score)); 
                        if(team_1_score>1024||team_2_score<=0)
                            {
                                JOptionPane.showMessageDialog(null, "Team 1 win!!","Kidsnopoly", JOptionPane.INFORMATION_MESSAGE);
                                System.exit(0);
                            }
                            if(team_2_score>1024||team_1_score<=0)
                            {
                                JOptionPane.showMessageDialog(null, "Team 2 win!!","Kidsnopoly", JOptionPane.INFORMATION_MESSAGE);
                                System.exit(0);
                            }
                    }
                    
                }
            }
            else if(currentPlayer==4)
            {
                player_4.Move(player_4.row,player_4.col,dice);
                currentRow=player_4.row;
                currentCol=player_4.col;
                if(board.position[currentRow][currentCol].value>0&& board.position[currentRow][currentCol].team==0)
                {
                     board.position[currentRow][currentCol].team=2;
                    Text.setText(board.position[currentRow][currentCol].landName+": " +board.position[currentRow][currentCol].value*8+" points"
                    + "Owner: "+board.position[currentRow][currentCol].team);
                    if(player_4.money>board.position[currentRow][currentCol].value*8)
                    {
                        String responds = JOptionPane.showInputDialog(null,"Your points are enough for buying this land, do you want to buy it?(Yes/No) ", "Your Answer:");
                        if(responds.equalsIgnoreCase("Yes")||responds.equalsIgnoreCase("Y"))
                        {
                            player_4.money=player_4.money-board.position[currentRow][currentCol].value*8;
                            Player4Score.setText(Integer.toString(player_4.money));
                            team_2_score=player_3.money+player_4.money;
                            Team2Score.setText("Team2 Score: "+Integer.toString(team_2_score));
                            if(team_1_score>1024||team_2_score<=0)
                            {
                                JOptionPane.showMessageDialog(null, "Team 1 win!!","Kidsnopoly", JOptionPane.INFORMATION_MESSAGE);
                                System.exit(0);
                            }
                            if(team_2_score>1024||team_1_score<=0)
                            {
                                JOptionPane.showMessageDialog(null, "Team 2 win!!","Kidsnopoly", JOptionPane.INFORMATION_MESSAGE);
                                System.exit(0);
                            }
                        }
                        }
                    }
                else if(board.position[currentRow][currentCol].team==1)
                {
                     player_4.money=player_4.money-(board.position[currentRow][currentCol].value * 2);
                     Player4Score.setText(Integer.toString(player_4.money));
                     team_2_score=player_3.money+player_4.money;
                     Team2Score.setText("Team2 Score: "+Integer.toString(team_2_score)); 
                     team_1_score=team_1_score+board.position[currentRow][currentCol].value * 2;
                     Team1Score.setText("Team1 Score: "+Integer.toString(team_1_score)); 
                     if(team_1_score>1024||team_2_score<=0)
                            {
                                JOptionPane.showMessageDialog(null, "Team 1 win!!","Kidsnopoly", JOptionPane.INFORMATION_MESSAGE);
                                System.exit(0);
                            }
                            if(team_2_score>1024||team_1_score<=0)
                            {
                                JOptionPane.showMessageDialog(null, "Team 2 win!!","Kidsnopoly", JOptionPane.INFORMATION_MESSAGE);
                                System.exit(0);
                            }
                }
                else if(board.position[currentRow][currentCol].value==0)
                {
                    if(board.position[currentRow][currentCol].landName.equals("Challenge"))
                    {
                        String selections[] = {"1", "2", "3"};
                         String choice;
                        choice = (String) JOptionPane.showInputDialog(null, "Select the difficulty:","Kidsnopoly", JOptionPane.QUESTION_MESSAGE, null, selections, selections[0]);
                       //Question
                        JOptionPane.showMessageDialog(null, "Here is the question!","Kidsnopoly", JOptionPane.INFORMATION_MESSAGE);
                        String response;
                        response = JOptionPane.showInputDialog(null,"", "Kidsnopoly");   //question here
                        String answer = "";                                             //answer here
                        if (response.equalsIgnoreCase(answer))
                        {
                            JOptionPane.showMessageDialog(null, "You are right! \nThe points are added in your account!","Kidsnopoly", JOptionPane.INFORMATION_MESSAGE);
                            int theNumber = Integer.parseInt(choice);
                            player_4.setMoney(player_4.money + theNumber * 12);
                            team_2_score=player_3.money+player_4.money;
                            Team2Score.setText("Team2 Score: "+Integer.toString(team_2_score));
                            Player4Score.setText(Integer.toString(player_4.money));
                            if(team_1_score>1024||team_2_score<=0)
                            {
                                JOptionPane.showMessageDialog(null, "Team 1 win!!","Kidsnopoly", JOptionPane.INFORMATION_MESSAGE);
                                System.exit(0);
                            }
                            if(team_2_score>1024||team_1_score<=0)
                            {
                                JOptionPane.showMessageDialog(null, "Team 2 win!!","Kidsnopoly", JOptionPane.INFORMATION_MESSAGE);
                                System.exit(0);
                            }
                    
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(null, "You are Wrong! \nNo points added","Kidsnopoly", JOptionPane.INFORMATION_MESSAGE);   
                        }  
                    }
                    else if(board.position[currentRow][currentCol].landName.equals("Lucky_3"))
                    {
                        player_4.lucky_3();
                    }
                    if(currentRow == 5 && currentCol == 7)
                    {
                        player_4.money = player_4.money + 64;
                        Player4Score.setText(Integer.toString(player_4.money));
                        team_2_score=player_3.money+player_4.money;
                        Team2Score.setText("Team2 Score: "+Integer.toString(team_2_score)); 
                        if(team_1_score>1024||team_2_score<=0)
                            {
                                JOptionPane.showMessageDialog(null, "Team 1 win!!","Kidsnopoly", JOptionPane.INFORMATION_MESSAGE);
                                System.exit(0);
                            }
                            if(team_2_score>1024||team_1_score<=0)
                            {
                                JOptionPane.showMessageDialog(null, "Team 2 win!!","Kidsnopoly", JOptionPane.INFORMATION_MESSAGE);
                                System.exit(0);
                            }
                    }
                    
                }
            }
        
        
        if(currentPlayer==4)
        {
            currentPlayer=1;
        }
        else
        {
            currentPlayer++;
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void TextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextActionPerformed
        
    }//GEN-LAST:event_TextActionPerformed

    private void Land_1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Land_1MouseMoved
        Text.setText("char: 8 points");
    }//GEN-LAST:event_Land_1MouseMoved

    private void Land_2MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Land_2MouseMoved
        Text.setText("char: 8 points");
    }//GEN-LAST:event_Land_2MouseMoved

    private void Land_3MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Land_3MouseMoved
        Text.setText("char: 8 points");
    }//GEN-LAST:event_Land_3MouseMoved

    private void Land_4MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Land_4MouseMoved
        Text.setText("short: 32 points");
    }//GEN-LAST:event_Land_4MouseMoved

    private void Land_5MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Land_5MouseMoved
        Text.setText("short: 32 points");
    }//GEN-LAST:event_Land_5MouseMoved

    private void jLabel11MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel11MouseMoved

    private void Land_6MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Land_6MouseMoved
        Text.setText("int: 32 points");
    }//GEN-LAST:event_Land_6MouseMoved

    private void Land_7MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Land_7MouseMoved
       Text.setText("int: 32 points");
    }//GEN-LAST:event_Land_7MouseMoved

    private void Land_8MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Land_8MouseMoved
        Text.setText("double: 64 points");
    }//GEN-LAST:event_Land_8MouseMoved

    private void jLabel3MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseMoved

    }//GEN-LAST:event_jLabel3MouseMoved

    private void Land_9MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Land_9MouseMoved
        Text.setText("double: 64 points");
    }//GEN-LAST:event_Land_9MouseMoved

    private void Land_10MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Land_10MouseMoved
        Text.setText("long: 64 points");
    }//GEN-LAST:event_Land_10MouseMoved

    private void Land_11MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Land_11MouseMoved
        Text.setText("long: 64 points");
    }//GEN-LAST:event_Land_11MouseMoved

    private void Land_12MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Land_12MouseMoved
        Text.setText("long: 64 points");
    }//GEN-LAST:event_Land_12MouseMoved

    private void Land_14MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Land_14MouseMoved
         Text.setText("long long: 128 points");
    }//GEN-LAST:event_Land_14MouseMoved

    private void Land_13MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Land_13MouseMoved
         Text.setText("long long: 128 points");
    }//GEN-LAST:event_Land_13MouseMoved

    private void Challenge_1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Challenge_1MouseMoved
        Text.setText("        Challenge!");  
    }//GEN-LAST:event_Challenge_1MouseMoved

    private void StartMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StartMouseMoved
       Text.setText("            Start!");
    }//GEN-LAST:event_StartMouseMoved

    private void jLabel16MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseMoved
        
    }//GEN-LAST:event_jLabel16MouseMoved

    private void Challenge_1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Challenge_1MouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_Challenge_1MouseDragged

    private void Challenge_6MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Challenge_6MouseMoved
       Text.setText("        Challenge!");
    }//GEN-LAST:event_Challenge_6MouseMoved

    private void Challenge_5MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Challenge_5MouseMoved
        Text.setText("        Challenge!");
    }//GEN-LAST:event_Challenge_5MouseMoved

    private void Challenge_2MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Challenge_2MouseMoved
       Text.setText("        Challenge!");
    }//GEN-LAST:event_Challenge_2MouseMoved

    private void Challenge_3MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Challenge_3MouseMoved
       Text.setText("        Challenge!");
    }//GEN-LAST:event_Challenge_3MouseMoved

    private void Challenge_4MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Challenge_4MouseMoved
       Text.setText("        Challenge!");
    }//GEN-LAST:event_Challenge_4MouseMoved

    private void Bonus_1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Bonus_1MouseMoved
        Text.setText("          Lucky!");
    }//GEN-LAST:event_Bonus_1MouseMoved

    private void jLabel5MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseMoved
         Text.setText("          Lucky!");
    }//GEN-LAST:event_jLabel5MouseMoved

    private void Bonus_3MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Bonus_3MouseMoved
         Text.setText("          Lucky!");
    }//GEN-LAST:event_Bonus_3MouseMoved

    private void Team1ScoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Team1ScoreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Team1ScoreActionPerformed

    private void Team2ScoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Team2ScoreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Team2ScoreActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Bonus_1;
    private javax.swing.JPanel Bonus_2;
    private javax.swing.JPanel Bonus_3;
    private javax.swing.JPanel Challenge_1;
    private javax.swing.JPanel Challenge_2;
    private javax.swing.JPanel Challenge_3;
    private javax.swing.JPanel Challenge_4;
    private javax.swing.JPanel Challenge_5;
    private javax.swing.JPanel Challenge_6;
    private javax.swing.JPanel Land_1;
    private javax.swing.JPanel Land_10;
    private javax.swing.JPanel Land_11;
    private javax.swing.JPanel Land_12;
    private javax.swing.JPanel Land_13;
    private javax.swing.JPanel Land_14;
    private javax.swing.JPanel Land_2;
    private javax.swing.JPanel Land_3;
    private javax.swing.JPanel Land_4;
    private javax.swing.JPanel Land_5;
    private javax.swing.JPanel Land_6;
    private javax.swing.JPanel Land_7;
    private javax.swing.JPanel Land_8;
    private javax.swing.JPanel Land_9;
    private javax.swing.JLabel Player01;
    private javax.swing.JLabel Player1S;
    private javax.swing.JLabel Player1Score;
    private javax.swing.JLabel Player2S;
    private javax.swing.JLabel Player2Score;
    private javax.swing.JLabel Player3S;
    private javax.swing.JLabel Player3Score;
    private javax.swing.JLabel Player4S;
    private javax.swing.JLabel Player4Score;
    private javax.swing.JPanel Start;
    private javax.swing.JTextField Team1Score;
    private javax.swing.JTextField Team2Score;
    private javax.swing.JTextField Text;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel25;
    // End of variables declaration//GEN-END:variables


}
