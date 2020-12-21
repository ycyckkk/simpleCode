package com.yc.websocket;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author yucheng
 * @Date 2020/12/21 21:05
 */
@Controller
public class WebSocketController {
    @RequestMapping("/websocket")
    public String sayHello() {
        return "ws-broadcast";
    }
}
