package project9;
import java.io.Serializable;

public class Order implements Serializable {

    private static final long serialVersionUID = 1L;
    private String pname;
    private int id;
    private static String cname;
//this variable will not be serialized
    
    Order() {
    	Order.sort(id);
    };

    private static void sort(int id2) {
		// TODO Auto-generated method stub
		
	}

	Order(String pname, int id, String cname) {
        this.pname = pname;
        this.id = id;
         Order.cname = cname;
    }

    @Override
    public String toString() {
        return "ID:" + id + "\nProduct Name: " + pname ;
    }
}