package goit.homework.module3_2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        Rose rose = new Rose();
        rose.quantityFlowers = 5;

        Tulip tulip = new Tulip();
        tulip.quantityFlowers = 4;

        Aster aster = new Aster();
        aster.quantityFlowers = 4;

        Chamomile chamomile = new Chamomile();
        chamomile.quantityFlowers = 4;

        List<Flower> flowersBouquet=new ArrayList<>();
        flowersBouquet.add(rose);
        flowersBouquet.add(tulip);
        flowersBouquet.add(aster);
        flowersBouquet.add(chamomile);
        System.out.println ("Bouquet consists of " + (tulip.quantityFlowers + rose.quantityFlowers + aster.quantityFlowers + chamomile.quantityFlowers) + " flowers");
    }
}
