package com.trackService.entities;

import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import java.io.Serializable;
import java.util.UUID;

@Table
public class track implements Serializable {

    @PrimaryKey
    private UUID uuid;

    @Column
    private String artist;

    @Column
    private String name;

    @Column
    private String albumName;

    @Column
    private String track_number;

    @Column
    private String uri;
}
