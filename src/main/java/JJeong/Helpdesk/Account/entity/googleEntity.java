package JJeong.Helpdesk.Account.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.management.relation.Role;
import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class googleEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long googleId;

    @Column(nullable = false)
    private String googleName;

    @Column(nullable = false)
    private String googleEmail;

    @Column(nullable = false)
    private String picture;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Role role;

    @Builder
    public googleEntity(Long googleId, String googleName, String googleEmail, Role role) {
        this.googleId = googleId;
        this.googleName = googleName;
        this.googleEmail = googleEmail;
        this.role = role;
    }
    public googleEntity update(String name, String picture){
        this.googleName = googleName;
        this.picture = picture;
        return this;

    }
//    public String getRoleKey(){
////        return this.role.getKey();
//    }
}