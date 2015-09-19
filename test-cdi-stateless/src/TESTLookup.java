import java.util.Set;

import javax.enterprise.context.spi.CreationalContext;
import javax.enterprise.inject.spi.Bean;
import javax.enterprise.inject.spi.BeanManager;
import javax.inject.Inject;
import javax.naming.InitialContext;

public class TESTLookup {

	public void coolStuff() {
		try {
			BeanManager manager = (BeanManager) new InitialContext()
					.lookup("java:comp/BeanManager");
			Object test = null;
			Set<Bean<?>> beans = manager.getBeans(StatelessBean.class);
			Bean<?> bean = manager.resolve(beans);
			CreationalContext<?> ctx = manager.createCreationalContext(bean);
			test = manager.getReference(bean, StatelessBean.class, ctx);
			StatelessBean statelessBean = (StatelessBean) test;
			System.out.println(statelessBean.getI());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
