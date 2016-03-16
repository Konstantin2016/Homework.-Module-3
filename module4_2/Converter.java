package goit.homework.module4_2;

public class Converter {
    private float temperatureC;
    private float temperatureF;
    private static final int DELTA_CF = 32;

    public float getTemperatureC() {
        return temperatureC;
    }

    public void setTemperatureC(float temperatureC) {
        this.temperatureC = temperatureC;
    }

    public float getTemperatureF() {
        return temperatureF;
    }

    public void setTemperatureF(float temperatureF) {
        this.temperatureF = temperatureF;
    }

    private static final double FACTOR_CF = 1.8;

    public float getTemperatureFtoC (){
        return (float) ((temperatureF - DELTA_CF) / FACTOR_CF);
    }
    public float getTemperatureCtoF () {
        return (float) (temperatureC * FACTOR_CF + DELTA_CF);
    }
   // public void setTemperatureC(float temperatureC) {
    //    this.temperatureC = temperatureC;
   // }
    //public void setTemperatureF(float temperatureF) {
    //    this.temperatureF = temperatureF;
    //}
     Converter (float temperatureC, float temperatureF){
       this.temperatureC = temperatureC;
       this.temperatureF = temperatureF;
    }
}
