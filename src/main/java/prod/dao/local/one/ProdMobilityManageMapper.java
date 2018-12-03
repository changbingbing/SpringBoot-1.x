package prod.dao.local.one;

import prod.domain.entity.ProdMobilityManage;

public interface ProdMobilityManageMapper {
    int deleteByPrimaryKey(Long id);

    int insert(ProdMobilityManage record);

    int insertSelective(ProdMobilityManage record);

    ProdMobilityManage selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ProdMobilityManage record);

    int updateByPrimaryKey(ProdMobilityManage record);
}