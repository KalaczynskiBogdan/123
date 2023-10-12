package lesson4;

public class Test {
    public static void main(String[] args) {
        MonitoringSystem general = () -> {

        };
        MonitoringSystem error = new MonitoringSystem() {
            @Override
            public void startMonitoring() {

            }
        };
        MonitoringSystem security = new MonitoringSystem() {
            @Override
            public void startMonitoring() {

            }
        };
        general.startMonitoring();
        error.startMonitoring();
        security.startMonitoring();

    }
}
