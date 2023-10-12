package classwork1;

public class Test2 {
    public static void main(String[] args) {
        Watch watch = new Watch("20:25");
        System.out.println(watch.getTime());
    }
}

class Watch {
    private String time;
    private String type;
    private String backLight;

    public Watch(String time) {
        this.time = time;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}