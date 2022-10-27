package com.springboot.api.controller;

import com.springboot.api.domain.dto.MemberDto;
import org.springframework.web.bind.annotation.*;

import java.util.Map;


@RestController
@RequestMapping("/api/v1/get-api")
public class PostController {

    @RequestMapping(value="/domain", method= RequestMethod.POST)
    public String postExample() {
        return "Hello POST Api";
    }

    @PostMapping(value="/member")
    public String postArbitraryParam(@RequestBody Map<String, Object> postData) {
        StringBuilder sb = new StringBuilder();

        postData.entrySet().forEach(map->{
            sb.append(map.getKey() + " : " + map.getValue() + "\n");
        });

        return sb.toString();
    }

    @PostMapping("/member2")
    public String postArbitraryParamWithDto(@RequestBody MemberDto memberDto) {
        return memberDto.toString();
    }
}
