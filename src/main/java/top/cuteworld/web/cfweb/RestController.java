package top.cuteworld.web.cfweb;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @GetMapping(value = "info-json")
    public List<Header> headers(@RequestHeader Map<String, String> headers) {
        ModelAndView modelAndView = new ModelAndView("/info");
        List<Header> list = new ArrayList<>();
        for (String key : headers.keySet()) {
            list.add(Header.builder().key(key).value(headers.get(key)).build());
        }
        return list;
    }
}
