package com.springboot.api.controller;

import com.springboot.api.domain.dto.MemberDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;


@RestController
@RequestMapping("/api/v1/put-api")
public class PutController {

    @RequestMapping(value="/domain", method= RequestMethod.PUT)
    public String postExample() {
        return "Hello PUT Api";
    }

    @PutMapping(value="/member")
    public String postArbitraryParam(@RequestBody Map<String, Object> postData) {
        StringBuilder sb = new StringBuilder();

        postData.entrySet().forEach(map->{
            sb.append(map.getKey() + " : " + map.getValue() + "\n");
        });

        return sb.toString();
    }

    @PutMapping("/member2")
    public MemberDto postArbitraryParamWithDto(@RequestBody MemberDto memberDto) {
        return memberDto;
    }

    @PutMapping("/member3")
    public ResponseEntity<MemberDto> putNumber(@RequestBody MemberDto memberDto) {
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(memberDto);
    }
}
