package paquete.data;

public class Persona {

        //Variables
        private String nombre, DNI, sexo;
        private int edad;
        private double peso, altura;

        public Persona(String nombre, String DNI, String sexo, int edad, double peso, double altura) {
                this.nombre = nombre;
                this.DNI = DNI;
                this.sexo = sexo;
                this.edad = edad;
                this.peso = peso;
                this.altura = altura;
        }

        public String getNombre() {
                return nombre;
        }

        public void setNombre(String nombre) {
                this.nombre = nombre;
        }

        public String getDNI() {
                return DNI;
        }

        public void setDNI(String DNI) {
                this.DNI = DNI;
        }

        public String getSexo() {
                return sexo;
        }

        public void setSexo(String sexo) {
                this.sexo = sexo;
        }

        public int getEdad() {
                return edad;
        }

        public void setEdad(int edad) {
                this.edad = edad;
        }

        public double getPeso() {
                return peso;
        }

        public void setPeso(double peso) {
                this.peso = peso;
        }

        public double getAltura() {
                return altura;
        }

        public void setAltura(double altura) {
                this.altura = altura;
        }

        public Persona() {

        }

        public void envejeciendo(){
                System.out.println("Estas envejeciendo");
        }

        @Override
        public String toString() {
                return "Persona{" +
                        "nombre='" + nombre + '\'' +
                        ", DNI='" + DNI + '\'' +
                        ", sexo='" + sexo + '\'' +
                        ", edad=" + edad +
                        ", peso=" + peso +
                        ", altura=" + altura +
                        '}';
        }
}



