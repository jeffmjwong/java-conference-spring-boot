package com.pluralsight.conferencespringboot.models;

import javax.persistence.Entity;

@Entity(name = "sessions")
public class Session {
    private Long sessionId;
    private String sessionName;
    private String sessionDescription;
    private Integer sessionLength;

    public Session() {}
}
