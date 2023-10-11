package code.jjogging.track.record;

public class ERecord {

    record Rec(int val) {
        Rec {
            if (val < 0) {
                val *= -1;
            }

            System.out.println(val);
            System.out.println(this.val());
        }
    }

    public static void main(String[] args) {
        var r = new Rec(-5);
        System.out.println(r.val);
    }
}
