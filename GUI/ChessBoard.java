package GUI;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class ChessBoard extends JFrame implements MouseListener, MouseMotionListener
{
    private JLayeredPane layeredPane;
    private JButton[][] chessBoardSquares = new JButton[8][8];
    private JPanel chessBoard;
    private JLabel chessPiece; //R: learn about JLabel. Research Components!!
    private Image[][] chessPieceImages = new Image[2][6];
    private static final String COLS = "ABCDEFGH";
    public static final int QUEEN = 0, KING = 1,
            ROOK = 2, KNIGHT = 3, BISHOP = 4, PAWN = 5;
    public static final int[] STARTING_ROW = {
        ROOK, KNIGHT, BISHOP, KING, QUEEN, BISHOP, KNIGHT, ROOK };
    private int xAdjustment;
    private int yAdjustment;

    public ChessBoard()
    {
        Dimension boardSize = new Dimension(600, 600);

        //  Use a Layered Pane for this this application

        layeredPane = new JLayeredPane();
        layeredPane.setPreferredSize( new Dimension( 700, 700) );
        layeredPane.addMouseListener( this );
        layeredPane.addMouseMotionListener( this );
        getContentPane().add(layeredPane);

        //  Add a chess board to the Layered Pane

        chessBoard = new JPanel();
        chessBoard.setLayout( new GridLayout(8, 8) );
        chessBoard.setPreferredSize( boardSize );
        chessBoard.setBounds(100, 100, boardSize.width, boardSize.height);
        layeredPane.add(chessBoard, JLayeredPane.DEFAULT_LAYER);

        //  Build the Chess Board squares

        // /*
        //  * fill the chess board
        //  */
        // chessBoard.add(new JLabel(""));
        // // fill the top row
        // for (int ii = 0; ii < 8; ii++) {
        //     chessBoard.add(
        //             new JLabel(COLS.substring(ii, ii + 1),
        //             SwingConstants.CENTER));
        // }

        for (int i = 0; i < 8; i++)
        {
            for (int j = 0; j < 8; j++)
            {
                JPanel square = new JPanel( new BorderLayout() );
                square.setBackground( (i + j) % 2 == 0 ? Color.red : Color.white );
                chessBoard.add( square );
            }
        }

        // Add a few pieces to the board

    addPiece(3, 0, "♛");
    addPiece(4, 0, "♚");
    addPiece(3, 7, "♕");
    addPiece(4, 7, "♔");
}

static Font font = new Font("Sans", Font.PLAIN, 72);

private void addPiece(int col, int row, String glyph) {
    JLabel piece = new JLabel(glyph, JLabel.CENTER);
    piece.setFont(font);
    JPanel panel = (JPanel) chessBoard.getComponent(col + row * 8 );
    panel.add(piece);
}

    /*
    **  Add the selected chess piece to the dragging layer so it can be moved
    */
    public void mousePressed(MouseEvent e)
    {
        chessPiece = null;
        Component c =  chessBoard.findComponentAt(e.getX(), e.getY());

        if (c instanceof JPanel) return; //R: possibly change to Piece

        Point parentLocation = c.getParent().getLocation();
        xAdjustment = parentLocation.x - e.getX();
        yAdjustment = parentLocation.y - e.getY();
        chessPiece = (JLabel)c;
        chessPiece.setLocation(e.getX() + xAdjustment, e.getY() + yAdjustment);

        layeredPane.add(chessPiece, JLayeredPane.DRAG_LAYER);
        layeredPane.setCursor(Cursor.getPredefinedCursor(Cursor.MOVE_CURSOR));
    }

    /*
    **  Move the chess piece around
    */
    //R: Make a system to check if the move is good.
    public void mouseDragged(MouseEvent me)
    {
        if (chessPiece == null) return;

        //  The drag location should be within the bounds of the chess board
        // R: layeredPane.getWidth() changed to ( layeredPane.getWidth() - 100 )

        int x = me.getX() + xAdjustment;
        int xMax = ( layeredPane.getWidth() - 100 ) - chessPiece.getWidth(); 
        x = Math.min(x, xMax);
        x = Math.max(x, 0);

        int y = me.getY() + yAdjustment;
        int yMax = ( layeredPane.getHeight() - 100 )  - chessPiece.getHeight();
        y = Math.min(y, yMax);
        y = Math.max(y, 0);

        chessPiece.setLocation(x, y);
     }

    /*
    **  Drop the chess piece back onto the chess board
    */
    public void mouseReleased(MouseEvent e)
    {
        layeredPane.setCursor(null);

        if (chessPiece == null) return;

        //  Make sure the chess piece is no longer painted on the layered pane

        chessPiece.setVisible(false);
        layeredPane.remove(chessPiece);
        chessPiece.setVisible(true);

        //  The drop location should be within the bounds of the chess board

        int xMax = ( layeredPane.getWidth() - 100 )- chessPiece.getWidth();
        int x = Math.min(e.getX(), xMax);
        x = Math.max(x, 0);

        int yMax = ( layeredPane.getHeight() - 100 ) - chessPiece.getHeight();
        int y = Math.min(e.getY(), yMax);
        y = Math.max(y, 0);

        Component c =  chessBoard.findComponentAt(x, y);

        if (c instanceof JLabel)
        {
            Container parent = c.getParent();
            parent.remove(0);
            parent.add( chessPiece );
            parent.validate();
        }
        else
        {
            Container parent = (Container)c;
            parent.add( chessPiece );
            parent.validate();
        }
    }

    public void mouseClicked(MouseEvent e) {}
    public void mouseMoved(MouseEvent e) {}
    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}

    // /**
    //  * Initializes the icons of the initial chess board piece places
    //  */
    // private final void setupNewGame() {
    //     message.setText("Make your move!");
    //     // set up the black pieces
    //     for (int ii = 0; ii < STARTING_ROW.length; ii++) {
    //         chessBoardSquares[ii][0].setIcon(new ImageIcon(
    //                 chessPieceImages[BLACK][STARTING_ROW[ii]]));
    //     }
    //     for (int ii = 0; ii < STARTING_ROW.length; ii++) {
    //         chessBoardSquares[ii][1].setIcon(new ImageIcon(
    //                 chessPieceImages[BLACK][PAWN]));
    //     }
    //     // set up the white pieces
    //     for (int ii = 0; ii < STARTING_ROW.length; ii++) {
    //         chessBoardSquares[ii][6].setIcon(new ImageIcon(
    //                 chessPieceImages[WHITE][PAWN]));
    //     }
    //     for (int ii = 0; ii < STARTING_ROW.length; ii++) {
    //         chessBoardSquares[ii][7].setIcon(new ImageIcon(
    //                 chessPieceImages[WHITE][STARTING_ROW[ii]]));
    //     }
    // }


    public static void main(String[] args)
    {
        JFrame frame = new ChessBoard();
        frame.setDefaultCloseOperation( DISPOSE_ON_CLOSE );
        frame.setResizable( false );
        frame.pack();
        frame.setLocationRelativeTo( null );
        frame.setVisible(true);
     }
}