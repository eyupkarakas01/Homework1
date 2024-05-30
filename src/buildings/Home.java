package buildings;

import java.util.ArrayList;

public class Home {
   static ArrayList<Home> homeArray;
    public int suquareMetres;
    public int roomNumber;
    public int livingRoomNumber;
    public int price;
    public Home(int suquareMetres, int roomNumber, int livingRoomNumber, int price) {
        this.suquareMetres = suquareMetres;
        this.roomNumber = roomNumber;
        this.livingRoomNumber = livingRoomNumber;
        this.price = price;
    }
    static Home h1 = new Home(125,2,1,300000);
    static Home h2 = new Home(65,1,1,100000);
    static Home h3 = new Home(165,3,1,500000);
    public static ArrayList<Home> getHomeArray() {
        homeArray = new ArrayList<>();
        homeArray.add(h1);
        homeArray.add(h2);
        homeArray.add(h3);

        return homeArray;
    }
}
