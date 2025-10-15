package br.com.fiap.mindtekker_api.config.security;

import br.com.fiap.mindtekker_api.model.Device;
import br.com.fiap.mindtekker_api.repository.DeviceRepository;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;

@Component
public class TokenVerify extends OncePerRequestFilter {

    @Autowired
    private TokenService tokenService;

    @Autowired
    private DeviceRepository deviceRepository;

    @Override
    protected void doFilterInternal(
            HttpServletRequest request,
            HttpServletResponse response,
            FilterChain filterChain) throws ServletException, IOException {

        String authorization = request.getHeader("Authorization");

        if (authorization != null && authorization.startsWith("Bearer ")) {
            String token = authorization.replace("Bearer ", "").trim();
            String uuidDevice = tokenService.validarToken(token);

            if (!uuidDevice.isEmpty()) {
                Device device = deviceRepository.findByUuidDevice(uuidDevice)
                        .orElse(null);

                if (device != null) {
                    UsernamePasswordAuthenticationToken authentication =
                            new UsernamePasswordAuthenticationToken(device, null, device.getAuthorities());
                    SecurityContextHolder.getContext().setAuthentication(authentication);
                }
            }
        }

        filterChain.doFilter(request, response);
    }
}
