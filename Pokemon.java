/**
 * @author Romain Palayret
 * @date   15/11/2022
 * Une classe Pokemon permettant de creer des pokémons
 */
public class Pokemon {
  private final String nom;
  private final int atk;
  private double pv;

  /**
   * Constructeur de la classe Pokemon
   * @param nom : le nom du pkmn
   * @param pv : les points de vie du pkmn
   * @param atk: les points d'attaque du pkmn
   */
  public Pokemon(String nom, double pv, int atk) {
    this.nom = nom;
    this.pv = pv;
    this.atk = atk;
  }

  /**
   * Renvoie le nom du pkmn
   */
  public String getNom() {
    return this.nom;
  }

    /**
   * Renvoie l'attaque du pkmn
   */
  public int getAtk() {
    return this.atk;
  }

    /**
   * Renvoie les points de vie du pkmn
   */
  public double getPv() {
    return this.pv;
  }

  /**
   * Enleve des points de vie au pkmn
   * @param degat : le nombre de pv à enlever
   */
  public void soustrairePv(double degat) {
    this.pv -= degat;
  }

  /*
   * @return true si le pokemon est KO
   *          false sinon
   */
  public boolean estKo() {
    return pv <= 0;
  }

  /*
   * Ce pokemon attaque le pokemon prix en argument
   * @param pkmn : le pokemon à attaquer
   */
  public void attaquer(Pokemon pkmn) {
    System.out.println("Pokemon en face : \n" + pkmn.toString() + "\n");
    System.out.println("\n" + this.getNom() + " attaque " + pkmn.getNom() + " ! \n");
    pkmn.soustrairePv(this.atk);
    if(pkmn.estKo()) {
      System.out.println(this.getNom() + " a mis " +pkmn.getNom() + " Ko.");
    } else {
      System.out.println("Il reste a " + pkmn.getNom() + " " + pkmn.getPv() + " pv.");
    }
  }

  /*
   * @return Toutes les informations du pokémon dans une chaîne de caractère
   */
  public String toString() {
    return "Nom : " + getNom() + "\nPv : " + getPv() + "\nAttaque : " + getAtk();
  }
}