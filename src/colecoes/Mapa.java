package colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {
    public static void main(String[] args) {
        Map<Integer, String> usuarios = new HashMap<>();

        //put adiciona e substitui elementos se ele já existir
        usuarios.put(1, "Roberto"); // Nesse caso está adicionando
        usuarios.put(1, "Ricardo"); // Nesse caso está substituindo

        System.out.println(usuarios.size()); //Rsultado será 1, pois o elemento foi substituído

        usuarios.put(2, "Roberto");
        usuarios.put(3, "Rafaela");
        usuarios.put(4, "Rebeca");

        System.out.println(usuarios.keySet()); //Retorna o conjunto de chaves
        System.out.println(usuarios.values()); //Retorna o conjunto de valores
        System.out.println(usuarios.entrySet()); //Retorna o conjunto de chaves e valores
        System.out.println(usuarios.containsKey(3)); //Retorna true ou false
        System.out.println(usuarios.containsValue("José")); //Retorna true ou false
        System.out.println(usuarios.get(3)); //Retorna o valor da chave informada

        //percorrer todas as chaves através do foreach
        for (int chave : usuarios.keySet()) {
            System.out.println(chave);            
        }

        //percorrer todos od valores através do foreach
        for (String valor : usuarios.values()) {
            System.out.println(valor);            
        }

        //percorrer todo o Map com as chaves e valores através do Entry e foreach
        for(Entry<Integer, String> registro: usuarios.entrySet()){
            System.out.print(registro.getKey() + " ==> ");
            System.out.println(registro.getValue());
        }
    }
}