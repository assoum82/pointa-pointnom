package PointA;

/**
 * Created by brahim on 11/5/16.
 */
public class PointA  extends Point{
    private int x , y;
    private String nom;
    public PointA(String nom){
        super();
        this.nom = nom;
    }
    public PointA(int x,String nom ){
        super(x);
        this.nom = nom;
    }
    public PointA(int x, int y,String nom){
        super(x,y);
        this.nom = nom;
    }
    public void afficher(){
        System.out.println(this.nom+" ||"+this.getAbsice()+" "+ this.getOrdone());
    }
}
