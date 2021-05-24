package project9;
import java.io.Serializable;

public class Order implements Serializable {

    private static final long serialVersionUID = 1L;
    private String pname;
    private int id;
    private String cname;

    Order() {
    	Order.sort(id);
    };

    private static void sort(int id2) {
		// TODO Auto-generated method stub
		
	}

	Order(String pname, int id, String cname) {
        this.pname = pname;
        this.id = id;
        this.cname = cname;
    }

    @Override
    public String toString() {
        return "ID:" + id + "\nProduct Name: " + pname ;
    }
}