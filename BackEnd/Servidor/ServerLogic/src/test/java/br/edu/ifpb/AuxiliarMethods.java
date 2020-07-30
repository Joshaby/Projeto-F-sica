package br.edu.ifpb;

import java.util.*;

public class AuxiliarMethods{
    public static Map<String, List<String>> groupGen(Integer GroupsNum) {

        Random r = new Random();
        List<String> nomes = Arrays.asList("helen", "Luiza", "Talison", "Kennedy", "josé", "henrique", "japa",
                "galego", "vinicius", "marcos", "roberval");

        HashMap<String, List<String>> grupos = new HashMap<>();
        for (int j = 0; j < GroupsNum; j++) {
            ArrayList<String> users = new ArrayList<>();
            for (int k = 0; k < 5; k++) {
                StringBuilder user = new StringBuilder();
                for (int i = 0; i < 6; i++) { user.append((char) (65 + r.nextInt(25))); }
                users.add(String.valueOf(user));
            }
            grupos.put(nomes.get(j), users);
        }
        return grupos;
    }
}
