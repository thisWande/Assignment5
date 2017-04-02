package assignment5.adapter;

/**
 * Created by Admin on 2017/04/02.
 */
public class TemperatureObjectReporter implements TemperatureInfo {

    CelciusReporter celciusReporter;

    public TemperatureObjectReporter(CelciusReporter celciusReporter) {
        this.celciusReporter = celciusReporter;
    }

    public TemperatureObjectReporter() {
        celciusReporter = new CelciusReporter();
    }

    @Override
    public double getTemperatureInF() {
        return cToF(celciusReporter.getTemperature());
    }

    @Override
    public void setTemperatureInF(double temperatureInF) {
        celciusReporter.setTemperature(fToC(temperatureInF));
    }

    @Override
    public double getTemperatureInC() {
        return celciusReporter.getTemperature();
    }

    @Override
    public void setTemperatureInC(double temperatureInC) {
        celciusReporter.setTemperature(temperatureInC);
    }

    private double cToF(double temperatureInC) {
        return ((temperatureInC * 9 / 5)+ 32);
    }

    private double fToC(double temperatureInF) {
        return ((temperatureInF - 32) * 5 / 9);
    }
}