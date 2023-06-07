package gitcorr_numero2;

public class Pedido {
    private String nomeCliente;
    private String tipoItem;
    private float taxa;

    public Pedido(String nomeCliente, String tipoItem, float taxa) {
        this.nomeCliente = nomeCliente;
        this.tipoItem = tipoItem;
        this.taxa = taxa;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getTipoItem() {
        return tipoItem;
    }

    public void setTipoItem(String tipoItem) {
        this.tipoItem = tipoItem;
    }

    public float getTaxa() {
        return taxa;
    }

    public void setTaxa(float taxa) {
        this.taxa = taxa;
    }

    @Override
    public String toString() {
        return "Pedido{" + "nomeCliente=" + nomeCliente + ", tipoItem=" + tipoItem + ", taxa=" + taxa + '}';
    }
}
