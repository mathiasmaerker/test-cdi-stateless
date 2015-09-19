import javax.ejb.Stateful;
import javax.ejb.Stateless;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;

@Stateful
public class StatelessBean {

	private int value;

	public int getI(){
		return ++value;
	}
}
