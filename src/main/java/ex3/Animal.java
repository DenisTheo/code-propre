package ex3;

/**
 * Représente un animal
 */
public abstract class Animal
{
	/** nom de l'espèce de l'animal */
    private String nom;
    /** comportement alimentaire de l'animal */
    private Comportement comportement;

    /**
     * Constructeur sans comportement
     * 
     * @param nom	nom de l'espèce
     */
    public Animal(String nom)
    {
        setNom(nom);
        comportement = null;
    }
    
    /**
     * Constructeur avec comportement
     * 
     * @param nom	nom de l'espèce
     * @param comportement	comportement alimentaire
     */
    public Animal(String nom, Comportement comportement)
    {
        setNom(nom);
        setComportement(comportement);
    }
    
    @Override
    public String toString()
    {
    	return getNom() + " (" + comportement + ')';
    }

    /**
     * Getter de nom
     * 
     * @return le nom de l'animal
     */
    public String getNom()
    {
        return nom;
    }

    /**
     * Setter de nom
     * 
     * @param le nom de l'animal
     */
    public void setNom(String nom)
    {
        this.nom = nom;
    }

    /**
     * Getter de comportement
     * 
     * @return le type de comportement de l'animal
     */
    public Comportement getComportement()
    {
        return comportement;
    }

    /**
     * Setter de comportement
     * 
     * @param le type de comportement de l'animal
     */
    public void setComportement(Comportement comportement)
    {
        this.comportement = comportement;
    }
}
