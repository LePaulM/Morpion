import gm.*;


//      ------          /!\ A FAIRE         -----
/**      1.GUI
 * Selection du nombre de cases
 * Selection du nombre de joueurs
 * 
 * 
 * */       
    


/**     2.  GM game master
 * Validation d'une case
 * Vérification du plateau
 * Créer une classe gameBoardManagement qui permettra de gérer l'ajout de cases sur un plateau virtuel
 * GMHeadmaster doit gérer uniquement les tours, les conditions de victoire
 * 
 * 
*/

/**
 *      3.
 * Liaison entre le GUI et le GM
 */


public class Main {
    public static void main (String[] args){
        System.out.println("Welcome to my tic-tac-toe !\nPaul Miancien - 2022");

        GMHeadmaster gmHeadmaster = new GMHeadmaster(2,3, false);
    }
}
