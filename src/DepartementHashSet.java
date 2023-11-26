import java.util.Comparator;
import java.util.TreeSet;
import java.util.Set;
import java.util.HashSet;

public class DepartementHashSet implements  IDepartement<Departement>{

    Set<Departement> myHashSet = new HashSet<>();
    @Override
    public void ajouterDepartement(Departement dep) {

myHashSet.add(dep);


    }

    @Override
    public boolean rechercherDepartement(String nom) {

        for (Departement dep : myHashSet){

            if (dep.getNom_de_departement().equals(nom)) return true;
        }
        return false;
    }

    @Override
    public boolean rechercherDepartement(Departement departement) {




        return myHashSet.contains(departement);
    }

    @Override
    public void supprimerDepartement(Departement departement) {
        myHashSet.remove(departement);

    }

    @Override
    public void displayDepartement() {
        for (Departement dep : myHashSet)
        {System.out.println(dep);}


    }

    @Override
    public TreeSet<Departement> trierDepartementById() {

        Comparator<Departement> comparator = new Comparator<Departement>() {
            @Override
            public int compare(Departement o1, Departement o2) {


                return Integer.compare(o1.getId() ,o2.getId());
            }

    };
        TreeSet<Departement> sortedDepartements = new TreeSet<>(comparator);
        sortedDepartements.addAll(myHashSet);
return sortedDepartements;
}

}
