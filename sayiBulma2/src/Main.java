public class Main {
    public static void main(String[] args) {

        int[] sayilar = new int[]{1,2,5,7,9,0};
        int aranacak = 4;
        boolean varMi=false;

        for (int sayi : sayilar){
            if (sayi == aranacak){
                //System.out.println("Sayı dizide mevcut");
                varMi = true;
                break;

            }

        }
        if (varMi){
            System.out.println("Sayı dizide mevcut");
        }else {
            System.out.println("Sayı dizide mevcut değil");
        }
    }
}