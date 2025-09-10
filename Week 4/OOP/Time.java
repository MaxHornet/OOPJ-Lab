public class Time {
    int hours, minutes;

    Time(int h, int m) {
        this.hours = h + m / 60;
        this.minutes = m % 60;
    }

    Time add(Time t) {
        return new Time(this.hours + t.hours, this.minutes + t.minutes);
    }

    Time subtract(Time t) {
        int total1 = this.hours * 60 + this.minutes;
        int total2 = t.hours * 60 + t.minutes;
        int diff = Math.abs(total1 - total2);
        return new Time(diff / 60, diff % 60);
    }

    void display() {
        System.out.println(hours + "h " + minutes + "m");
    }

    public static void main(String[] args) {
        Time t1 = new Time(2, 75); // 3h 15m
        Time t2 = new Time(1, 50); // 1h 50m

        System.out.print("t1 = "); t1.display();
        System.out.print("t2 = "); t2.display();

        Time sum = t1.add(t2);
        System.out.print("Sum = "); sum.display();

        Time diff = t1.subtract(t2);
        System.out.print("Difference = "); diff.display();
    }
}
