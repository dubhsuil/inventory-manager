/**
 *
 */
public class Material {

    private String descript;
    private double len;
    private double wid;
    private UnitOfMeasure uofm;
    
    //Default constructor
    public Material() {
        descript = "n/a";
        len = 0;
        wid = 0;
        uofm = NONE;
    }
    
    //parameterized constructor
    public Material(String descript, double len, double wid, UnitOfMeasure uofm) {
        this.descript = descript;
        this.len = len;
        this.wid = wid;
        this.uofm = uofm;
    }
    
    /*getters and setters*/
    
    public String get_descript() {
        return descript;
    }
    public void set_descript(String descript) {
        this.descript = descript;
    }
    
    public double get_len() {
        return len;
    }
    public void set_len(double len) {
        this.len = len;
    }
    
    public double get_wid() {
        return wid;
    }
    public void set_wid(double wid) {
        this.wid = wid
    }
    
    public UnitOfMeasure get_uofm() {
        return uofm;
    }
    public void set_uofm(UnitOfMeasure uofm) {
        this.uofm = uofm;
    }
    
    /*end getters and setters*/

}