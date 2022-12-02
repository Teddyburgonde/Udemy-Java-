public class VehiculeAMoteur {
    Moteur moteur;
    int vitesse;

    int accelerer(int vitesse){
        System.out.println("J'accèlère");
        this.vitesse=this.vitesse+vitesse;
        return this.vitesse;
    }

    Ville transporter(Passager passager, Ville villeDeDepart){
        System.out.println("Je transporte un passager qui s'appelle "+passager.nom +" "+ passager.prenom);
        System.out.println("Le passager est parti de la vile de "+villeDeDepart.nom);

        Ville villeDeDestination=new Ville();
        villeDeDestination.nom="Wellington";

        return villeDeDestination;
    }
}
