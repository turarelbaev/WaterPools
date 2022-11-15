public class Main {
    public static void main(String[] args) {
        int landscape[] = {5, 2, 3, 4, 5, 4, 0, 3, 1};
        System.out.println(calculateWaterAmount(landscape));
    }

    public static int calculateWaterAmount(int[] landscape) {
        int leftMax = 0, rightMax = 0, res = 0;
        int i = 0, j = landscape.length - 1;

        while (i < j) {
            if (landscape[i] < landscape[j]) {
                if (leftMax < landscape[i]) {
                    leftMax = landscape[i];
                }
                res = res + leftMax - landscape[i];
                i++;
            } else {
                if (rightMax < landscape[j]) {
                    rightMax = landscape[j];
                }
                res = res + rightMax - landscape[j];
                j--;
            }
        }
        return res;
    }
}
