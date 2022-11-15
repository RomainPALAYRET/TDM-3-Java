/**
 * @author Romain Palayret
 * @date   15/11/2022
 * Une classe Limousine pour specifier les voitures
 */
public class Limousine extends Voiture {
  private final int longueur;

  /**
   * Constructeur de la classe Limousine
   * @param vitesseMax : la vitesseMax du véhicule lorsqu'il est à son prime
   * @param prix : le prix du véhicule
   * @param couleur: la couleur du véhicule
   * @param poids: la couleur du véhicule
   * @param longueur: la longueur du véhicule
   */
  public Limousine(int vitesseMax, double prix, String couleur, int longueur) {
    super(vitesseMax, prix, couleur);
    this.longueur = longueur;
  }

  /**
   * Calcule le prix de vente en fonction de sa longueur
   */
  @Override
  public double calculerPrixDeVente() {
    final double prixConstructeur = super.calculerPrixDeVente();
    return longueur > 6 ? prixConstructeur * 0.95 : prixConstructeur * 0.9;
  }
}