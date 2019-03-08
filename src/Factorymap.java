/**
 * Clase Factory que crea los tres tipos de map segun el usuario indique.
 * @author Abril Palencia y Roberto Castillo
 * @since 07/03/2019
 */

import java.util.Map;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.LinkedHashMap;

public class Factorymap {

    public Map<String, String> makeMap (String type) {
        if (type.equals("HashMap")) {
            return new HashMap<>();
        } else if (type.equals("LinkedHashMap")) {
            return new LinkedHashMap<>();
        } else if (type.equals("TreeMap")) {
            return new TreeMap<>();
        } else
            return new HashMap<>();
    }
}
