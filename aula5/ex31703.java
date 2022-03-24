import javax.swing.JOptionPane;
public class ex31703{
    public static void main(String[] args){
        double fat, n;
        n = Double.parseDouble(JOptionPane.showInputDialog("Digite o numero que deseja fazer o fatorial: "));
        for(fat = 1; n > 1; n = n - 1){
            fat = fat * n;
        }
        JOptionPane.showMessageDialog(null, fat);
    }
}