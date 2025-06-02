public class Alumno {
    private String nombre;
    private int edad;
    private String grado;
    private String horario;
    

    public Alumno(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void setGrado() {
        if (edad >= 4 && edad <= 6) {
            this.grado = "Kinder";
        } else if (edad >=7 && edad <=8) {
            this.grado = "1st year";
        } else if (edad >=9 && edad <=10) {
            this.grado = "2nd year";
        } else if (edad >= 11 && edad <=13) {
            this.grado = "3rd year";
        } else {
            System.out.println("No hay cursos para esta edad.");
        }
    }

    public void setHorario() {
        switch (this.grado) {
            case "Kinder":
            this.horario = "Lunes y Miercoles de 16 a 17";
            break;
            case "1st year":
            this.horario = "Martes y Jueves de 16:30 a 17:30";
            break;
            case "2nd year":
            this.horario = "Martes y jueves de 17:30 a 19";
            break;
            case "3rd year":
            this.horario = "Lunes y miercoles de 17:00 a 18:30";
        }
    }

    @Override
    public String toString() {
        return "El alumno " + this.nombre + " tiene una edad de " + this.edad + " y cursa el grado " + this.grado + " con un horario asignado de: " + this.horario + ".";
    }
}
