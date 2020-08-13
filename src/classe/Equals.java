package classe;

import java.util.Date;

public class Equals {

    public static void main(String[] args) {
        Usuario u1 = new Usuario();
        u1.nome = "Pedro Silva";
        u1.email = "pedro.silva@gmail.com";

        Usuario u2 = new Usuario();
        u2.nome = "Pedro Silva";
        u2.email = "pedro.silva@gmail.com";    
    
        System.out.println(u1 == u2); //false
        System.out.println(u1.equals(u2)); //false por padrão, mas true depois de sobrescrito o equals na classe Usuario
        System.out.println(u1.equals(u1)); //true

        System.out.println(u2.equals(new Date())); //Gera uma exceção por padrão, mas como foi utilizado p instanceof na equals da classe Usuario, ele está retornando false
        
    }
    

    
}