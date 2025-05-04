package web.security.laba1.auth;

/*
    @author boguc
    @project laba1
    @class AuthenticationRequest
    @version 1.0.0
    @since 30.04.2025 - 23.52
*/

import lombok.Data;
import lombok.NonNull;

@Data
public class AuthenticationRequest {
    private String email;
    private String password;
}
