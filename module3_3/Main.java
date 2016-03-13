package goit.homework.module3_3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        Piano piano = new Piano();
       // piano.quantity = 2;
        piano.setQuantity (2);

        Guitar guitar = new Guitar();
        guitar.setQuantity(20);

        Trumpet trumpet = new Trumpet();
        trumpet.setQuantity(11);

        MusicalShop musicalShop = new MusicalShop();
        List<MusicalInstrument> musicalInstrumets = new ArrayList<>();
        musicalInstrumets.add(piano);
        musicalInstrumets.add(guitar);
        musicalInstrumets.add(trumpet);
        musicalShop.setMusicalInstrument(musicalInstrumets);

        System.out.print(musicalShop.getMusicalInstrument());
       }
}
