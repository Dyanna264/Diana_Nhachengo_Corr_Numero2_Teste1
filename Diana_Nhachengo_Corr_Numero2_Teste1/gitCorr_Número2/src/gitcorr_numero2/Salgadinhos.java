package gitcorr_numero2;

public class Salgadinhos {
    private float peso;
    private float preco;
    private int dataValidade;
    private String recheio, massa, tipo;

    public Salgadinhos(float peso, String recheio, String massa, String tipo, float preco) {
        this.peso = peso;
        this.preco = preco;
        this.dataValidade = 7;
        this.recheio = recheio;
        this.massa = massa;
        this.tipo = tipo;
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

    public String getMassa() {
        return massa;
    }

    public void setMassa(String massa) {
        this.massa = massa;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Salgadinho{" + "peso=" + peso + ", preco=" + preco + ", dataValidade=" + dataValidade + ", recheio=" + recheio + ", massa=" + massa + ", tipo=" + tipo + '}';
    }
    
    
}
