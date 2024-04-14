package net.ksysproject.springdocexample.front.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import net.ksysproject.springdocexample.front.data.LoginInputObject;

@RestController
@Tag(name = "認証認可")
public class LoginController {
    @PostMapping(value = "/authentication/v1/login")
    @Operation(
        summary = "ログインAPI",
        description = "ログイン"
    )
    public void login(@RequestBody LoginInputObject inData) {
        return;
    };
}
