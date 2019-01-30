package fr.panneauaffichage.util;

import java.util.ResourceBundle;
/* jm doudoux : notion à revoir
 * Il est préférable de définir un ResourceBundle pour chaque catégorie d'objet (exemple un par fenêtre) : 
 * ceci rend le code plus clair et plus facile à maintenir, évite d'avoir des ResourceBundle trop importants 
 * et réduit l'espace mémoire utilisé car chaque ressource n'est chargée que lorsque l'on en a besoin.

 
 * Conceptuellement, chaque ResourceBundle est un ensemble de sous-classes 
 * qui partagent la même racine de nom.
 * La classe abstraite ResourceBundle possède deux sous-classes : PropertyResourceBundle et ListResourceBundle.

La classe ResourceBundle est une classe flexible : le passage d'un PropertyResourceBundle à ListResourceBundle 
se fait sans impact sur le code. La méthode getBundle() recherche le ResourceBundle désiré qu'il soit dans un fichier .class ou propriétés.
 */
public class ParametreC {

	public static String lire(String cle) {
		ResourceBundle bundle = ResourceBundle.getBundle("fr.panneauaffichage.util.param");
		//
		return(null!=bundle) ? bundle.getString(cle): null;
 		
	}
}
