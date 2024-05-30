package buildings;

import java.util.ArrayList;

public class Villa {
    static ArrayList<Villa> villasArray;
    public int suquareMetres;
    public int roomNumber;
    public int livingRoomNumber;
    public int price;
    public Villa(int suquareMetres,int roomNumber, int livingRoomNumber, int price) {
        this.suquareMetres = suquareMetres;
        this.roomNumber = roomNumber;
        this.livingRoomNumber = livingRoomNumber;
        this.price = price;
    }

    static Villa v1 = new Villa(145,3,2,800000);
    static Villa v2 = new Villa(110,3,1,600000);
    static Villa v3 = new Villa(195,5,2,1000000);
    public static ArrayList<Villa> getVillasArray() {
        villasArray = new ArrayList<>();
        villasArray.add(v1);
        villasArray.add(v2);
        villasArray.add(v3);

        return villasArray;
    }
}
