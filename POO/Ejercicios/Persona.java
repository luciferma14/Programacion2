

public class Persona {
    
    private String nombre;
    private Integer edad;
    private String dni;
    private Character sexo;
    private Double peso;
    private Double altura;

    public Persona(){
        this.sexo = 'M';
        this.dni = generaDNI();
    }

    public Persona(String nombre, Integer edad, Character sexo){
        this.nombre = nombre;
        this.edad = edad;
        this.dni = generaDNI();
        this.sexo = sexo;
        comprobarSexo(this.sexo);
    }

    public Persona(String nombre, Integer edad, Character sexo, Double peso, Double altura){
        this.nombre = nombre;
        this.edad = edad;
        this.dni = generaDNI();
        this.sexo = sexo;
        comprobarSexo(this.sexo);
        this.peso = peso;
        this.altura = altura;
    }

    public Integer calcularIMC(){
        double imc = (this.peso / (this.altura * this.altura));
        Integer valor;

        if(imc < 20){
            return valor = -1;
        }else if(imc >= 20 && imc <= 25){
            return valor = 0;
        }else{
            return valor = 1;
        }
    }

    public Boolean esMayorDeEdad(){
        boolean mayor;

        if(this.edad >= 18){
            return mayor = true;
        }else{
            return mayor = false;
        }
    }

    public void comprobarSexo(Character sex){
        if(sex != 'H' || sex != 'M'){
            this.sexo = 'M';
            System.out.println("No es correcto");
        }else{
            System.out.println("Es correcto");
        }
    }

    public static String generaDNI(){
        String cifras = "";
        String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
        int resto;
        char letra;
        String dniEntero;

        for(int i = 0; i < 8; i++){
            cifras += (int)(Math.random() * 10);
        } 
        resto = Integer.valueOf(cifras) % 23;
        letra = letras.charAt(resto);
        dniEntero = cifras + letra;

        return  dniEntero;
    }
    
    public String toString(){
        return this.nombre + ": " + this.edad + ", " + this.dni + ", " + this.sexo + ", " + this.peso + "kg, " + this.altura + "m";
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return this.edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getDni() {
        return this.dni;
    }

    public Character getSexo() {
        return this.sexo;
    }

    public void setSexo(Character sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return this.peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Double getAltura() {
        return this.altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }   
}