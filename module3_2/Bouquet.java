package goit.homework.module3_2;

import java.util.List;

public class Bouquet {
    private List<Aster> Aster;
    private List<Chamomile> Chamomile;
    private List<Rose> Rose;
    private List<Tulip> Tulip;

    public List<goit.homework.module3_2.Aster> getAster() {
        return Aster;
    }

    public void setAster(List<goit.homework.module3_2.Aster> aster) {
        Aster = aster;
    }

    public List<goit.homework.module3_2.Chamomile> getChamomile() {
        return Chamomile;
    }

    public void setChamomile(List<goit.homework.module3_2.Chamomile> chamomile) {
        Chamomile = chamomile;
    }

    public List<goit.homework.module3_2.Rose> getRose() {
        return Rose;
    }

    public void setRose(List<goit.homework.module3_2.Rose> rose) {
        Rose = rose;
    }

    public List<goit.homework.module3_2.Tulip> getTulip() {
        return Tulip;
    }

    public void setTulip(List<goit.homework.module3_2.Tulip> tulip) {
        Tulip = tulip;
    }
}
