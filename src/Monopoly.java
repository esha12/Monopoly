
import java.util.ArrayList;

/*
 * this class creates a monopoly object out of 2, 3, or 4 properties that form a monopoly
 */

/**
 *
 * @author esha_umbarkar
 */
public class Monopoly{
    //instance variables
    private Property a;
    private Property b;
    private Property c;
    private Property d;
    static private ArrayList<Property> props;
    
    public Monopoly (Property a, Property b, Property c){
        this.a = a;
        this.b = b;
        this.c = c;
        props = new ArrayList<Property>();
        props.add(a);
        props.add(b);
        props.add(c);
    }
    public Monopoly (Property a, Property b){
        this.a = a;
        this.b = b;
        props = new ArrayList<Property>();
        props.add(a);
        props.add(b);
    }
    public Monopoly (Property a, Property b, Property c, Property d){
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        props = new ArrayList<Property>();
        props.add(a);
        props.add(b);
        props.add(c);
        props.add(d);
    }
    
    public ArrayList<Property> getProps(){
        return props;
    }
    
    public static void rent(Monopoly m){
        for(Property p: props){
            int newRent = p.getRent()*2;
            p.setRent(newRent);
        }
    }
    
    public static void setBackRent(Monopoly m){
        for(Property p: props){
            int newRent = p.getRent()/2;
            p.setRent(newRent);
        }
    }
}
