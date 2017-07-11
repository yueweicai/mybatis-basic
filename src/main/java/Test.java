import org.apache.ibatis.session.SqlSession;
import com.orilore.entitys.UOrder;
import com.orilore.mapper.UOrderMapper;
import com.orilore.util.SessionUtil;

public class Test {
	//https://github.com/yueweicai/mybatis-basic.git
	public static void main(String[] args) {
		SqlSession session = SessionUtil.getSession();
		UOrderMapper um = session.getMapper(UOrderMapper.class);
		UOrder bean = new UOrder();
		bean.setPerson("¹Ü²©");
		um.insert(bean);
		session.commit();
//		ProductMapper mapper = session.getMapper(ProductMapper.class);
//		Product bean = new Product();
//		bean.setName("¿µÊ¦¸µÂÌ²è");
//		bean.setPrice(3.0f);
//		bean.setKind("ÒûÁÏ");
//		
//		mapper.insert(bean);
//		
//		System.out.println(bean.getId());
//		session.commit();
//		Product bean = mapper.selectOne(4);
//		System.out.println(bean.getName());
//		
//		List<Product> list = mapper.selectAll();
//		for (Product product : list) {
//			System.out.println(product.getName()+"\t"+product.getPrice());
//		}
		
		session.close();
	}
}
