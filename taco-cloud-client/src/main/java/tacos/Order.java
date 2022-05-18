//package tacos;
//
//import javax.validation.constraints.Digits;
//import javax.validation.constraints.Pattern;
//import org.hibernate.validator.constraints.CreditCardNumber;
//import javax.validation.constraints.NotBlank;
//import lombok.Data;
//
//@Data
//public class Order {
//	@NotBlank(message = "Name is required")
//	private String name;
//	@NotBlank(message = "Street is required")
//	private String street;
//	@NotBlank(message = "City is required")
//	private String city;
//	@NotBlank(message = "State is required")
//	private String state;
//	@NotBlank(message = "Zip code is required")
//	private String zip;
//	@CreditCardNumber(message = "Not a valid credit card number")
//	private String ccNumber;
//	@Pattern(regexp = "^(0[1-9]|1[0-2])([\\/])([1-9][0-9])$", message = "Must be formatted MM/YY")
//	private String ccExpiration;
//	@Digits(integer = 3, fraction = 0, message = "Invalid CVV")
//	private String ccCVV;
//}
package tacos;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.validation.constraints.Digits;
import javax.validation.constraints.Pattern;
import org.hibernate.validator.constraints.CreditCardNumber;
import org.hibernate.validator.constraints.NotBlank;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor(force=true)
public class Order {
	private Long id; 
	private Date placedAt;
	private String name;
	private String street;
	private String city;
	private String state;
	private String zip;
	private String ccNumber;
	private String ccExpiration;
	private String ccCVV;
	private List<Taco> tacos = new ArrayList<>();
}