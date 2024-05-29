package spring.security.oauth.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import spring.security.oauth.domain.types.Role;

@Getter
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class User {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String username;
  private String password;
  private Role role;
  private String provider;
  private String providerId;

  @Builder
  public User(Long id, String username, String password, Role role, String provider, String providerId) {
    this.id = id;
    this.username = username;
    this.password = password;
    this.role = role;
    this.provider = provider;
    this.providerId = providerId;
  }
}
