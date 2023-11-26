import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        // Create a SocieteArrayList instance
        SocieteArrayList societe = new SocieteArrayList();

        // Create some Employe objects
        Employe emp1 = new Employe(3, "John", "Doe", "IT", 3);
        Employe emp2 = new Employe(1, "Jane", "Smith", "HR", 2);
        Employe emp3 = new Employe(2, "Alice", "Johnson", "GL", 1);

        // Add employees to the SocieteArrayList
        societe.ajouterEmploye(emp1);
        societe.ajouterEmploye(emp2);
        societe.ajouterEmploye(emp3);

        // Display employees before sorting
        System.out.println("Employees before sorting:");
        societe.displayEmploye();

        // Sort employees by ID
        societe.trierEmployeParId();
        System.out.println("\nEmployees sorted by ID:");
        societe.displayEmploye();

        // Sort employees by grade and department name
        societe.trierEmployeParNomDépartementEtGrade();
        System.out.println("\nEmployees sorted by Grade and Department Name:");
        societe.displayEmploye();

        // Search for an employee by name
        boolean found = societe.rechercherEmploye("Alice");
        System.out.println("\nIs Alice in the list? " + found);


        Departement dep1= new Departement (3,"susah",35);
        Departement dep2= new Departement (1,"tunis",92);
        Departement dep3= new Departement (2,"monastir",10);

        DepartementHashSet departement =new DepartementHashSet();


        departement.ajouterDepartement(dep1);
        departement.ajouterDepartement(dep2);
        departement.ajouterDepartement(dep3);



        System.out.println("avant le triage");
        departement.displayDepartement();


        TreeSet<Departement> sortedDepartements = departement.trierDepartementById();
        System.out.println("\n apres le triage");

// Display the departments from the sorted TreeSet
        for (Departement dep : sortedDepartements) {
            System.out.println(dep);
        }

       System.out.println(departement.rechercherDepartement("Sfax"));


AffectationHashMap a = new AffectationHashMap();



        a.ajouterEmployeDepartemen(emp1,dep1);
        a.ajouterEmployeDepartemen(emp1,dep1);
        a.ajouterEmployeDepartemen(emp2,dep3);
        a.ajouterEmployeDepartemen(emp3,dep2);

        a.ajouterEmployeDepartemen(emp1,dep3);


a.afficherEmployesEtDepartements(emp1);
      a.afficherEmployesEtDepartements(emp2);
     a.afficherEmployesEtDepartements(emp3);
        //cleé primaire n'est pas duplicable

     a.supprimerEmploye(emp1);
System.out.println("--------------------------------------------------");


a.afficherEmployes();

a.afficherDepartement();



System.out.println(a.rechercherDepartement(dep1));


        TreeMap<Employe,Departement> sorted = a.trierMap();




       for (Map.Entry<Employe, Departement> entry : sorted.entrySet()) {
            Employe employe = entry.getKey();
            Departement depa = entry.getValue();
            System.out.println("Employe ID: " + employe.getIndentifiant() + " - " + employe + " | Departement: " + depa);
        }
   





    }
}
