package task2_traffic_light;

public class YellowState implements TrafficLightState {
    public void switchLight(TrafficLight trafficLight) {
        trafficLight.setState(new RedState());
    }

    public String getColor() {
        return "YELLOW";
    }
}