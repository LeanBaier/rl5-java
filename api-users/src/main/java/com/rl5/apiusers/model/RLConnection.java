package com.rl5.apiusers.model;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
@Table(name = "connections")
public class RLConnection implements Serializable{

    @Id
    @Column(name = "id_connection")
    private UUID idConecction;
    
    @ManyToOne
    @JoinColumn(name = "id_user")
    private RLUser user;

    @Column(name = "connect_at")
    private LocalDateTime connectAt;
    
    @Column(name = "ended_at")
    private LocalDateTime endedAt;
    
}
