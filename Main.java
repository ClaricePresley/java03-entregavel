public class Main {

    public static void main(String[] args) {

        Elevador elevador = new Elevador(0, 500);

        System.out.println("=== CENÁRIO 1: SUBIDA BEM-SUCEDIDA ===");

        elevador.adicionarPeso(300);
        System.out.println("Peso atual: " + elevador.getPesoAtual() + " kg.");
        elevador.subir();

        System.out.println();

        System.out.println("=== CENÁRIO 2: SUBIDA BLOQUEADA ===");

        elevador.adicionarPeso(300);
        System.out.println("Peso atual: " + elevador.getPesoAtual() + " kg.");
        elevador.subir();
    }
}
