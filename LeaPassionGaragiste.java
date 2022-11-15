public class LeaPassionGaragiste {
  public static void main(String[] args) {
    double budget = 10000;
    Limousine l1 = new Limousine(12,1000,"blanche", 8);
    System.out.println(l1.calculerPrixDeVente());
    budget -= l1.calculerPrixDeVente(); // Léa achete la voiture
    
    Renaud r1 = new Renaud(12,100,"noir", 2006, 0);
    System.out.println(r1.calculerPrixDeVente());
    budget -= r1.calculerPrixDeVente(); // Léa achete la voiture
    
    Renaud r2 = new Renaud(12,150,"orange", 2015, 50);
    System.out.println(r2.calculerPrixDeVente());
    budget -= r2.calculerPrixDeVente(); // Léa achete la voiture


    System.out.println("budget : " + budget);
    
  }
}