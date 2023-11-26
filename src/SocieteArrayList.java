import java.util.*;

public class SocieteArrayList implements IGestion<Employe> {


    List<Employe> Emp = new ArrayList<>();

    @Override
    public void ajouterEmploye(Employe o) {
        Emp.add(o);
    }

    @Override
    public boolean rechercherEmploye(String nom) {

        for (Employe emp : Emp) {
            if (emp.getNom().equals(nom)) {

                return true;
            }
        }
        return false;
    }

    @Override
    public boolean rechercherEmploye(Employe o) {
        return Emp.contains(o);
    }

    @Override
    public void supprimerEmploye(Employe o) {
Emp.remove(o);
    }

    @Override
    public void displayEmploye() {
        for (Employe emp : Emp) {

            System.out.println(emp);
        }
    }


    @Override
    public void trierEmployeParId() {

        Collections.sort(Emp, new Comparator<Employe>() {
            @Override
            public int compare(Employe o1, Employe o2) {
                return Integer.compare(o1.getIndentifiant(), o2.getIndentifiant());
            }
        });
    }

    @Override
    public void trierEmployeParNomDépartementEtGrade() {
Collections.sort(Emp, new Comparator<Employe>() {
    @Override
    public int compare(Employe o1, Employe o2) {

int compareGrade = Integer.compare(o1.getGrade(), o2.getGrade()) ;
if (compareGrade !=0){
    return  compareGrade ;
}
        return o1.getDepartement().compareTo(o2.getDepartement());
    }
});
    }
}
