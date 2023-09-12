package code.jjogging.track.record;

public class ERecord {

    record Rec(int val) {
        Rec {
            if (val < 0) {
                val *= -1;
            }
        }
    }

    public static void main(String[] args) {
        var r = new Rec(-5);
        System.out.println(r.val);
    }
}
