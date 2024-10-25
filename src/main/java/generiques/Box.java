package generiques;

public class Box<T extends Number> {

    private T identifiant;
    private String code;

    public Box(T identifiant, String code) {
        this.identifiant = identifiant;
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public T getIdentifiant() {
        return identifiant;
    }

    public void setIdentifiant(T identifiant) {
        this.identifiant = identifiant;
    }
}
