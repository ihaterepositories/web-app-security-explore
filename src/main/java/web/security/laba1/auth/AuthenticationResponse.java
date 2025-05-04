package web.security.laba1.auth;

/*
    @author boguc
    @project laba1
    @class AuthenticationResponse
    @version 1.0.0
    @since 30.04.2025 - 23.55
*/

import lombok.*;

@Builder
@Getter
@Setter
public class AuthenticationResponse {
    private String token;
}
