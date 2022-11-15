/**
 * @author Romain Palayret
 * @date   15/11/2022
 * Une classe Camion pour concurrencer les voitures
 */
public class Camion extends Voiture {
  private final int poids;

  /**
   * Constructeur de la classe Camion
   * @param vitesseMax : la vitesseMax du camion lorsqu'il est à son prime
   * @param prix : le prix du camion
   * @param couleur: la couleur du camion
   * @param poids: la couleur du camion
   */
  public Camion(int vitesseMax, double prix, String couleur, int poids) {
    super(vitesseMax, prix, couleur);
    this.poids = poids;
  }

  /**
   * Calcule le prix de vente en fonction du poids du Camion : 
   * Si le camion dépasse 2000 kg, on applique une reduction de 10%
   */
  @Override
  public double calculerPrixDeVente() {
    final double prixConstructeur = super.calculerPrixDeVente();
    return poids > 2000 ? prixConstructeur * 0.9 : prixConstructeur * 0.8;
  }
}