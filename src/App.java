import java.io.ObjectInputFilter.Status;

public class App { // classe main


    //metodo main
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        // Instânciando um objeto a  classe Banco

        Banco conta1 = new Banco();
        conta1.SetNumConta(322467);
        // conta1.SetTipoConta("CP");
        conta1.SetDono("Leandro Moura");
        conta1.AbrirConta("CC");
        conta1.Depositar(100);
        conta1.Sacar(25);
        conta1.estadoAtual();

        
        Banco conta2 = new Banco();
        conta2.SetNumConta(562342);
        conta2.SetDono("Leandrinho developer");
        conta2.AbrirConta("CP");
        conta2.Depositar(325);
        conta2.Sacar(475);
        conta2.FecharConta();
        conta2.estadoAtual();

    }
}
