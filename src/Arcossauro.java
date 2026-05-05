public class Arcossauro {
    String nome;
    String periodo;
    boolean carnivoro;
    boolean predador;
    boolean terrestre;
    double tamanho;

    public Arcossauro(String nome, String periodo, boolean carnivoro, boolean predador, boolean terrestre, double tamanho) {
        this.nome = nome;
        this.periodo = periodo;
        this.carnivoro = carnivoro;
        this.predador = predador;
        this.terrestre = terrestre;
        this.tamanho = tamanho;
    }

    public void exibirInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("Período: " + periodo);
        System.out.println("Carnívoro: " + carnivoro);
        System.out.println("Predador: " + predador);
        System.out.println("Terrestre: " + terrestre);
        System.out.println("Tamanho: " + tamanho + "m");
    }
}