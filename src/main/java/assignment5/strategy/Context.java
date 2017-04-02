package assignment5.strategy;

/**
 * Created by Admin on 2017/04/02.
 */
public class Context {
    int temperatureInF;
    Strategy strategy;

    public Context(int temperatureInF, Strategy strategy) {
        this.temperatureInF = temperatureInF;
        this.strategy = strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public int getTemperatureInF() {
        return temperatureInF;
    }

    public boolean getResult(){
        return strategy.checkTemperature(temperatureInF);
    }
}

