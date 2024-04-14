package net.ksysproject.springdocexample.front.data;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;
import lombok.Value;

@Value
public class LoginInputObject {
    @NotNull
    @Schema(title = "ログインID", description = "ユーザーとして一意になる文字列")
    private String loginId;

    @NotNull
    @Schema(title = "パスワード", description = "ユーザーの本人確認に使用する文字列")
    private String password;
}
