public class cast0223753020 {
  public static void main(String[] args) {
    // Word population today
    long currentWorldPop = 7_000_000_000L;
    System.out.println("Current Word Population " + currentWorldPop);
    // World population in 1950, source Unuted Nations Population Division
    // 2.5Billion
    int africaPop = 221_000_000;
    int asiaPop = 1_402_000_000;
    int europePop = 547_000_000;
    int americasPop = 339_000_000;
    int oceanaPop = 13_000_000;
    long worldPop1950 = (long) africaPop + asiaPop + europePop + americasPop + oceanaPop;
    System.out.println("World Population in 1950 " + worldPop1950);
    // The current population of Asia estimated 60% of the world population
    double percentAsia = 0.6;
    long currentAsiaPop = (long) (currentWorldPop * percentAsia);
    System.out.println("Current Asia Population " + currentAsiaPop);
  }

}