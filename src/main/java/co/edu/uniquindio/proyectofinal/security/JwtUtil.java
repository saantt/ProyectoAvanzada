package co.edu.uniquindio.proyectofinal.security;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import java.util.Date;
import java.util.function.Function;

import org.bson.types.ObjectId;
import org.springframework.stereotype.Component;

@Component
public class JwtUtil {

    private String secret = "tuClaveSecreta"; // Reemplaza con una clave segura

    // Genera un token JWT
    public String generateToken(ObjectId userId) {
        return Jwts.builder()
                .setSubject(userId.toString()) // Convertir ObjectId a String
                .setIssuedAt(new Date(System.currentTimeMillis()))
                .setExpiration(new Date(System.currentTimeMillis() + 1000 * 60 * 60 * 10)) // 10 horas
                .signWith(SignatureAlgorithm.HS256, secret)
                .compact();
    }

    // Obtiene el nombre de usuario desde el token
    public String getUsernameFromToken(String token) {
        return getClaimFromToken(token, Claims::getSubject);
    }

    // Valida si el token es válido y no está expirado
    public boolean validateToken(String token, String username) {
        final String extractedUsername = getUsernameFromToken(token);
        return (extractedUsername.equals(username) && !isTokenExpired(token));
    }

    // Extrae cualquier "claim" del token
    public <T> T getClaimFromToken(String token, Function<Claims, T> claimsResolver) {
        final Claims claims = getAllClaimsFromToken(token);
        return claimsResolver.apply(claims);
    }

    // Obtiene todos los claims del token
    private Claims getAllClaimsFromToken(String token) {
        return Jwts.parser()
                .setSigningKey(secret)
                .parseClaimsJws(token)
                .getBody();
    }

    // Verifica si el token ha expirado
    private boolean isTokenExpired(String token) {
        return getExpirationDateFromToken(token).before(new Date());
    }

    // Obtiene la fecha de expiración del token
    public Date getExpirationDateFromToken(String token) {
        return getClaimFromToken(token, Claims::getExpiration);
    }

    
}
