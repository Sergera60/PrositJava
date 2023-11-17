public class Employe {

    private int indentifiant ;
 private  String nom ;
 private String prenom;
 private String  departement ;
 private int grade ;



 public Employe (){

 }

 public Employe(int indentifiant, String nom ,String prenom, String departement,int grade){

     this.indentifiant= indentifiant ;
     this.nom=nom;
     this.prenom=prenom;
     this.departement=departement;
     this.grade=grade;



 }

    public int getIndentifiant() {
        return indentifiant;
    }

    public void setIndentifiant(int indentifiant) {
        this.indentifiant = indentifiant;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getDepartement() {
        return departement;
    }

    public void setDepartement(String departement) {
        this.departement = departement;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }



    @Override
    public boolean equals(Object obj){
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof Employe)) {
            return false;
        }

Employe emp =(Employe) obj ;
return this.getNom().equals(emp.getNom()) &&
        this.getIndentifiant() == emp.getIndentifiant() &&
        this.getPrenom().equals(emp.getPrenom())
        ;

    }

    @Override
    public String toString() {
        return "identifiant :"+getIndentifiant() +"nom:" + getNom()+ "prenom :"+getPrenom() + "departement:"+getDepartement()+ "grade :"+getGrade() ;
    }
}
