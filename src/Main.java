public class Main {
    public static void main(String[] args) {

        Arcossauro a1 = new Tecodontes("Tecodonte", "Triássico", true, true, true, 3);
        Arcossauro a2 = new Pterossauro("Pterossauro", "Jurássico", true, true, false, 5);
        Arcossauro a3 = new Crocodilo("Crocodilo", "Atual", true, true, true, 4);
        Arcossauro a4 = new Saurisquio("T-Rex", "Cretáceo", true, true, true, 12);
        Arcossauro a5 = new Ornitisquio("Tricerátops", "Cretáceo", false, false, true, 9);

        a1.exibirInfo();
        System.out.println("-----");
        a2.exibirInfo();
        System.out.println("-----");
        a3.exibirInfo();
        System.out.println("-----");
        a4.exibirInfo();
        System.out.println("-----");
        a5.exibirInfo();
    }
}