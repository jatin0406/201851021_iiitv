public class car{
    String name;
    int number;
    String owner;
   private String issuer;
    private int issuer_id;
    //class name and the counstor name can be same as well as different
    car(String name,int number,String owner){
        this.name=name;
        this.number=number;
        this.owner=owner;


    }
    public void car_store(String issuer,int issuer_id)
    {
        this.issuer=issuer;
        this.issuer_id=issuer_id;


    }
    public void car_store(String issuer){
        this.issuer=issuer;
    }
    public void car_store(int issuer_id){
        this.issuer_id=issuer_id;
    }

}