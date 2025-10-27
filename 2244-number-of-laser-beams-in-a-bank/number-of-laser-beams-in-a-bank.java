class Solution {
    public int numberOfBeams(String[] bank) {
        int total = 0; // Variable to store the total number of laser beams
        int prev = 0;  // Variable to store the count of security devices in the previous row

        // Iterate through each row in the bank
        for (String row : bank) {
            int curr = 0; // Variable to store the count of security devices in the current row

            // Count the number of security devices in the current row
            for (int i = 0; i < row.length(); i++) {
                if (row.charAt(i) == '1') {
                    curr++;
                }
            }

            // If there are security devices in the current row, calculate and add the number of laser beams
            if (curr > 0) {
                total += (prev * curr); // Multiply the count of devices in the previous row by the count in the current row
                prev = curr; // Update the count of devices in the previous row for the next iteration
            }
        }

        return total; // Return the total number of laser beams
    }
}
