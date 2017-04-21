
public class Main {

    public static void main(String[] args) {

        System.out.println("7 * X = "+metodoSiete((x, y) -> x * y, 5));

    }

    public static int metodoSiete(MultiplicaLambda multiplica, int cinco){
        return multiplica.multi(7, cinco);
    }

    interface MultiplicaLambda{
        int multi(int cinco, int siete);
    }

}

