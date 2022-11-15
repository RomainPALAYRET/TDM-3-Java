/**
 * @author Romain Palayret
 * @date   15/11/2022
 * Une classe Pokemon Plante permettant de creer des pokémons de type plante
 * Les pkmn plante sont faibles face aux pkmn feu
 * Il sont fort contre les pokemons eau
 */
public class PokemonPlante extends Pokemon {

  public PokemonPlante(String nom, double pv, int atk) {
    super( nom,  pv,  atk);
  }

  /*
   * Surcharge la methode d'attaque de la classe Pokemon pour les pokémons de type eau
   * Si le pokemon est de type eau, le pokemon plante va infliger plus de dégat
   * @param pkmn : le pokemon eau à attaquer
   */
  public void attaquer(PokemonEau pkmn) {
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
   * Surcharge la methode d'attaque de la classe Pokemon pour les pokémons de type feu
   * Si le pokemon est de type feu, le pokemon plante va infliger moins de dégat
   * @param pkmn : le pokemon feu à attaquer
   */
  public void attaquer(PokemonFeu pkmn) {
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