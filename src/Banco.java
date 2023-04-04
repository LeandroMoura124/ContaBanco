public class Banco { // classe banco - para depois instanciarmos na classe main
    // atributos
    public int NumConta;
    private String tipoConta;
    public String Dono;
    private Float SaldoConta;
    private boolean Status;

    public Banco(){ // Método construtos da minah classe, ou seja, aqui defino quais valores irão entrar quando eu criar um novo objeto
        this.GetStatus();
        this.tipoConta = "CC";

    }

    public void SetNumConta(int n){
        this.NumConta = n;
    }
    public int GetNumConta(){
        return NumConta;
    }

    public void SetTipoConta(String t){
        this.tipoConta = t;
    }
    public String GetTipoConta(){
        return tipoConta;
    }

    public void SetDonoConta(String d){
        this.Dono = d;
    }
    public String GetDonoConta(){
        return Dono;
    }

    public void SetSaldoConta(float s){
        this.SaldoConta = s;
    }
    public Float GetSaldoConta(){
        return SaldoConta;
    }

    public void SetStatus(boolean s){
        this.Status = false;
    }
    public boolean GetStatus(){
        return Status;
    }
   

    //métodos
    public void AbrirConta(String t){
        SetTipoConta(t);
        SetStatus(true);
        if (t == "CC"){
            SaldoConta = 50f;
        }
        else if (t == "CP"){
            SaldoConta = 150f;
        }
    }
    public void Mostrar(){
        System.out.print("A conta foi aberta!!! " +  GetStatus()+  "\n");
        System.out.print("A conta será aberta como: " + GetTipoConta() + "\n" );
        System.out.println("Parabéns, você criou a sua conta " + GetTipoConta() + ". Por tanto, você ganhou um bônus dê:    R$ " + SaldoConta );
    }


    
}
