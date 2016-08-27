package com.rmuhamed.actionfooterview.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Created by rmuhamed on sábado.
 */
public class Mockup {

    public static class Generator {
        public List<MockObject> generate() {
            List<MockObject> mocks = new ArrayList<>();
            for (int i = 0; i < 10; i++) {
                MockObject mo = MockObject.getInstance();
                mocks.add(mo);
            }

            return mocks;
        }
    }

    public static class MockObject {
        public static final String SOME_ELEMENT_TEXT = "SOME ELEMENT";
        private static MockObject instance;

        private String id;

        private String text;

        public static MockObject getInstance() {
            if (instance == null) {
                instance = new MockObject();
            }
            return instance;
        }

        MockObject() {
            this.id = UUID.randomUUID().toString();
            this.text = SOME_ELEMENT_TEXT;
        }

        public String getText() {
            return this.text;
        }

        public String getId() {
            return this.id;
        }

        @Override
        public boolean equals(Object obj) {
            return this.id.equals(((MockObject) obj).getId());
        }
    }
}
