import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AffectationHashMap {

private Map<Employe,Departement> affectation;


    public AffectationHashMap(){
        affectation = new HashMap<>();
    }


    public void ajouterEmployeDepartemen (Employe e , Departement d){

        affectation.put(e,d);
    }

    public void afficherEmployesEtDepartements (Employe emp)
    {
Departement dep =affectation.get(emp);
if (dep != null){
    System.out.println( emp + " departement " + dep );
}
else{
System.out.println( emp + " is not assigned to any department.");}

    }


    public void supprimerEmploye(Employe e){

        affectation.remove(e);



    }


   public void  supprimerEmployeEtDepartement (Employe e, Departement d) {

if (affectation.containsKey(e) && affectation.get(e).equals(d)){

    affectation.remove(e);
}
}

    public void afficherEmployes(){

      System.out.println(affectation.keySet());
    }


    public void afficherDepartement(){

System.out.println(affectation.values());


    }


    public boolean rechercherEmploye(Employe e){

if (affectation.containsKey(e)) return  true;

return  false ;
    }




    public boolean rechercherDepartement(Departement d)
    {

if (affectation.containsValue(d)) return true;
        return  false ;
    }



public TreeMap<Employe,Departement> trierMap(){

    Comparator<Employe> comparator = new Comparator<Employe>() {
        @Override
        public int compare(Employe o1, Employe o2) {
            return Integer.compare(o1.getIndentifiant(),o2.getIndentifiant());
        }

    };

return new TreeMap<>(comparator);


}
}
