public class Departement {


    private int id;
    private String nom_de_departement;
    private int nbEmploye;


    public Departement() {
    }


    public Departement(int id, String nom_de_departement, int nbEmploye) {
        this.id = id;
        this.nom_de_departement = nom_de_departement;
        this.nbEmploye = nbEmploye;
    }


    public int getId() {
        return this.id;
    }


    public String getNom_de_departement() {
        return this.nom_de_departement;
    }

    public int getNbEmploye() {

        return this.nbEmploye;
    }


    public void SetId(int id) {


        this.id = id;

    }


    public void SetNom_de_departement(String nom_de_departement) {


        this.nom_de_departement = nom_de_departement;
    }


    public void SetNbEmploye(int nbEmploye) {
        this.nbEmploye = nbEmploye;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Departement)) return false;
        if (obj instanceof Departement dep) {

            return this.getNom_de_departement().equals(dep.getNom_de_departement()) &&
                    this.getId() == dep.getId();
        }
        return false;
    }


    @Override
    public String toString (){

        return " id " + getId()+ " nom du deparement " + getNom_de_departement()+ " nb employe " + getNbEmploye();
    }

}
