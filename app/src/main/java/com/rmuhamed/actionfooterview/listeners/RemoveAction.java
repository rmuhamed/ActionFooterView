package com.rmuhamed.actionfooterview.listeners;

import com.rmuhamed.actionfooterview.adapters.MockAdapter;

/**
 * Created by rmuhamed on sábado.
 */
public class RemoveAction extends AbstractAction {

    public RemoveAction(MockAdapter adapter) {
        super(adapter);
    }

    @Override
    public void performAction() {
        this.adapter.doDelete();
    }
}
