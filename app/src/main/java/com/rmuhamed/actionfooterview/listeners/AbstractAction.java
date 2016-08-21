package com.rmuhamed.actionfooterview.listeners;

import com.rmuhamed.actionfooterview.adapters.MockAdapter;

/**
 * Created by rmuhamed on sábado.
 */
public abstract class AbstractAction {
    protected MockAdapter adapter;

    public AbstractAction(MockAdapter adapter) {
        this.adapter = adapter;
    }

    public abstract void performAction();
}
