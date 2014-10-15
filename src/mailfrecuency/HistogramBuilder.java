/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mailfrecuency;

/**
 *
 * @author usuario
 */
public class HistogramBuilder <Type> {

    public Histogram<Type> build(Type[] types) {
        Histogram<Type> histogram = new Histogram<>();
        for (Type type : types) {
               histogram.put(type,histogram.get(type)+1);
        }
        return histogram;
    }
}
    
    
