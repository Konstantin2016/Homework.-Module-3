package goit.homework.module3_2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        Rose rose = new Rose();
        rose.setQuantityFlowers(5);

        Tulip tulip = new Tulip();
        tulip.setQuantityFlowers(4);

        Aster aster = new Aster();
        aster.setQuantityFlowers(4);

        Chamomile chamomile = new Chamomile();
        chamomile.setQuantityFlowers(4);

        List<Flower> flowersBouquet=new ArrayList(){

        };
        flowersBouquet.add(rose);
        flowersBouquet.add(tulip);
        flowersBouquet.add(aster);
        flowersBouquet.add(chamomile);

        Bouquet bouquet = new Bouquet();
        bouquet.setFlowers(flowersBouquet);

        System.out.print(bouquet.getFlowers());

    }
}
