package com.rl5.apiusers.model;

import java.io.Serializable;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Entity
@Table(name = "rl_users")
public class RLUser implements Serializable {

    @Id
    @Column(name = "id_user")
    private UUID idUser;
    private String email;
    private String nickname;
    private String password;

    @ManyToOne
    @JoinColumn(name = "id_role")
    private RLRole role;

}
