package example.micronaut;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;

@Getter
public class TestClass {

    @Schema(description = "Message")
    String message;
}
