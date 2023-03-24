public class nestedLoop {
    public static void main(String[] args){
        for (int k = 0; k<= 2; k++){
            System.out.println("Outer: "+ k);

            for (int j = 0; j <= 3; j++){
                System.out.println("Inner: "+ j);
            }
        }
    }
}
