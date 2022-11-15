/**
 * @author Romain Palayret
 * @date   15/11/2022
 * Une classe Renaud pour specifier les voitures
 */
public class Renaud extends Voiture {
  private final int reducConstru, anneeFabrication;

  /**
   * Constructeur de la classe Renaud
   * @param vitesseMax : la vitesseMax du véhicule lorsqu'il est à son prime
   * @param prix : le prix du véhicule
   * @param couleur: la couleur du véhicule
   * @param poids: la couleur du véhicule
   * @param anneeFabrication: l'annee de Fabrication du véhicule
   * @param reducConstru: Une reduction de prix
   */
  public Renaud(int vitesseMax, double prix, String couleur, int anneeFabrication, int reducConstru) {
    super(vitesseMax, prix, couleur);
    this.anneeFabrication = anneeFabrication;
    this.reducConstru = reducConstru;
  }

  /**
   * Calcule le prix de vente :
   * Il s'agit du prix du véhicule dont on soustrait la réduction constructeur 
   */
  @Override
  public double calculerPrixDeVente() {
    final double prixConstructeur = super.calculerPrixDeVente();
    return prixConstructeur - reducConstru;
  }
}