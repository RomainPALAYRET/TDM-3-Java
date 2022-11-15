/**
 * @author Romain Palayret
 * @date   15/11/2022
 * Une classe Point Nom est un Point avec un nom
 */
public class PointNom extends Point
{
  private String nom;

   /**
   * Constructeur de la classe PointNom
   * @param x : l'abscisse du point
   * @param y : l'ordonnée du point
   * @param nom : le nom du point
   */
  public PointNom (int x, int y, String nom) {
    setPoint(x, y);
    this.nom = nom;
  
  }

  /**
   * définit les coordonnées et le nom d’un objet de
   * type PointNom
   * @param x : l'abscisse du point
   * @param y : l'ordonnée du point
   * @param nom : le nom du point
   */
  public void setPointNom (int x, int y, String nom) {
    setPoint(x, y);
    this.nom = nom;
  
  }

  /**
   * définit le nom de l'objet
   * @param nom : le nom du point
   */
  public void setNom(String nom) {
    this.nom = nom;
  }

  /**
   * affiche les coordonnées et le nom d’un objet de
   * type PointNom
   */
  public void afficheCoords () {
    super.afficheCoords();
    System.out.println("nom = " + this.nom);
  }
  
}