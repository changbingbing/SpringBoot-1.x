package prod.domain.entity;

import java.math.BigDecimal;
import java.util.Date;

import lombok.Data;

@Data
public class ProdMobilityManage {
    private Long id;

    private Byte platformType;

    private Date prodDate;

    private BigDecimal totalAmount;

    private BigDecimal remainAmount;

    private BigDecimal finishAmount;

    private BigDecimal percent;

    private Byte isDelete;

    private Date createTime;

    private Date updateTime;

    private Long creator;

    private Long updator;

    private Integer version;
}