package com.rmuhamed.actionfooterview.listeners;

import com.rmuhamed.actionfooterview.adapters.MockAdapter;

/**
 * Created by rmuhamed on sábado.
 *
 * Kind of Visitor class
 */
public abstract class AbstractAction {
    protected MockAdapter adapter;

    public AbstractAction(MockAdapter adapter) {
        this.adapter = adapter;
    }

    /**
     * Kind of "Visit(Element e)"
     */
    public abstract void performAction();
}
