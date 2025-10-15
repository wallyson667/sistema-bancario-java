package MeuBanco;

public class Conta {

    private final Integer valor;

    //Construtor feito para receber um valor dentro do codigo de teste
    public Conta(Integer valor){
        this.valor = valor;
    }

    public int getValor(){
        return valor;
    }

    //metodo, para testar herança
    public void visualizar(){
    }
}
