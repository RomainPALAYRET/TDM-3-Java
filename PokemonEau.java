/**
 * @author Romain Palayret
 * @date   15/11/2022
 * Une classe Pokemon Eau permettant de creer des pokémons de type feu
 * Les pkmn eau sont faibles face aux pkmn plante
 * Il sont fort contre les pokemons feu
 */
public class PokemonEau extends Pokemon {

  public PokemonEau(String nom, double pv, int atk) {
    super( nom,  pv,  atk);
  }

  /*
   * Surcharge la methode d'attaque de la classe Pokemon pour les pokémons de type feu
   * Si le pokemon est de type feu, le pokemon eau va infliger plus de dégat
   * @param pkmn : le pokemon feu à attaquer
   */
  public void attaquer(PokemonFeu pkmn) {
    System.out.println("Pokemon en face : \n" + pkmn.toString() + "\n");
    System.out.println("Votre Pokemon : \n" + super.toString() + "\n");
    System.out.println("\n" + this.getNom() + " attaque " + pkmn.getNom() + " ! ");
    System.out.println(" C'est super efficace ! \n");
    pkmn.soustrairePv(getAtk() * 2);
    if(pkmn.estKo()) {
      System.out.println(this.getNom() + " a mis " +pkmn.getNom() + " Ko.");
    } else {
      System.out.println("Il reste a " + pkmn.getNom() + " " + pkmn.getPv() + " pv.");
    }
  }

  /*
   * Surcharge la methode d'attaque de la classe Pokemon pour les pokémons de type plante
   * Si le pokemon est de type plante, le pokemon eau va infliger moins de dégat
   * @param pkmn : le pokemon plante à attaquer
   */
  public void attaquer(PokemonPlante pkmn) {
    System.out.println("Pokemon en face : \n" + pkmn.toString() + "\n");
    System.out.println("Votre Pokemon : \n" + super.toString() + "\n");
    System.out.println("\n" + this.getNom() + " attaque " + pkmn.getNom() + " ! ");
    System.out.println(" C'est pas tres efficace... \n");
    pkmn.soustrairePv(getAtk() * 0.5);
    if(pkmn.estKo()) {
      System.out.println(this.getNom() + " a mis " +pkmn.getNom() + " Ko.");
    } else {
      System.out.println("Il reste a " + pkmn.getNom() + " " + pkmn.getPv() + " pv.");
    }
  }
}