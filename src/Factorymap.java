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
    public Map crear(int op) {
        //primera opcion HashMap
        if (op == 1) {
            return new HashMap();
        // segunda opcion TreeMap
        } else if (op == 2) {
            return new TreeMap();
        //tercera opcion LinkedHasgMap
        } else{
            return new LinkedHashMap();
        }
    }
}
