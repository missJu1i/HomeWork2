package hw2_2;

public class Main {
    public static void main(String[] args) {
        HourlyWageWorker hw = new HourlyWageWorker(15, 8);
        FixedWageWorker fw = new FixedWageWorker(80);

        hw.salary();
        fw.salary();
    }
}
