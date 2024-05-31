package pro.sky.skyprospringtyulkovhw211;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BasketServiceImpl implements BasketService {

    private final Basket basket;

    public BasketServiceImpl(Basket basket) {
        this.basket = basket;
    }

    public List<Integer> add(List<Integer> id) {
        return basket.add(id);
    }

    public List<Integer> get() {
        return basket.getList();
    }
}