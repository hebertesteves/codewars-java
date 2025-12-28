package kyu8;

public class TrafficLights {
    public static String updateLight(String current) {
        return current.equalsIgnoreCase("red") ? "green" : current.equalsIgnoreCase("green") ? "yellow" : "red";
    }
}
