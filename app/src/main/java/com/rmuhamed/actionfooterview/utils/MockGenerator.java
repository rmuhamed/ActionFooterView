package com.rmuhamed.actionfooterview.utils;

import com.rmuhamed.actionfooterview.model.MockObject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rmuhamed on sábado.
 */
public final class MockGenerator {

    public static List<MockObject> generate() {
        List<MockObject> mocks = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            MockObject mo = new MockObject();
            mocks.add(mo);
        }

        return mocks;
    }
}
