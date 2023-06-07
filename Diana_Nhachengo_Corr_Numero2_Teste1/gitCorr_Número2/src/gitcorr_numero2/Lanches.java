package gitcorr_numero2;

public class Lanches {
    private float peso;
    private float preco;
    private int dataValidade;
    private String recheio, molho, tipoPao;

    public Lanches(float peso, String recheio, String molho, String tipoPao, float preco) {
        this.peso = peso;
        this.preco = preco;
        this.dataValidade = 7;
        this.recheio = recheio;
        this.molho = molho;
        this.tipoPao = tipoPao;
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

    public String getTipoPao() {
        return tipoPao;
    }

    public void setTipoPao(String tipoPao) {
        this.tipoPao = tipoPao;
    }

    @Override
    public String toString() {
        return "Lanche{" + "peso=" + peso + ", preco=" + preco + ", dataValidade=" + dataValidade + ", recheio=" + recheio + ", molho=" + molho + ", tipoPao=" + tipoPao + '}';
    }
    
    
}
