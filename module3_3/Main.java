package goit.homework.module3_3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        Piano piano = new Piano();
        piano.quantity = 2;

        Guitar guitar = new Guitar();
        guitar.quantity = 20;

        Trumpet trumpet = new Trumpet();
        trumpet.quantity = 11;

        MusicalShop musicalShop = new MusicalShop();
        List musicalInstrumets = new ArrayList<>();
        musicalInstrumets.add(piano);
        musicalInstrumets.add(guitar);
        musicalInstrumets.add(trumpet);
        System.out.print("There are " + (trumpet.quantity + piano.quantity + guitar.quantity) + " musical instruments");
    }
}
