package finalproject.jpnshop.web.controller;

import finalproject.jpnshop.biz.domain.Category;
import finalproject.jpnshop.biz.repository.CategoryRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class CategoryController {

    private final CategoryRepository categoryRepository;

    @GetMapping("/category")
    public List<Category> getCategory() {
        return categoryRepository.findAll();
    }

}
