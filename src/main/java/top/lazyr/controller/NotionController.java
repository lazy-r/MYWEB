package top.lazyr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lazyr
 * @created 2022/6/6
 */
@RestController
@RequestMapping("/notion")
public class NotionController {

    @GetMapping("/movie")
    public Map<String, Object> getVideoNames(String keyword) {
        System.out.println("keyword = " + keyword);
        return new HashMap<>();
    }
}
