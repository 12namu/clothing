package com.tree.clothing.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Data
public class Content {

    @Column(length = 500)
    private String mediaUri;

    @Column(length = 500)
    private String orgFileName;

    @Enumerated(EnumType.STRING)
    private MediaType mediaType;

    @Column(length = 4000)
    private String description;

    @Column(length = 500)
    private String videoThumbnail;
}
