package ai.jobiak.lombok.model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
//@ReqArgsConstructor
@Data
public class Customer {
	
	@Setter
	@Getter
	private long cusId;
	@Setter
	@Getter
	private  String name;
	@Setter
	@Getter
	private double balance;
	

}
