package fr.panneauaffichage.util;

import java.util.ResourceBundle;
/* jm doudoux : notion � revoir
 * Il est pr�f�rable de d�finir un ResourceBundle pour chaque cat�gorie d'objet (exemple un par fen�tre) : 
 * ceci rend le code plus clair et plus facile � maintenir, �vite d'avoir des ResourceBundle trop importants 
 * et r�duit l'espace m�moire utilis� car chaque ressource n'est charg�e que lorsque l'on en a besoin.

 
 * Conceptuellement, chaque ResourceBundle est un ensemble de sous-classes 
 * qui partagent la m�me racine de nom.
 * La classe abstraite ResourceBundle poss�de deux sous-classes : PropertyResourceBundle et ListResourceBundle.

La classe ResourceBundle est une classe flexible : le passage d'un PropertyResourceBundle � ListResourceBundle 
se fait sans impact sur le code. La m�thode getBundle() recherche le ResourceBundle d�sir� qu'il soit dans un fichier .class ou propri�t�s.
 */
public class ParametreC {

	public static String lire(String cle) {
		ResourceBundle bundle = ResourceBundle.getBundle("fr.panneauaffichage.util.param");
		//
		return(null!=bundle) ? bundle.getString(cle): null;
 		
	}
}
