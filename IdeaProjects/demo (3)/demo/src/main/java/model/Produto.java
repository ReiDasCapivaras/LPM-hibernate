package model;

import net.bytebuddy.dynamic.loading.InjectionClassLoader;

import javax.persistence.*;

@Entity
@Table (name="Produto_Trabalho")
public class Produto {
    @Id //(GeneratedValue = GenerationType.IDENTITY)
    @Column
    private int id;

    @Column
    private String des;
    @Column
    private String marca;
    @Column
    private float prec;


    //Getters e Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public float getPrec() {
        return prec;
    }

    public void setPrec(float prec) {
        this.prec = prec;
    }
}
