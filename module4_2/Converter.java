package goit.homework.module4_2;

public class Converter {
    public float temperatureC;
    public float temperatureF;

    public double getTemperatureFtoC (){
        return (float) ((temperatureF - 32) / 1.8);
    }
    public double getTemperatureCtoF () {
        return (float) (temperatureC * 1.8 + 32);
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
