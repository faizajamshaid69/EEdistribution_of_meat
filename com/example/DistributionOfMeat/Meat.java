package com.example.DistributionOfMeat;

public class Meat {
    private final int meat;

    Meat(int meat) {
        this.meat = meat;

    }

    public int getMeat() {
        return meat;
    }

    public void setMeat(int meat, HousesSmallCluster1 house) {
        int i, j, k;
        for (i = 0; i < house.length; i++) {
            for (j = 0; j < house.house[i].length; j++) {
                for (k = 0; k < house.house[i][j].length; j++) {
                    house.house[i][j][k] = meat;

                }
            }
        }
    }

    public int meatDistributionAmongHousesCluster(HousesSmallCluster1 house, Meat meat) {
        int i, j, k;
        for (i = 0; i < house.length; i++) {
            for (j = 0; j < house.house[i].length; j++) {
                for (k = 0; k < house.house[i][j].length; j++) {
                    if (house.house[i][j][k] != 0) {
                        if (k + 1 < house.house[i][j].length && j + 1 < house.house[i].length && k + 1 < house.length && house.house[i][j][k + 1] == 0
                        house.house[i][j + 1][k + 1] == 0 && house.house[i][j][k - 1] == 0){
                            house.house[i][j][k] = house.house[i][j][k].getMeat() / 4;
                        }
                    }
                }
            }
        }
        return 0;
    }
}



