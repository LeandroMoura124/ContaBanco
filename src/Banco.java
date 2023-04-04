public class Banco { // classe banco - para depois instanciarmos na classe main
    // Atributos
    public int numConta;
    protected String tipoConta;
    private String dono;
    private Float saldoConta;
    private boolean status;



    //Métodos
    public void AbrirConta(String t){
        this.SetStatus(true);
        this.SetTipoConta(t);

        if (t == "CC"){
            this.SetSaldoConta(50f);
        }
        else if (t == "CP"){
            this.SetSaldoConta(150f);
        }
        System.out.println("Conta aberta com sucesso!!!");
        
    }
    public void FecharConta(){
        if (this.GetSaldoConta() > 0 ){
            System.out.println("Há saldo na conta, não será possível fechar!");
        }
        else if (this.GetSaldoConta() < 0 ){
            System.out.println("A conta nâo pode ser fechada! Você está em débitos ");
        }
        else{
            this.SetStatus(false);
            System.out.print("Conta fechada com sucesso!");
        }

    }
    public void Depositar(float v){
        if(GetStatus() == true){
            // this.saldoConta = this.saldoConta + v;        Essa forma trabalha diretamente com os atributos
            this.SetSaldoConta(this.GetSaldoConta() + v);     // Já essa trabalha com os métodos especiais(get e set)
            System.out.print("Depósito realizado com sucesso! \n");

        }
        else{
            System.out.print("Impossível depositar! A conta não consta ativa no sistema!");
        }

    }
    public void Sacar(float v){
            if (this.GetStatus()){
                if (this.GetSaldoConta() >= v){
                    this.SetSaldoConta(this.GetSaldoConta() - v);
                    System.out.println("Saque realizado com sucesso na conta de " + this.GetDono() + "\n");
                }
                else{
                    System.out.println("Saldo insuficiente! Não foi possível realizar o saque");
                }
            }
            else{
                System.out.print("A conta não está ativa! Não é possível realizar o saque!");
            }
        }
    
    public void PagarMensal(){
        int v = 0;
        if (GetTipoConta() == "CC"){
            v = 12; 
        }
        else if (GetTipoConta() == "CP"){
            v = 20;
        }
        if (GetStatus() == true){
            if (GetSaldoConta() > v){
                this.SetSaldoConta(this.GetSaldoConta() - v);
                System.out.print("Mensalidade paga com sucesso por " + this.GetDono());
            }
            else{
                System.out.print("Saldo insuficiente!");
            }
        }
        else{
            System.out.print("Impossível cobrar uma conta inativa!");
        }

    }

    //Método Construtor
    public Banco(){
        this.SetSaldoConta(0);
        this.SetStatus(false);
        

    }
    //Get e Sett
    public void SetNumConta(int n){
        this.numConta = n;
    }
    public int GetNumConta(){
        return this.numConta;
    }

    public void SetTipoConta(String t){
        this.tipoConta = t;
    }
    public String GetTipoConta(){
        return this.tipoConta;
    }

    public void SetDono(String d){
        this.dono = d;
    }
    public String GetDono(){
        return this.dono;
    }

    public void SetSaldoConta(float s){
        this.saldoConta = s;
    }
    public float GetSaldoConta(){
        return this.saldoConta;
    }
    public void SetStatus(boolean s){
        this.status = s;
    }
    public boolean GetStatus(){
        return this.status;
    }



    // método do estado atual da minha classe BANCO

    public void estadoAtual(){
        System.out.println("\n ------------------------------------------");
        System.out.println("Conta: " + this.GetNumConta());
        System.out.println("Tipo da conta: " + this.GetTipoConta());
        System.out.println("Dono: " + this.GetDono());
        System.out.println("Saldo atual: R$" + this.GetSaldoConta() );
        System.out.println("Status: " + this.GetStatus());
    }

  
}
