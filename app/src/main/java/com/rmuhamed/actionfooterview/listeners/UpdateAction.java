package com.rmuhamed.actionfooterview.listeners;

import com.rmuhamed.actionfooterview.adapters.MockAdapter;

/**
 * Created by rmuhamed on sábado.
 */
public class UpdateAction extends AbstractAction {

    public UpdateAction(MockAdapter adapter) {
        super(adapter);
    }

    @Override
    public void performAction() {
        this.adapter.doUpdate();
    }
}
