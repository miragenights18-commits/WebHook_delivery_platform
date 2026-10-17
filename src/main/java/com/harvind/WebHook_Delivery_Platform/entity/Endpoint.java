package com.harvind.WebHook_Delivery_Platform.entity;


import jakarta.persistence.*;

import java.time.Instant;
import  java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;
import org.springframework.stereotype.Component;

@Entity
@Table
public class Endpoint {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long  id;

    @Column(nullable = false,length = 100)
    String name;
    @Column(nullable = false,length = 500)
    String url;

    public String getUrl() {
        return url;
    }
    @CreationTimestamp
    @Column(nullable = false,updatable = false)
    private Instant createdAt;

    public void setUrl(String url) {
        this.url = url;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }





}
