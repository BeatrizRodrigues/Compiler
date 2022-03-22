package Simbolos;

public class Symbol {
    private Integer id;
    private String type;
    private String name;
    private String value;

    public Symbol(Integer id, String type, String name, String value) {
        this.id = id;
        this.type = type;
        this.name = name;
        this.value = value;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTipo() {
        return type;
    }

    public void setTipo(String tipo) {
        this.type = tipo;
    }

    public String getNome() {
        return name;
    }

    public void setNome(String nome) {
        this.name = nome;
    }

    public String getVal() {
        return value;
    }

    public void setVal(String val) {
        this.value = val;
    }
}
