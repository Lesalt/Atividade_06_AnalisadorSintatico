import javax.swing.*;
import org.antlr.v4.runtime.CharStreams;
public class main {
    public static void main(String[] args) {
        String caminho = "";
        JFileChooser fc = new JFileChooser();
        int retorno = fc.showOpenDialog(null);
        if(retorno == JFileChooser.APPROVE_OPTION){
            caminho = fc.getSelectedFile().getAbsolutePath();
            System.out.println(caminho);
        }

        CharStream cs = CharStreams.fromFileName(caminho);
        myCodeComp myCode = new myCodeComp(cs);

        CommonTokenStream tokens = new CommonTokenStream(myCode);
        myCodeParser parser = new myCodeParser(tokens);

        parser.myprogram();
    }
}
