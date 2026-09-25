public class Elevador {

    private int andarAtual;
    private double pesoMaximo;
    private double pesoAtual;

    public Elevador(int andarAtual, double pesoMaximo) {
        this.andarAtual = andarAtual;
        this.pesoMaximo = pesoMaximo;
        this.pesoAtual = 0;
    }

    public int getAndarAtual() {
        return andarAtual;
    }

    public double getPesoMaximo() {
        return pesoMaximo;
    }

    public double getPesoAtual() {
        return pesoAtual;
    }

    public void adicionarPeso(double peso) {
        if (peso > 0) {
            pesoAtual += peso;
            System.out.println("Peso adicionado: " + peso + " kg.");
        }
    }

    public void removerPeso(double peso) {
        if (peso > 0 && peso <= pesoAtual) {
            pesoAtual -= peso;
            System.out.println("Peso removido: " + peso + " kg.");
        }
    }

    public void subir() {
        if (pesoAtual > pesoMaximo) {
            System.out.println(
                "O elevador não vai sair do andar " + andarAtual +
                " por excesso de peso."
            );
        } else {
            andarAtual++;
            System.out.println("O elevador subiu e parou no andar " + andarAtual + ".");
        }
    }
}
