import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class App extends JFrame {
    private String[] item= {
            "Junior",
            "Head"
    };
    private JLabel nameLabel;
    private JLabel ageLabel;
    private JLabel positionLabel;
    private JButton showButton;
    private JButton exitButton;
    private JTextField nameText;
    private JTextField ageText;
    private JComboBox<String> positionText;
    JPanel[] pnl = new JPanel[21];


    public App() {
        super("Employee");
        setLayout(new GridLayout(7, 3));
        for (int i = 0; i < 21; i++) {
            pnl[i] = new JPanel();
            add(pnl[i]);
        }
        //Подготавливаем компоненты объекта
        nameLabel = new JLabel("Name");
        ageLabel = new JLabel("Age");
        positionLabel = new JLabel("Position");
        nameText = new JTextField("", 5);
        ageText = new JTextField("", 5);
        positionText = new JComboBox<String>(item);


        showButton = new JButton("Show");
        exitButton = new JButton("Exit");

        //Подготавливаем временные компоненты
        pnl[1].setLayout(new FlowLayout(FlowLayout.CENTER)); //имя
        pnl[4].setLayout(new FlowLayout(FlowLayout.CENTER)); // поле для имени
        pnl[7].setLayout(new FlowLayout(FlowLayout.CENTER));
        pnl[10].setLayout(new FlowLayout(FlowLayout.CENTER));
        pnl[13].setLayout(new FlowLayout((FlowLayout.CENTER)));
        pnl[16].setLayout(new FlowLayout((FlowLayout.CENTER)));
        //pnl[14].setLayout(new FlowLayout(FlowLayout.TRAILING));
        pnl[18].setLayout(new FlowLayout(FlowLayout.CENTER));
        pnl[20].setLayout(new FlowLayout(FlowLayout.CENTER));

        pnl[1].add(nameLabel); //О размещении компонент поговорим позже
        pnl[4].add(nameText);

        pnl[7].add(ageLabel);
        pnl[10].add(ageText);

        pnl[13].add(positionLabel);
        pnl[16].add(positionText);

        pnl[18].add(showButton);
        pnl[20].add(exitButton);

        //add(pnl[], BorderLayout.CENTER);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        showButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Employee emp = new Employee();
                JFrame jFrame = new JFrame();
                JOptionPane.showMessageDialog(jFrame, nameText.getText() + " is " +
                        ageText.getText() + " years old. " + nameText.getText() + " is " + positionText.getSelectedItem());
                emp.setName(nameText.getText());
                emp.setAge(ageText.getText());
                emp.setPosition(positionText.getSelectedItem());
            }
        });
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(1);
            }
        });
    }



    public static void main(String[] args) {
        App app = new App();
        app.setVisible(true);
        //app.setSize(900, 450);
        app.pack(); //Эта команда подбирает оптимальный размер в зависимости от содержимого окна
    }
}