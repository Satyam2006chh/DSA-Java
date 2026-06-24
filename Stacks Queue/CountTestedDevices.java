// 2960. Count Tested Devices After Test Operations\
class CountTestedDevices {
    public int countTestedDevices(int[] batteryPercentages) {
        int tested = 0;
        int n = batteryPercentages.length;

        for (int i = 0; i < n; i++) {
            if (batteryPercentages[i] > 0) {
                // Device i is tested
                tested++;

                // Decrease battery of all devices after i
                for (int j = i + 1; j < n; j++) {
                    if (batteryPercentages[j] > 0) {
                        batteryPercentages[j]--;
                    }
                }
            }
        }

        return tested;
    }
}
