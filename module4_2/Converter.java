package goit.homework.module4_2;

public class Converter {
    private float temperatureC;
    private float temperatureF;
    final int deltaCF = 32;

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

    final double factorCF = 1.8;

    public float getTemperatureFtoC (){
        return (float) ((temperatureF - deltaCF) / factorCF);
    }
    public float getTemperatureCtoF () {
        return (float) (temperatureC * factorCF + deltaCF);
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
