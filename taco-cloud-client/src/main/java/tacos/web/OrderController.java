package tacos.web;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

import lombok.extern.slf4j.Slf4j;
import tacos.Order;
import tacos.Taco;
//import tacos.Order.Type;

@Slf4j
@Controller
@RequestMapping("/orders")
public class OrderController {
//	@GetMapping("/current")
	private RestTemplate rest = new RestTemplate();
	public String orderForm(Model model) {
		model.addAttribute("order", new Order());
		return "orderForm";
	}

	@PostMapping
	public String processOrder(Order order) {
		log.info("Order submitted: " + order);
		return "redirect:/";

	}
//	//
//	
//	@GetMapping
//	public String showDesignForm(Model model) {
//		model.addAttribute("order", new Order());
//		return "design";
//	}
//
//	private List<Order> filterByType(List<Order> orders, Type type) {
//		List<Order> ingrList = new ArrayList<Order>();
//		for (Order order : orders) {
//			if (order.getType().equals(type))
//
//				ingrList.add(order);
//		}
//		return ingrList;
//	}
//
//	@PostMapping
//	public String processDesign(@RequestParam("ingredients") String ingredientIds, @RequestParam("name") String name) {
//		List<Ingredient> ingredients = new ArrayList<Ingredient>();
//		for (String ingredientId : ingredientIds.split(",")) {
//			Ingredient ingredient = rest.getForObject("http://localhost:8080/ingredients/{id}", Ingredient.class,
//					ingredientId);
//			ingredients.add(ingredient);
//		}
//		Taco taco = new Taco();
//		taco.setName(name);
//		taco.setIngredients(ingredients);
//		System.out.println(taco);
//		rest.postForObject("http://localhost:8080/design", taco, Taco.class);
//		return "redirect:/orders/current";
//	}
}
