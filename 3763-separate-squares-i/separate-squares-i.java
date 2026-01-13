class Solution {
    public double separateSquares(int[][] squares) { // Method name updated
        double low = Integer.MAX_VALUE, high = Integer.MIN_VALUE;

        
        // Find the range of y-values
        for (int[] square : squares) {
            int y = square[1], l = square[2];
            low = Math.min(low, y);
            high = Math.max(high, y + l);
        }

        // Binary search for minimum y-coordinate
        while (high - low > 1e-5) {
            double mid = (low + high) / 2.0;
            if (calculateAreaAbove(squares, mid) > calculateAreaBelow(squares, mid)) {
                low = mid;
            } else {
                high = mid;
            }
        }
        return low;
    }

    // Calculate total area above the given y
    private double calculateAreaAbove(int[][] squares, double y) {
        double area = 0;
        for (int[] square : squares) {
            int y1 = square[1], l = square[2];
            int y2 = y1 + l; // top of square
            if (y2 > y) {
                area += (y2 - Math.max(y1, y)) * l;
            }
        }
        return area;
    }

    // Calculate total area below the given y
    private double calculateAreaBelow(int[][] squares, double y) {
        double area = 0;
        for (int[] square : squares) {
            int y1 = square[1], l = square[2];
            if (y1 < y) {
                area += (Math.min(y, y1 + l) - y1) * l;
            }
        }
        return area;
    }
}
