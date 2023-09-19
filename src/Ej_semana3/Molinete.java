package Ej_semana3;

import org.w3c.dom.ls.LSOutput;

public class Molinete {
    public Boolean habilitado = true;
    public int cantidad = 0;

    public void estaHabilitado() {
        if (habilitado) {
            System.out.println("El molinete esta activado!");
        } else {
            System.out.println("El molinete esta desactivado!");
        }
    }

    public void cambiarEstado() {
        habilitado = !habilitado;
        if (habilitado) {
            System.out.println("El molinete se habilito!");
        } else {
            System.out.println("El molinete se deshabilito!");
        }
    }

    public void pasoPersona() {
        cantidad++;
    }

    public void personasTotal() {
        System.out.println(cantidad + " personas pasaron por el molinete!");
    }

        public void m() {
            // codigo
        }

        public int m(int x) {
            // codigo
            return 0;

}}
