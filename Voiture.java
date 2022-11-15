/**
 * @author Romain Palayret
 * @date   15/11/2022
 * Une classe Voiture pour rouler vite (dans les limites imposées par la loi)
 * Fiouuuuuuu
 */
public class Voiture {
  private final int vitesseMax;
  private final double prix;
  private final String couleur;

  /**
   * Constructeur de la classe Voiture
   * @param vitesseMax : la vitesseMax d'un véhicule lorsqu'il est à son prime
   * @param prix : le prix d'un véhicule
   * @param couleur: la couleur du véhicule
   */
  public Voiture(int vitesseMax, double prix, String couleur) {
    this.vitesseMax = vitesseMax;
    this.prix = prix;
    this.couleur = couleur;
  }

  /**
   * Renvoie simplement le prix de vente
   */
  public double calculerPrixDeVente() {
    return this.prix;
  }
}