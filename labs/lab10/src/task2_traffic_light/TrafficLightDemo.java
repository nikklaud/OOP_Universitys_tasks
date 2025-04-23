package task2_traffic_light;

public class TrafficLightDemo {
    public static void main(String[] args) {
        SimpleTrafficLight light = new SimpleTrafficLight();

        for (int i = 0; i < 6; i++) {
            System.out.println("Current Color: " + light.getCurrentColor());
            light.switchLight();
        }
    }
}