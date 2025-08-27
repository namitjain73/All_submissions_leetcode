// Last updated: 8/28/2025, 2:46:36 AM
class Solution {
    public double[] convertTemperature(double c) {
        double[] arr = new double[2];
        double a = c + 273.15;
        arr[0] = a;
        a = c * 1.80 + 32.00;
        arr[1] = a;
        return arr;
    }
}