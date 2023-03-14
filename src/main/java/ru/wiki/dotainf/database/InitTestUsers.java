package ru.wiki.dotainf.database;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import ru.wiki.dotainf.database.tables.JwtUser;
import ru.wiki.dotainf.service.JwtUserService;
import ru.wiki.dotainf.utilities.role.JwtRole;

import java.util.Set;

@Component
@RequiredArgsConstructor
public class InitTestUsers implements CommandLineRunner {
    private final JwtUserService jwtUserService;
    private final PasswordEncoder passwordEncoder;

    @Override
    public void run(String... args) {
        if (jwtUserService.findJwtUserByEmail("admin@test.com").isEmpty()) {
            JwtUser user = jwtUserService.save(JwtUser.builder()
                    .username("Admin")
                    .email("admin@test.com")
                    .password(passwordEncoder.encode("test123"))
                    .role(Set.of(JwtRole.ROLE_ADMIN, JwtRole.ROLE_USER))
                    .build());
            user.setEnabled(true);
            jwtUserService.save(user);
        }

        if (jwtUserService.findJwtUserByEmail("user@test.com").isEmpty()) {
            JwtUser user = jwtUserService.save(JwtUser.builder()
                    .username("User")
                    .email("user@test.com")
                    .password(passwordEncoder.encode("test123"))
                    .role(Set.of(JwtRole.ROLE_USER))
                    .build());
            user.setEnabled(true);
            jwtUserService.save(user);
        }
    }
}
