package gitcorr_numero2;

public class Pizzas {
    private float peso;
    private float preco;
    private int dataValidade;
    private String recheio, molho;

    public Pizzas(float peso, String recheio, String molho, float preco) {
        this.peso = peso;
        this.preco = 300 * peso / 100;
        this.dataValidade = 7;
        this.recheio = recheio;
        this.molho = molho;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public int getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(int dataValidade) {
        this.dataValidade = dataValidade;
    }

    public String getRecheio() {
        return recheio;
    }

    public void setRecheio(String recheio) {
        this.recheio = recheio;
    }

    public String getMolho() {
        return molho;
    }

    public void setMolho(String molho) {
        this.molho = molho;
    }

    @Override
    public String toString() {
        return "Pizza{" + "peso=" + peso + ", preco=" + preco + ", dataValidade=" + dataValidade + ", recheio=" + recheio + ", molho=" + molho + '}';
    }
    
    
}
