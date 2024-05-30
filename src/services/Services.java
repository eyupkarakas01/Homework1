package services;

import buildings.Home;
import buildings.Summery;
import buildings.Villa;

public class Services {
        public int homeTotalPrice(){
            int result=0;
            for(int i=0;i<Home.getHomeArray().toArray().length;i++){
               result+=Home.getHomeArray().get(i).price;
            }
            return result;
        }
    public int villaTotalPrice(){
        int result=0;
        for(int i=0;i<Villa.getVillasArray().toArray().length;i++){
            result+=Villa.getVillasArray().get(i).price;
        }
        return result;
    }
    public int summeriesTotalPrice(){
        int result=0;
        for(int i=0;i<Summery.getSummeriesArray().toArray().length;i++){
            result+=Summery.getSummeriesArray().get(i).price;
        }
        return result;
    }

    public int buildingsTotalPrice(){
            int result=0;
            result=summeriesTotalPrice()+villaTotalPrice()+homeTotalPrice();
            return result;
    }
    public double homeAverageSquareMetres(){
            double  result =0.0;
            for(int i=0;i<Home.getHomeArray().toArray().length;i++){
                result+=Home.getHomeArray().get(i).suquareMetres;
            }
            result/=Home.getHomeArray().toArray().length;
            return  result;
    }
    public double villaAverageSquareMetres(){
        double  result =0.0;
        for(int i=0;i<Villa.getVillasArray().toArray().length;i++){
            result+=Villa.getVillasArray().get(i).suquareMetres;
        }
        result/=Villa.getVillasArray().toArray().length;
        return  result;
    }

    public double summeriesAverageSquareMetres() {
            double  result =0.0;
            for(int i=0;i<Summery.getSummeriesArray().toArray().length;i++){
                result+=Summery.getSummeriesArray().get(i).suquareMetres;

            }
            result/=Summery.getSummeriesArray().toArray().length;
            return  result;
    }
    public double totalSquareMetres(){
            double  result =0.0;
            result=summeriesAverageSquareMetres()+villaAverageSquareMetres()+homeAverageSquareMetres();
            return result;
    }

    public void filtration(int roomNumber,int livingRoomNumber){
            int homeNumber=0;
       for(int i=0;i<Home.getHomeArray().toArray().length;i++){
           if(Home.getHomeArray().get(i).roomNumber == roomNumber && Home.getHomeArray().get(i).livingRoomNumber == livingRoomNumber){
               homeNumber++;
           }
       }
       int villasNumber=0;
       for(int i=0;i<Villa.getVillasArray().toArray().length;i++){
           if(Villa.getVillasArray().get(i).roomNumber == roomNumber && Villa.getVillasArray().get(i).livingRoomNumber == livingRoomNumber){
               villasNumber++;
           }
       }
       int summeriesNumber=0;
       for(int i=0;i<Summery.getSummeriesArray().toArray().length;i++){
           if(Summery.getSummeriesArray().get(i).roomNumber == roomNumber && Summery.getSummeriesArray().get(i).livingRoomNumber == livingRoomNumber){
               summeriesNumber++;
           }
       }
        System.out.println("Aradığınız kriterlere uygun  ev  sayısı   :"+homeNumber);
        System.out.println("Aradığınız kriterlere uygun villa sayısı  :"+villasNumber);
        System.out.println("Aradığınız kriterlere uygun yazlık sayısı :"+summeriesNumber);
    }

}
