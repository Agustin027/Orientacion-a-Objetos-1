import java.time.LocalDate;

public class Mamifero {
    private String id;
    private String especie;
    private LocalDate fechaNacimiento;
    private Mamifero madre;
    private Mamifero padre;

    public Mamifero(String id) {
        this.id = id;
    }

    public Mamifero() {
    }

    public String getIdentificador() {
        return id;
    }

    public void setIdentificador(String id) {
        this.id = id;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Mamifero getMadre() {
        return madre;
    }

    public void setMadre(Mamifero madre) {
        this.madre = madre;
    }

    public Mamifero getPadre() {
        return padre;
    }

    public void setPadre(Mamifero padre) {
        this.padre = padre;
    }

    public Mamifero getAbueloMaterno() {
        if (getMadre() == null) {
            return null;
        }
        else {
            return getMadre().getPadre();
        }

    }

    public Mamifero getAbuelaMaterna() {
        if (getMadre() == null) {
            return null;
        }
        else {
            return getMadre().getMadre();
        }
    }

    public Mamifero getAbueloPaterno() {
        if (getPadre() == null) {
            return null;
        }
        else {
            return getPadre().getPadre();
        }
    }
    public Mamifero getAbuelaPaterna() {
        if (getPadre() == null) {
            return null;
        }
        else {
            return getPadre().getMadre();
        }
    }


    public boolean tieneComoAncestroA(Mamifero m) {
        boolean ok;
        if (m == null) {
            ok = false;
        } else {
            boolean ok1 = false;
            boolean ok2 = false;
            if (this.getPadre() != null) {
                if (this.getPadre().equals(m)) {
                    ok1 = true;
                    return ok1;
                } else {
                    ok1 = this.getPadre().tieneComoAncestroA(m);
                }

            }

            if (this.getMadre() != null) {
                if (this.getMadre().equals(m)) {
                    ok2 = true;
                    return ok2;
                } else {
                    ok2 = this.getMadre().tieneComoAncestroA(m);
                }
            }
            ok = ok1 || ok2;

        }
        return ok;
    }


}
