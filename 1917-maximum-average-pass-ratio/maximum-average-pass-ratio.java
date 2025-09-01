
class Solution {
    public double maxAverageRatio(int[][] classes, int extraStudents) {
        // Priority queue to store classes by their potential improvement
        // We want the class with maximum improvement potential at the top
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> {
            double improvementA = improvement(a[0], a[1]);
            double improvementB = improvement(b[0], b[1]);
            return Double.compare(improvementB, improvementA); // Max heap
        });
        
        // Add all classes to priority queue
        for(int[] cls : classes) {
            pq.offer(cls);
        }
        
        // Distribute extra students greedily
        for(int i = 0; i < extraStudents; i++) {
            int[] bestClass = pq.poll();
            bestClass[0]++; // Add one passing student
            bestClass[1]++; // Add one total student
            pq.offer(bestClass); // Put back in queue
        }
        
        // Calculate final average ratio
        double totalRatio = 0.0;
        while(!pq.isEmpty()) {
            int[] cls = pq.poll();
            totalRatio += (double)cls[0] / cls[1];
        }
        
        return totalRatio / classes.length;
    }
    
    // Calculate how much the ratio improves by adding one student
    private double improvement(int pass, int total) {
        double currentRatio = (double)pass / total;
        double newRatio = (double)(pass + 1) / (total + 1);
        return newRatio - currentRatio;
    }
}