package pro.sky.skyprospringtyulkovhw211;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/order")
public class BasketController {

    private final BasketServiceImpl basketService;

    public BasketController(BasketServiceImpl basketService) {
        this.basketService = basketService;
    }

    @GetMapping("/add")
    public List<Integer> add(@RequestParam("id") List<Integer> id) {
        return basketService.add(id);
    }

    @GetMapping("/get")
    public List<Integer> get() {
        return basketService.get();
    }
}