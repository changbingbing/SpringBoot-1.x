package prod.properties;
/**
 * @author changbingbing
 * 2018年11月29日
 */

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class NeoProperties {

	@Value("${com.neo.title}")
	private String title;
	@Value("${com.neo.description}")
	private String description;
}
