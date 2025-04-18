package web.security.laba1.config;

/*
    @author boguc
    @project laba1
    @class AuditorAwareImpl
    @version 1.0.0
    @since 27.03.2025 - 11.42
*/

import org.springframework.data.domain.AuditorAware;

import java.util.Optional;

public class AuditorAwareImpl implements AuditorAware<String> {
    @Override
    public Optional<String> getCurrentAuditor() {
        return Optional.of(System.getProperty("user.name"));
    }
}
