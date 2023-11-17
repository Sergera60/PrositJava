public class Main {
    public static void main(String[] args) {
        // Create a SocieteArrayList instance
        SocieteArrayList societe = new SocieteArrayList();

        // Create some Employe objects
        Employe emp1 = new Employe(1, "John", "Doe", "IT", 3);
        Employe emp2 = new Employe(2, "Jane", "Smith", "HR", 2);
        Employe emp3 = new Employe(3, "Alice", "Johnson", "IT", 1);

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
    }
}
