package lesson4;

public interface MonitoringSystem {
    void startMonitoring();
}
class GeneralMonitoring implements MonitoringSystem{

    @Override
    public void startMonitoring() {
        System.out.println("general system is monitoring");
    }
}
class ErrorMonitoring implements MonitoringSystem{

    @Override
    public void startMonitoring() {
        System.out.println("error monitoring");
    }
}
class SecurityMonitoring implements MonitoringSystem{

    @Override
    public void startMonitoring() {
        System.out.println("security monitoring");
    }
}
