import javax.ejb.Stateless;


@Stateless
public class StatelessBean {

	private int value;

	public int getI(){
		return ++value;
	}
}
