public class Main {
    public static void main(String[] args) {

        String harf="İ";

        String[] kalinSesli = {"A","I","O","U"};
        String[] inceSesli = {"E","İ","Ö","Ü"};

        for (int i=0; i<=4; i++){
            if ( harf == kalinSesli[i]){
                System.out.println("Harf kalın seslidir.");
                return;

            }else if (harf == inceSesli[i]){
                System.out.println("Harf ince seslidir.");
                return;
            }
        }
    }

        /*char harf='E';

        switch (harf){
            case 'A':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("Kalın sesli harf");
            default:
                System.out.println("İnce sesli harf");
        }
    }*/
}