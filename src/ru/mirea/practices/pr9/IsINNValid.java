package ru.mirea.practices.pr9;

import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;

public class IsINNInBase {
    private TreeMap<String, String> map = new TreeMap<String, String>();

    IsINNInBase() {
        map.put("Соловьев Никита Евгеньевич", "355828917148");
        map.put("Смирнова Анна Дмитриевна", "484574324656");
    }
    public void checkInBase (String key,String val) throws Throwable {
        if(!Objects.equals(map.getOrDefault(key, ""), val)){
            throw new INNNotFoundException();
        }
    }
}
