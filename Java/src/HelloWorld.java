public class HelloWorld {
    public static void main(String...args ){
        Voiture voitureDePaul=new Voiture();
        voitureDePaul.nbPortes =5;
        voitureDePaul.automatique= false;
        voitureDePaul.couleur="red";

        Voiture voitureDeBryant= new Voiture();
        voitureDeBryant.nbPortes =5;
        voitureDeBryant.automatique= false;
        voitureDeBryant.couleur="red";

        Voiture voitureDeFranck= new Voiture();
        voitureDeFranck.nbPortes=9;
        // il faut creer un nouveau moteur
        Moteur moteur= new Moteur();
        moteur.carburation="Diesel";
        moteur.nbCylindres = 6;
        //J'affecte le moteur a la voitureDeFranck;
        voitureDeFranck.moteur=moteur;
        //notation pointé qui s'applique en cascade au propriété des propriété
        System.out.println("Le nombre de cylindre de la voiture de Franck est "+voitureDeFranck.moteur.nbCylindres);

        Passager passager= new Passager();
        passager.nom="Lebron";
        passager.prenom="James";

        Ville auckland = new Ville();
        auckland.nom = "Auckland";

        Ville destination=voitureDeFranck.transporter(passager, auckland);
        System.out.println("Le passager est arrivé dans la ville de "+destination.nom);
        System.out.println("le nombre de roues d'une voiture en genenral est "+Voiture.nbRoues);
        Voiture.klaxonner();
        Voiture.tourner(true, 30);
    }
}
