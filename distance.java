public class distance {
    public static void main(String[] args) {
        int x1 = 3, x2 = 4, y1 = 4, y2 = 2;
        double dis;
        dis = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        System.out.println("distance between two points : " + dis);
    }
}
