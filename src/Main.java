import services.Services;

public class Main {
    public static void main(String[] args) {
       Services s = new Services();
        System.out.println("Toplam   ev     fiyatları : " + s.homeTotalPrice());
        System.out.println("Toplam  villa   fiyatları : " + s.villaTotalPrice());
        System.out.println("Toplam  yazlık  fiyatları : " + s.summeriesTotalPrice());
        System.out.println("Toplam yapıların fiyatları: " + s.buildingsTotalPrice());
        System.out.println(s.homeAverageSquareMetres());
        System.out.println(s.villaAverageSquareMetres());
        System.out.println(s.summeriesAverageSquareMetres());
        System.out.println(s.totalSquareMetres());
        s.filtration(3,1);
    }
}
