public class Tableau{
    public static int maxTableau(int[] tab) {
        int res = tab[0];
        for(int i = 1; i<tab.length;i++) {
            if(tab[i] > res) res = tab[i];
        }
        return res;
    }

    public static void afficherTableau(int[] tab) {
        System.out.print("[");
        for(int i = 0; i<tab.length;i++) {
            System.out.print("\t" + tab[i] + "\t");
        }
        System.out.println("]");
    }
    
    public static int sommeTableau(int[] tab) {
        int res = 0;
        for(int i = 0; i<tab.length;i++) {
            res += tab[i];
        }
        return res;
    }

    public static void main(String[] args){
        int[] tab = {3,-2,5,7};
        afficherTableau(tab);
        System.out.println("Max = " + maxTableau(tab));
        System.out.println("Somme = " + sommeTableau(tab));
    }
}
/*En ligne de commande
javac Tableau.java
java Tableau
*/
