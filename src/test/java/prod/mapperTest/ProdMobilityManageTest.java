package prod.mapperTest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import prod.dao.local.one.ProdMobilityManageMapper;
import prod.domain.entity.ProdMobilityManage;

/**
 * @author changbingbing
 * 2018年12月3日
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProdMobilityManageTest {

	@Autowired
	private ProdMobilityManageMapper prodMobilityManageMapper;
	
	@Test
	public void selectByPrimaryKeyTest() {
		ProdMobilityManage mobilityManage = this.prodMobilityManageMapper.selectByPrimaryKey(94l);
		System.out.println(mobilityManage.toString());
	}
}
