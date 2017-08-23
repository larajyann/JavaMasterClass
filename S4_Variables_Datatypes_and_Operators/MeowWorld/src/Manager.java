
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import javax.swing.event.CellEditorListener;
import javax.swing.event.ChangeEvent;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;

public class Manager implements ActionListener, TableModelListener, CellEditorListener{

  private JPanel control;
  private JButton logoutButton;
  private JButton listOfPendingOrdersButton;
  private JButton changeDataButton;
  private JButton totalRevenueButton;
  private JButton totalProfitButton;
  private JTextField upcs;
  private JLabel UPC;
  private JLabel DateofToday;
  private JPanel p2;
  private JButton OKButton;
  private Object[][] rowInfo;
  private String[] colnames;


  public void readFile()throws IOException{
    InputStreamReader reader = new InputStreamReader(new FileInputStream(".//ProjectPhase1//src//event.txt"));
    BufferedReader br = new BufferedReader(reader);
    DateofToday.setText(br.readLine());
    String status = "";
    status = br.readLine();
    while(status != null){

    }
  }

  public Manager(){
    Object[][] rowInfo ={
        {"Chicken wings", "012345678912", 3, 12, 10, "Meat", "Chicken", 4, "2017-07-18", "2017-08-01"}
    };
    String[] colnames = {"Name", "UPC", "Amount", "Regular Sell Price",
        "Purchase Price", "Section", "Subsection", "Location", "Sale Start Date", "Sale End Date"};
    JTable DataTable = new JTable(rowInfo, colnames);
    DataTable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
    JScrollPane scrollPane = new JScrollPane(DataTable);
    scrollPane.setSize(300, 50);
    p2.add(scrollPane);
    p2.setVisible(true);

    logoutButton.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(final ActionEvent e) {
        JOptionPane.showMessageDialog(null, "Logout Account Successfully!");
        System.exit(0);
      }
    });

    listOfPendingOrdersButton.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(final ActionEvent e) {

      }
    });
    changeDataButton.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(final ActionEvent e) {

      }
    });
    totalRevenueButton.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(final ActionEvent e) {

      }
    });
    totalProfitButton.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(final ActionEvent e) {

      }
    });

  }


  public static void main(String args[]){
    JFrame frame = new JFrame("Manager Control Panel");
    frame.setContentPane(new Manager().control);
    frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    frame.pack();
    frame.setVisible(true);
  }

  @Override
  public void actionPerformed(final ActionEvent e) {

  }

  @Override
  public void tableChanged(final TableModelEvent e) {

  }

  @Override
  public void editingStopped(final ChangeEvent e) {

  }

  @Override
  public void editingCanceled(final ChangeEvent e) {

  }

  private void createUIComponents() {
    // TODO: place custom component creation code here
  }

//  class Mytable extends AbstractTableModel{
//
//
//    @Override
//    public Object getValueAt(int row, int col){
//      return rowInfo[row][col];
//    }
//
//    @Override
//    public int getRowCount(){
//      return rowInfo.length;
//    }
//
//    @Override
//    public int getColumnCount() {
//      return colnames.length;
//    }
//
//
//    public void setValueAt(Object value, int row, int col){
//      rowInfo[row][col] = value;
//      fireTableCellUpdated(row, col);
//    }
//
//    public Class getColumnClass(int col){
//      return getValueAt(0, col).getClass();
//    }
//
//    public boolean isCellEditable(int col){
//      return col > 2;
//    }
//  }
}
