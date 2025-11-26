package main.java;

/**
* Représente un employé dans une entreprise.
*/
public class Employee {

    // TODO: Ajoutez les attributs ici (nom, id, position).
    private String name;
    private int id;
    private String position;
    
    // TODO: Ajoutez un constructeur pour initialiser les attributs.
    public Employee(String name, int id, String position) {
        this.name = name;
        this.id = id;
        this.position = position;
    }

    // TODO: Ajoutez des méthodes pour récupérer les valeurs des attributs (getters).↪
    public String getName() {
        return name;
    }
    // TODO: Ajoutez une méthode toString() pour représenter un employé en texte.↪
    public int getId() {
        return id;
    }
}