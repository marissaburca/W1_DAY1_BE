public class Main3 {
    public static void main(String[] args) {

        //lati rettangolo
        Double side1 = 1.3;
        Double side2 = 4.8;
        //dato per operatore modulo
        int numb1 = 11;
        //lati triangolo
        Double side3 = 5.2;
        Double side4 = 6.8;
        Double side5 = 3.6;


        //perimetro rettangolo
        Double perimeter = (side1 + side2) * 2;
        //uso operatore modulo per verificare se il numero sia pari o dispari
        int rest = numb1 % 2;
        int result = (rest == 0) ? 0 : 1;
        //area triangolo
        Double semiPerimeter = (side3 + side4 + side5) / 2;
        Double surfaceTriangle = Math.sqrt(semiPerimeter *
                (semiPerimeter - side3) *
                (semiPerimeter - side4) *
                (semiPerimeter - side5));

        //vari print in console
        System.out.println("The perimeter of the rectangle is equal to: " + perimeter);
        System.out.println(result);
        System.out.println("The surface of the triangle is equal to: " + surfaceTriangle);
    }
}
