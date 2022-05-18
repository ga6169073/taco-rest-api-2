package tacos;

import java.sql.Date;
import java.util.List;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import tacos.Ingredient.Type;

@Data
@RequiredArgsConstructor
@NoArgsConstructor(force = true)
public class Ingredient {
	private final String id;
	private final String name;
	private final Type type;

	public static enum Type {
		WRAP, PROTEIN, VEGGIES, CHEESE, SAUCE
	}
}