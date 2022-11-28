import java.util.LinkedHashMap;
import java.util.Map;


public class Main {

    public static void main(String[] args) {

        Map<String, String> map = new LinkedHashMap<>();
        map.put("Смирнов Сергей", "+79117485555");
        map.put("Петров Петр ", "+791217485555");
        map.put("Иванов Иван", "+79137485555");
        map.put("Денисов Денис", "+79147485555");
        map.put("Павлов Павел", "+79157485555");
        map.put("Егоров Егор", "+79167485555");
        map.put("Антонов Антон", "+79177485555");
        map.put("Васильев Василий", "+79187485555");
        map.put("Михайлов Михаил", "+79187485555");
        map.put("Юрьев Юрий", "+79117485555");
        map.put("Антонова Анна", "+79117425555");
        map.put("Смирнова Ирина", "+79117385555");
        map.put("Петрова Марина", "+79117585555");
        map.put("Денисова Лариса", "+79117685555");
        map.put("Павлова Татьяна", "+79117785555");
        map.put("Егорова Надежда", "+79117495555");
        map.put("Васильева Юлия", "+79117481555");
        map.put("Иванова Елена", "+79117485155");
        map.put("Михайлова Ольга", "+79117482555");
        map.put("Юрьева Нина", "+79117485550");
        map.put("Абрамова Светлана", "+79117480555");

        System.out.println(map);
        System.out.println(map.get("Смирнов Сергей"));
        System.out.println(map.keySet());
        System.out.println(map.values());

        for (Map.Entry<String,String>entry:map.entrySet()){
            System.out.printf("%s - %s%n ", entry.getKey(), entry.getValue());
        }
    }

}

