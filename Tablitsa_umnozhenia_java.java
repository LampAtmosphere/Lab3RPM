public class Tablitsa_umnozhenia_java {
    public static void main(String[] args) {
        System.out.println("Таблица умножения");    

        for (int i = 1; i <= 10; i++) {
            System.out.println("");
            for (int j = 1; j <= 10; j++) {
                System.out.print(i * j + "\t");
            }
        }
    }
}
