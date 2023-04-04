import java.io.ObjectInputFilter.Status;

public class App { // classe main


    //metodo main
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        // Instânciando um objeto a  classe Banco

        Banco b1 = new Banco();
        b1.Mostrar();

        Banco b2 = new Banco();
        b2.AbrirConta("CP"); // Abrindo conta do tipo CC, portanto meu ganhará bonus de 50 reais
        b2.Mostrar();

    }
}
