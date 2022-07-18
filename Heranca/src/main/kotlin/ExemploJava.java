public class ExemploJava {

    static int valor = 0;
    int value = 0;

    public ExemploJava(){
        valor++;
        value++;
        this.value += 2;
    }


    public static void main(String[] args) {
        new ExemploJava();
        new ExemploJava();
        new ExemploJava();
        new ExemploJava();


        ExemploJava ex = new ExemploJava();
        System.out.println(ex.value);
        System.out.println(ExemploJava.valor);
    }
}
