package myProductApp;

import java.util.List;

//import javax.persistence.Query;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

import myProductAppDAO.ProductDAO;
import myProductAppEntity.Product;

@Controller
public class ProductController {
	ProductDAO dao = new ProductDAO();

	@RequestMapping("/")
	public String home(Model model) {
		List<Product> products = dao.getAllProduct();
		model.addAttribute("products", products);
		return "index";
	}

	@RequestMapping("/addproduct")
	public String addProduct(Model model) {
		model.addAttribute("title", "Add Product");
		return "addproduct";
	}

	@RequestMapping(path = ("/handle"), method = RequestMethod.POST)
	public RedirectView handleProduct(@ModelAttribute Product product, HttpServletRequest request) {
		System.out.println(product);
		dao.SaveProduct(product);
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(request.getContextPath() + "/");
		return redirectView;
	}

	@RequestMapping("/delete/{productId}")
	public RedirectView handleProduct(@PathVariable("productId") int pid, HttpServletRequest request) {
		this.dao.DeleteProduct(pid);
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(request.getContextPath() + "/");
		return redirectView;
	}

	@RequestMapping("update/{productId}")
	public String updateForm(@PathVariable("productId") int id, Model model) {
		Product product = this.dao.getProductbyID(id);
		model.addAttribute("products", product);
		return "updateProduct";

	}

	@RequestMapping(path = ("/form"), method = RequestMethod.POST)
	public RedirectView updateProduct(@ModelAttribute Product product, HttpServletRequest request) {
		System.out.println(product);
		this.dao.updateProduct(product);
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(request.getContextPath() + "/");
		return redirectView;
	}
}
