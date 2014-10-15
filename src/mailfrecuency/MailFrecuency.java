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
public class MailFrecuency {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MailReader reader = new MailReader("mails.txt");
        HistogramBuilder<String> builder = new HistogramBuilder<>();
        Histogram<String> histogram = builder.build (reader.readDomains());
        new HistogramViewer<String>().print(histogram);
    }
    
}
