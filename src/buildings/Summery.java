package buildings;

import java.util.ArrayList;

public class Summery {
    static ArrayList<Summery> summeriesArray;
    public int suquareMetres;
    public int roomNumber;
    public int livingRoomNumber;
    public int price;


    public Summery(int suquareMetres,int roomNumber, int livingRoomNumber, int price) {
        this.suquareMetres = suquareMetres;
        this.roomNumber = roomNumber;
        this.livingRoomNumber = livingRoomNumber;
        this.price = price;
    }


    static Summery v1 = new Summery(60,1,1,10000);
    static Summery v2 = new Summery(110,2,1,60000);
    static Summery v3 = new Summery(135,3,1,100000);


    public static ArrayList<Summery> getSummeriesArray() {
        summeriesArray = new ArrayList<>();
        summeriesArray.add(v1);
        summeriesArray.add(v2);
        summeriesArray.add(v3);

        return summeriesArray;
    }

}
