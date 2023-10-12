package com.example.DistributionOfMeat;

public class HousesSmallCluster1 {
   public int length;
   private int[][][] house;
   private House h;
   HousesSmallCluster1(int[][][] house,House h,int length){
      this.house=house;
      this.h=h;
      this.length=length;

   }
4
   public HousesSmallCluster1() {

   }




   public int houseWhichSacrified(HousesSmallCluster1 house) {
      int counter = 0;
      for (int i = 0; i < house.length; i++) {
         for (int j = 0; j < house.house[i].length; j++) {
            for (int k = 0; k < house.house[i][j].length; k++) {
               if (house.house[i][j][k] != 0) {
                  counter++;
                  System.out.println("the house which sacrificed has index no/ address " + i + " " + j + " " + k);
               }
            }
         }
      }
      System.out.println("the total houses that sacrificed are " + counter);
      return counter;
   }
   public int houseWhichDont() {
      int flag = 0;
      for (int i = 0; i < house.length; i++) {
         for (int j = 0; j < house[i].length; j++) {
            for (int k = 0; k < house[i][j].length; k++) {
               if (house[i][j][k] == 0) {
                  flag++;
               }
            }
         }
      }
      System.out.println("the number of houses which do not sacrifice == " + flag);
      return flag;
   }
}
      public int houseWhichDont(int[][][] house ,int i,int j,int k ){
      int flag=0;
      for(i=0;i<house.length;i++){
         for(j=0;j<house[i].length;j++){
            for(k=0;k<house[i][j].length;k++)
            {
               if(house[i][j][k]==0){
                  flag++;
               }

            }
         }
         System.out.println("the number of houses which do not sacrified== "+flag);
         return 0;
   }
return 0;
}}
