package com.rmuhamed.actionfooterview.model;

import java.util.UUID;

/**
 * Created by rmuhamed on sábado.
 */
public class MockObject {
    public static final String SOME_ELEMENT_TEXT = "SOME ELEMENT";
    private String id;

    private String text;

    public MockObject() {
        this.id = UUID.randomUUID().toString();
        this.text = SOME_ELEMENT_TEXT;
    }

    public String getText() {
        return this.text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object obj) {
        return this.id.equals(((MockObject) obj).getId());
    }
}
