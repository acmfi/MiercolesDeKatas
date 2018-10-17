public class Dinglemouse {

    public static double stackHeight2d(int layers) {
        if (layers <= 1) return layers;
        return 1 + (0.86602 * (layers-1)) ;
    }
}
