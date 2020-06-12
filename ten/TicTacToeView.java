package ten;

//
//  File: TicTacToeView.java
//  Auth: 20184646 권석환
//	Date: 1 June 2020
//  Desc: View responsible for presenting TicTacToe game to user
//

import javax.swing.*;                  // graphics

import java.awt.event.ActionListener;  // respond to user
import java.awt.Color;                 // adjust colors
import java.awt.Component;             // adjust components
import java.awt.Dimension;             // size the JFrame
import java.awt.event.MouseAdapter;    // button hover states
import java.awt.event.MouseEvent;
import java.awt.Font;                  // adjust fonts
import java.awt.GridLayout;            // game board grid
import java.awt.Graphics;              // winner line
import java.awt.Graphics2D;
import java.awt.BasicStroke;

@SuppressWarnings("serial")
public class TicTacToeView extends JFrame
{
    //----------------------------------------------------------//
    //    CUSTOMIZE INITIAL TIC-TAC-TOE VIEW APPEARANCE HERE    //
    //----------------------------------------------------------//

    // General.
    private final String   APP_TITLE           = "TIC-TAC-TOE";
    private final String   APP_FONT            = "Sans Serif";
    private final int      APP_WIDTH           = 400;
    private final int      APP_HEIGHT          = 650;
    private final int      APP_PADDING         = 25;
    // Color scheme.
    private final Color    BG_COLOR            = Color.WHITE;
    private final Color    BG_COLOR_2          = Color.decode( "#EFFFF7" );  // off white
    private final Color    TIC_TAC_NAVY        = Color.decode( "#34485D" );
    private final Color    TIC_TAC_GREEN       = Color.decode( "#19BC9C" );
    private final Color    TIC_TAC_RED         = Color.decode( "#E74C3C" );  // normal
    private final Color    TIC_TAC_RED_2       = Color.decode( "#D94334" );  // hover
    private final Color    TIC_TAC_RED_3       = Color.decode( "#EA6052" );  // press
    private final Color    TIC_TAC_BLUE        = Color.decode( "#3498DB" );  // normal
    private final Color    TIC_TAC_BLUE_2      = Color.decode( "#2A8BC9" );  // hover
    private final Color    TIC_TAC_BLUE_3      = Color.decode( "#5AADE3" );  // press
    private final Color    TIC_TAC_GRAY        = Color.decode( "#7F8C9A" );
    // FSU title bar.
    private final String   TITLE_TEXT          = "Tic-Tac-Toe";
    private final Color    TITLE_COLOR         = TIC_TAC_GREEN;
    private final int      TITLE_FONT_SIZE     = 35;
    private final int      TITLE_TOP_PAD       = 10;
    private final int      TITLE_BTM_PAD       = 20;
    // Gameboard
    private final int      GAME_BOARD_SIZE     = APP_WIDTH - APP_PADDING;
    private final Color    GAME_FONT_COLOR     = TIC_TAC_NAVY;
    private final int      GAME_FONT_SIZE      = 75;
    private final int      GAME_LINE_WIDTH     = 3;
    private final Color    GAME_LINE_COLOR     = TIC_TAC_GREEN;
    private final Color    GAME_HOVER_COLOR    = BG_COLOR_2;
    // Game status label
    private final String   STATUS_TEXT         = "X 표시를 만드시면 게임이 시작됩니다.";
    private final int      STATUS_FONT_SIZE    = 20;
    private final Color    STATUS_COLOR        = TIC_TAC_NAVY;
    private final int      STATUS_TOP_PAD      = 30;
    private final int      STATUS_BTM_PAD      = 30;
    // Bottom buttons
    private final int      BTN_GAP             = 5;
    private final int      BTN_HGT             = 125;
    private final int      BTN_FONT_SIZE       = 16;
    private final Color    BTN_TEXT_COLOR      = Color.WHITE;
    private final String   NEW_GAME_BTN_TEXT   = "새로운 게임 시작";
    private final Color    RESET_BG_COLOR      = TIC_TAC_RED;
    private final Color    RESET_BG_HOVER      = TIC_TAC_RED_2;
    private final Color    RESET_BG_PRESS      = TIC_TAC_RED_3;
    private final String   GAME_MODE_BTN_TEXT  = "게임모드 바꾸기";
    private final Color    OPPONENT_BG_COLOR   = TIC_TAC_BLUE;
    private final Color    OPPONENT_BG_HOVER   = TIC_TAC_BLUE_2;
    private final Color    OPPONENT_BG_PRESS   = TIC_TAC_BLUE_3;
    // Credits label
    private final String   CREDITS_TEXT        = "권석환";
    private final Color    CREDITS_COLOR       = TIC_TAC_GRAY;
    private final int      CREDITS_FONT_SIZE   = 12;
    private final int      CREDITS_LABEL_HGT   = 45;
    // Opponent mode label
    private final String   OPPONENT_MODE_TEXT  = "2 인용";
    private final Color    OPPONENT_MODE_COLOR = TIC_TAC_NAVY;

    //------------------------//
    //    TIC-TAC-TOE VIEW    //
    //------------------------//

    private JButton    square[][]        = new JButton[3][3];                         // gameboard
    private JLabel     gameStatusLabel   = new JLabel( STATUS_TEXT, JLabel.CENTER );  // game status
    private JButton    resetBtn          = new JButton();                             // new game button
    private JButton    opponentBtn       = new JButton();                             // opponent button
    private JLabel     opponentModeLabel = new JLabel( OPPONENT_MODE_TEXT );          // game mode label
    private WinnerLine winnerLine        = new WinnerLine();

    // Class WinnerLine
    // When game is won, add line marking 3 in a row on the gameboard.
    public class WinnerLine extends JPanel
    {
        private int x1, y1, x2, y2;

        public void paintComponent( Graphics g )
        {
            super.paintComponent( g );
            Graphics2D g2d = ( Graphics2D ) g;
            g2d.setColor( TIC_TAC_RED );
            g2d.setStroke( new BasicStroke( 5 ) );
            g2d.drawLine( x1, y1, x2, y2 );
        }

        public void setCoordinates(  int x1, int y1, int x2, int y2 )
        {
            this.x1 = x1;
            this.y1 = y1;
            this.x2 = x2;
            this.y2 = y2;
        }
    } // end class Winner Line

    // Tic Tac Toe view constructor.
    // Sets up the view and adds all view components.
    public TicTacToeView()
    {
        // JFrame containing application.
        this.setTitle( APP_TITLE );
        this.setSize( APP_WIDTH, APP_HEIGHT );
        this.setMinimumSize( new Dimension( APP_WIDTH, APP_HEIGHT ));
        this.setMaximumSize( new Dimension( APP_WIDTH, APP_HEIGHT ));
        this.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );

        // JPanel containing the tic-tac-toe game.
        JPanel ticTacPanel = new JPanel();
        ticTacPanel.setLayout( new BoxLayout( ticTacPanel, BoxLayout.PAGE_AXIS ));
        ticTacPanel.setSize( this.getContentPane().getWidth(), this.getContentPane().getHeight() );
        ticTacPanel.setBackground( BG_COLOR );
        this.add( ticTacPanel );
        
        // FSU Tic-Tac-Nole title bar.
        ticTacPanel.add( Box.createRigidArea( new Dimension( 0, TITLE_TOP_PAD )));  // pad top
        JLabel titleBarLabel = new JLabel( TITLE_TEXT, JLabel.CENTER );
        titleBarLabel.setForeground( TITLE_COLOR );
        titleBarLabel.setFont( new Font( APP_FONT, Font.BOLD, TITLE_FONT_SIZE ));
        titleBarLabel.setAlignmentX( Component.CENTER_ALIGNMENT );
        ticTacPanel.add( titleBarLabel );
        ticTacPanel.add( Box.createRigidArea( new Dimension( 0, TITLE_BTM_PAD )));  // pad bottom

        // Layered pane contains the game board and winner line
        JLayeredPane gameBoardOverlayHandler = new JLayeredPane();
        gameBoardOverlayHandler.setOpaque( false );
        gameBoardOverlayHandler.setPreferredSize( new Dimension( GAME_BOARD_SIZE, GAME_BOARD_SIZE ));
        gameBoardOverlayHandler.setMinimumSize( new Dimension( GAME_BOARD_SIZE, GAME_BOARD_SIZE ));
        gameBoardOverlayHandler.setMaximumSize( new Dimension( GAME_BOARD_SIZE, GAME_BOARD_SIZE ));
        gameBoardOverlayHandler.setLayout( new OverlayLayout( gameBoardOverlayHandler )); 
        ticTacPanel.add( gameBoardOverlayHandler );

        // JPanel containing tic-tac-toe game board.
        JPanel gameBoard = new JPanel();
        gameBoard.setOpaque( false );
        gameBoard.setLayout( new GridLayout( 3, 3 ));
        gameBoardOverlayHandler.add( gameBoard );

        // Winner line
        winnerLine.setOpaque( false );
        gameBoardOverlayHandler.add( winnerLine );
        winnerLine.setVisible( false );

        // Add gameboard and winner line to their parent layered pane.
        gameBoardOverlayHandler.setLayer( winnerLine, 3 );      
        gameBoardOverlayHandler.setLayer( gameBoard, 1 );

        // Setup gameboard squares within the game board.
        for( int i = 0; i < 3; i++ ) {
            for( int j = 0; j < 3; j++ ) {
                // Square setup.
                square[i][j] = new JButton();
                square[i][j].setPreferredSize( new Dimension( GAME_BOARD_SIZE / 3, GAME_BOARD_SIZE / 3 ));
                square[i][j].setMinimumSize( new Dimension( GAME_BOARD_SIZE / 3, GAME_BOARD_SIZE / 3 ));
                square[i][j].setMaximumSize( new Dimension( GAME_BOARD_SIZE / 3, GAME_BOARD_SIZE / 3 ));
                square[i][j].putClientProperty("row", i);
                square[i][j].putClientProperty("col", j);
                square[i][j].setText("");
                square[i][j].setOpaque( true );
                square[i][j].setBackground( BG_COLOR );
                square[i][j].setForeground( GAME_FONT_COLOR );
                square[i][j].setFocusPainted(false);
                square[i][j].setFont( new Font( APP_FONT, Font.BOLD, GAME_FONT_SIZE ));
                int lw = GAME_LINE_WIDTH;
                Color lc = GAME_LINE_COLOR;
                // Square border.
                if ( i == 0 || i == 1 ) {
                    if ( j != 2 ) square[i][j].setBorder( BorderFactory.createMatteBorder( 0, 0, lw, lw, lc ));
                    if ( j == 2 ) square[i][j].setBorder( BorderFactory.createMatteBorder( 0, 0, lw, 0, lc ));
                } else {
                    if ( j != 2 ) square[i][j].setBorder( BorderFactory.createMatteBorder( 0, 0, 0, lw, lc ));
                    if ( j == 2 ) square[i][j].setBorderPainted( false );
                }
                gameBoard.add( square[i][j] ); // add the square
            } // end for( int j = 0; j < 3; j++ )
        } // end for( int i = 0; i < 3; i++ )

        // Game status label.
        ticTacPanel.add( Box.createRigidArea( new Dimension( 0, STATUS_TOP_PAD )));  // pad top
        gameStatusLabel.setForeground( STATUS_COLOR );
        gameStatusLabel.setFont( new Font( APP_FONT, Font.PLAIN, STATUS_FONT_SIZE ));
        gameStatusLabel.setAlignmentX( Component.CENTER_ALIGNMENT );
        ticTacPanel.add( gameStatusLabel );
        ticTacPanel.add( Box.createRigidArea( new Dimension( 0, STATUS_BTM_PAD )));  // pad bottom

        // JPanel containing game setting buttons.
        JPanel btnPanel = new JPanel();
        btnPanel.setOpaque( false );
        btnPanel.setLayout( new GridLayout( 1, 2, BTN_GAP, BTN_GAP ) );
        btnPanel.setMaximumSize( new Dimension( GAME_BOARD_SIZE, APP_HEIGHT ));
        ticTacPanel.add( btnPanel );

        // Start new game button.
        resetBtn.setText( NEW_GAME_BTN_TEXT );
        resetBtn.setBorderPainted( false );
        resetBtn.setOpaque(true);
        resetBtn.setForeground( BTN_TEXT_COLOR );
        resetBtn.setBackground( RESET_BG_COLOR );
        resetBtn.setFocusPainted(false);
        resetBtn.setFont( new Font( APP_FONT, Font.BOLD, BTN_FONT_SIZE ));
        resetBtn.setMaximumSize( new Dimension( GAME_BOARD_SIZE, BTN_HGT ));
        resetBtn.setMinimumSize( new Dimension( GAME_BOARD_SIZE, BTN_HGT ));
        btnPanel.add( resetBtn );
        addNewGameButtonHoverState();

        // Opponent button.
        opponentBtn.setText( GAME_MODE_BTN_TEXT );
        opponentBtn.setBorderPainted( false );
        opponentBtn.setOpaque(true);
        opponentBtn.setForeground( BTN_TEXT_COLOR );
        opponentBtn.setBackground( OPPONENT_BG_COLOR );
        opponentBtn.setFocusPainted(false);
        opponentBtn.setMaximumSize( new Dimension( GAME_BOARD_SIZE, BTN_HGT ));
        opponentBtn.setMinimumSize( new Dimension( GAME_BOARD_SIZE, BTN_HGT ));
        opponentBtn.setFont( new Font( APP_FONT, Font.BOLD, BTN_FONT_SIZE ));
        btnPanel.add( opponentBtn );
        addOpponentModeButtonHoverState();

        // JPanel containing footer credits and opponent mode.
        JPanel footerPanel = new JPanel();
        footerPanel.setOpaque( false );
        footerPanel.setLayout( new GridLayout( 1, 2, 0, 0 ) );
        footerPanel.setMaximumSize( new Dimension( GAME_BOARD_SIZE - APP_PADDING, APP_HEIGHT ));
        ticTacPanel.add( footerPanel );

        // Credits label.
        JLabel creditsLabel = new JLabel( CREDITS_TEXT );
        creditsLabel.setMinimumSize( new Dimension( GAME_BOARD_SIZE, CREDITS_LABEL_HGT ));
        creditsLabel.setMaximumSize( new Dimension( GAME_BOARD_SIZE, CREDITS_LABEL_HGT ));
        opponentModeLabel.setHorizontalAlignment( SwingConstants.LEFT );
        creditsLabel.setForeground( CREDITS_COLOR );
        creditsLabel.setFont( new Font( APP_FONT, Font.ITALIC, CREDITS_FONT_SIZE ));
        creditsLabel.setAlignmentX( Component.CENTER_ALIGNMENT );
        footerPanel.add( creditsLabel );

        // Opponent model label.
        opponentModeLabel.setMinimumSize( new Dimension( GAME_BOARD_SIZE, CREDITS_LABEL_HGT ));
        opponentModeLabel.setMaximumSize( new Dimension( GAME_BOARD_SIZE, CREDITS_LABEL_HGT ));
        opponentModeLabel.setHorizontalAlignment( SwingConstants.RIGHT );
        opponentModeLabel.setForeground( OPPONENT_MODE_COLOR );
        opponentModeLabel.setFont( new Font( APP_FONT, Font.PLAIN, CREDITS_FONT_SIZE ));
        opponentModeLabel.setAlignmentX( Component.CENTER_ALIGNMENT );
        footerPanel.add( opponentModeLabel );

    } // end TicTacToeView() constructor

    //------------------------------------------------------------//
    //    VIEW UI UPDATES                                         //
    //    Allow controller to initiate UI updates of the view     //
    //------------------------------------------------------------//

    public void updateGameBoardUI( char[][] gameBoard )
    {
        for( int i = 0; i < 3; i++ ) {
            for( int j = 0; j < 3; j++ ) {
                square[i][j].setText( String.valueOf( gameBoard[i][j] ) );
            }
        }
    }

    public void updateSquareUIForHoverState( int row, int col )
    {
        square[row][col].setOpaque( true );
        square[row][col].setBackground( GAME_HOVER_COLOR );
    }

    public void updateSquareUIForNormalState( int row, int col )
    {
        square[row][col].setOpaque( false );
        square[row][col].setBackground( BG_COLOR );
    }

    public void updateWinnerLine( int row1, int col1, int row2, int col2 )
    {
        int offsetToCenter = (GAME_BOARD_SIZE / 3) / 2;
        int x1 = square[row1][col1].getX() + offsetToCenter;
        int y1 = square[row1][col1].getY() + offsetToCenter;
        int x2 = square[row2][col2].getX() + offsetToCenter;
        int y2 = square[row2][col2].getY() + offsetToCenter;
        winnerLine.setCoordinates( x1, y1, x2, y2 );
        winnerLine.setVisible( true );
    }

    public void resetWinnerLine()
    {
        winnerLine.setVisible( false );
    }

    public void updateGameStatusLabelText( String text )
    {
        gameStatusLabel.setText( text );
    }

    public void updateOpponentModeLabelText( String text )
    {
        opponentModeLabel.setText( text );
    }

    //------------------------------------------------------------------------------//
    //    EVENT LISTENERS                                                           //
    //    Allow the controller to handle events associated with a view component    //
    //    Display hover states on components                                        //
    //------------------------------------------------------------------------------//

    public void addGameBoardSquareButtonListener( ActionListener listenForSquareButtonClick )
    {
        for( int i = 0; i < 3; i++ ) {
            for( int j = 0; j < 3; j++ ) {
                square[i][j].addActionListener( listenForSquareButtonClick );
            }
        }
    }

    public void addGameBoardSquareButtonHoverListener( MouseAdapter listenForSquareButtonHover )
    {
        for( int i = 0; i < 3; i++ ) {
            for( int j = 0; j < 3; j++ ) {
                square[i][j].addMouseListener( listenForSquareButtonHover );
            }
        }
    }

    public void addNewGameButtonListener( ActionListener listenForNewGameButtonClick )
    {
        resetBtn.addActionListener( listenForNewGameButtonClick );
    }

    private void addNewGameButtonHoverState()
    {
        // Hover states - Game reset button.
        resetBtn.addMouseListener( new MouseAdapter() {
            @Override
            public void mouseEntered( MouseEvent e ) {
                resetBtn.setBackground( RESET_BG_HOVER );
            }
            @Override
            public void mouseExited( MouseEvent e ) {
                resetBtn.setBackground( RESET_BG_COLOR );
            }
            @Override
            public void mousePressed( MouseEvent e ) {
                resetBtn.setBackground( RESET_BG_PRESS );
            }
            @Override
            public void mouseReleased( MouseEvent e ) {
                resetBtn.setBackground( RESET_BG_HOVER );
            }
        });
    }

    public void addOpponentModeButtonListener( ActionListener listenForOpponentModeButtonClick )
    {
        opponentBtn.addActionListener( listenForOpponentModeButtonClick );
    }

    private void addOpponentModeButtonHoverState()
    {
        // Hover state - Opponent button.
        opponentBtn.addMouseListener( new MouseAdapter() {
            @Override
            public void mouseEntered( MouseEvent e ) {
                opponentBtn.setBackground( OPPONENT_BG_HOVER );
            }
            @Override
            public void mouseExited( MouseEvent e ) {
                opponentBtn.setBackground( OPPONENT_BG_COLOR );
            }
            @Override
            public void mousePressed( MouseEvent e ) {
                opponentBtn.setBackground( OPPONENT_BG_PRESS );
            }
            @Override
            public void mouseReleased( MouseEvent e ) {
                opponentBtn.setBackground( OPPONENT_BG_HOVER );
            }
        });
    }

} // end class TicTacToeView
