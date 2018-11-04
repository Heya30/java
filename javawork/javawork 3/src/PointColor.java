class PointColor extends PointGrey{

    public PointColor(int px, int py, int redScale,int blueScale, int greeScale){


        super.greyscale = redScale + blueScale + greeScale;
        super.px = px;
        super.py = py;

    }


}
