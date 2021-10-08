import java.util.Scanner;


class Calculador {

    private int a;
    private int b;


    public void setA(int a){
        this.a = a;

    }


    public void setB(int b){
        this.b = b;

    }


    public int getMult(){
        return a * b ;

    }


}


class Main {

    public static void main(String[] args) {
        Calculador calc;
        Scanner in;

        int PROD;

        calc = new Calculador();
        in = new Scanner(System.in);
        calc.setA( in.nextInt() );
        calc.setB( in.nextInt() );
        in.close();
        PROD = calc.getMult();
        System.out.println("PROD = " + PROD);

    }

}

