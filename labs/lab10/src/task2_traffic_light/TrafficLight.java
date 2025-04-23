package task2_traffic_light;

public abstract class TrafficLight {
    protected TrafficLightState state;

    public void setState(TrafficLightState state) {
        this.state = state;
    }

    public void switchLight() {
        state.switchLight(this);
    }

    public String getCurrentColor() {
        return state.getColor();
    }
}