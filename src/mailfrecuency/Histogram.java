
package mailfrecuency;

import java.util.HashMap;

/**
 *
 * @author usuario
 */
public class Histogram <Type> extends HashMap<Type,Integer>{

    @Override
    public Integer get(Object key) {
        if(containsKey(key)){
            return super.get(key);
        }//To change body of generated methods, choose Tools | Templates.
        return 0;
    }
    
}
