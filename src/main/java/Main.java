
public class Main {

    public static void main(String[] args) {

        Main main = new Main();

        MultiplicaLambda ml1 = (x, y) -> x * y;

        System.out.println("7 * X = "+main.metodoSiete(ml1, 5));

    }

    public int metodoSiete(MultiplicaLambda multiplica, int cinco){
        return multiplica.multi(7, cinco);
    }

    interface MultiplicaLambda{
        int multi(int cinco, int siete);
    }

}

