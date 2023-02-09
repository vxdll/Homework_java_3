import java.util.*;

// 3. Пройти по списку из задания 2 с урока и удалить повторяющиеся элементы.
public class TaskThree {
    public static void main(String[] args) {
        delElements();
    }

    private static void delElements() {
        String [] solarSystemPlanets = new String[] {"Меркурий","Венера","Земля","Марс","Юпитер","Сатурн","Уран","Нептун", "Плутон"};
        HashMap<String, Integer> planetCount = new HashMap<>();
        Random random = new Random();

        ArrayList<String> arrayPlanets = new ArrayList<>();
        for (int i = 0; i < 10 ; i++) {
            arrayPlanets.add(solarSystemPlanets[random.nextInt(9)]);
        }

        for(String planet : arrayPlanets){
            if (planetCount.containsKey(planet)){
                planetCount.put(planet, planetCount.get(planet) + 1);
            }else {
                planetCount.put(planet, 1);
            }
        }

        for(String planet : planetCount.keySet()){
            System.out.printf("%s -> %s\n", planet, planetCount.get(planet));
        }
        System.out.println("Список планет с повтором -> "+ arrayPlanets);

        Set<String> delete = new LinkedHashSet<>(arrayPlanets);
        ArrayList<String>  newArrayPlanet = new ArrayList<>(delete);
        System.out.println("Список планет без повтора -> " + newArrayPlanet);
    }
}


