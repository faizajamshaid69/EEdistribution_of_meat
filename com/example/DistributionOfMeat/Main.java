package com.example.DistributionOfMeat;

public class Main {
    public static void main(String[] args) {
        // Create a House
        House house1 = new House("123 Main St", "John Doe");

        // Create a HousesSmallCluster1
        int length = 3;  // Example length value
        int[][][] houseArray = new int[length][length][length];  // Example house array
        HousesSmallCluster1 cluster1 = new HousesSmallCluster1(houseArray, house1, length);

        // Create a Meat instance
        Meat meat = new Meat(10);  // Example meat value

        // Set the meat value for houses in the cluster
        meat.setMeat(5, cluster1);

        // Find out which houses sacrificed
        cluster1.houseWhichSacrified(cluster1);

        // Distribute meat among houses
        meat.meatDistributionAmongHousesCluster(cluster1, meat);

        // Find out which houses don't sacrifice
        cluster1.houseWhichDont();

        // You can perform additional operations as needed.
    }

    private static class String {
    }
}