package com.pluralsight.conferencespringboot.models;

import javax.persistence.Entity;

@Entity(name = "sessions")
public class Session {
    private Long session_id;
    private String session_name;
    private String session_description;
    private Integer session_length;

    public Session() {}
}
