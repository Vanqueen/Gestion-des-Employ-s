import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
        private List<Employe> employes = new ArrayList<>();
        private Scanner scanner = new Scanner(System.in);

     public void addEmploye() {
        int id = 0;
        System.out.println("Combien d'employé voulez vous ?");
            int addNum = scanner.nextInt();

            for(int i = 0; i < addNum; i++) {
                id++;
        Employe employe = new Employe();
        System.out.println("Entrer le nom de l'utilisateur");
        scanner.nextLine();
        String nom = scanner.nextLine();
        System.out.println("Entrer le poste de l'utilisateur");
        String poste = scanner.nextLine();
        System.out.println("Entrer le salaire de l'utilisateur");
        int salaire = scanner.nextInt();
        scanner.nextLine();

        employe.setID(id);
        employe.setNom(nom);
        employe.setPoste(poste);
        employe.setSalaire(salaire);
        employes.add(employe);
            }
     }

     public void getAllEmployes() {
        for(Employe eliette: employes) {
             System.out.println("ID:" + eliette.getID());
             System.out.println("Nom: " + eliette.getNom());
             System.out.println("Poste: " + eliette.getPoste());
             System.out.println("Salaire " + eliette.getSalaire());
        }      
        System.out.println("Aucun employé trouvé");
     }

     public void getEmployeById() {
        System.out.println("Entrer l'ID de l'employé");
        int id = scanner.nextInt();
        for(Employe employe: employes) {
            if(employe.getID() == id) {
                 System.out.println(employe);
                 return;
            }
        System.out.println("Employé non trouvé");
        }
     }

     public void removeEmploye() {
        System.out.println("Entrer l'ID de l'employé");
        int id = scanner.nextInt();
         for(Employe remove: employes) {
         if(remove.getID() == id) {
            employes.remove(remove);
            System.out.println("l'employe avec l'id: " + id +" supprimé avec succès");
         }
         }
     }

     public void removeAllEmploye() {
            employes.clear();
            System.out.println("Tout les employés sont supprimé avec succès");
     }

     public void upDateEmploye() {
        System.out.println("Entrer l'ID de l'employé");
        int id = scanner.nextInt();
         for(Employe upDate: employes) {
             if(upDate.getID() == id) {
                System.out.println("Entrer le nom de l'utilisateur");
                scanner.nextLine();
                String nom = scanner.nextLine();
                System.out.println("Entrer le poste de l'utilisateur");
                String poste = scanner.nextLine();
                System.out.println("Entrer le salaire de l'utilisateur");
                int salaire = scanner.nextInt();
                scanner.nextLine();

                upDate.setNom(nom);
                upDate.setPoste(poste);
                upDate.setSalaire(salaire);
                // employes.setNom();
         System.out.println("l'employe avec l'id: " + id + " est modifié avec succès");
        }
         }
       
     }

    public static void main(String[]args) {
       
        Main gestion = new Main();
        Scanner scanner = new Scanner(System.in);

        while(true) {

        
        System.out.println("1.Ajouter un employé ");
        System.out.println("2.Modifier un employé ");
        System.out.println("3.Supprimer un employé ");
        System.out.println("4.Supprimer tous les employés ");
        System.out.println("5.Afficher tous les employés");
        System.out.println("6.Afficher un employé spécifique");
        System.out.println("7.Quitter l'application");

        System.out.println("Entrer une valeur");
        int choix = scanner.nextInt();
        scanner.nextLine();

            switch (choix) {
                case 1:
                    gestion.addEmploye();
                break;
                case 2:
                    gestion.upDateEmploye();
                break;
                case 3:
                    gestion.removeEmploye();
                break;
                case 4:
                    gestion.removeAllEmploye();
                break;
                case 5:
                    gestion.getAllEmployes();
                break;
                case 6:
                    gestion.getEmployeById();
                break;
                case 7:
                    System.out.println("Quiter le scanner");
                    scanner.close();
                break;
                default :
                    System.out.println("Entrer une valeur valide");
                break;
            }
        //  scanner.close();
        }
    
     }

}
