import java.lang.Math;
import java.util.Collection;

class PointGrey extends Point {

    protected int greyscale; // [0, 255] from black to white


    // TODO: add a constructor for PointGrey

    public PointGrey(int px, int py, int greyscalescale)
    {
        this.greyscale = greyscalescale;
        this.px = px;
        this.py = py;

    }

    PointGrey() {
    }


    @Override
    public double getDistance(Point p) {
        // TODO: fill this function up

        int distance;

        distance =(int)( Math.sqrt((p.px-px)*(p.px-px)+(p.py -py)*(p.py-py)));

        return distance; // to be replaced
    }

    @Override
    public int grayscaleDiff(Point p) {
        // TODO: fill this function up
        int diff;
        diff = Math.abs(this.greyscale-p.greyscale);

        return diff; // to be replaced
    }

}
