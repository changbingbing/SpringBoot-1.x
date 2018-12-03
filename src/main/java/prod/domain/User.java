package prod.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author changbingbing
 * 2018年11月29日
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User {

	private String name;
	private int age;
	private String password;
}
