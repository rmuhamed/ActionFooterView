package com.rmuhamed.actionfooterview.listeners;

import com.rmuhamed.actionfooterview.adapters.MockAdapter;

/**
 * Created by rmuhamed on sábado.
 */
public class CreateAction extends AbstractAction {

    public CreateAction(MockAdapter adapter) {
        super(adapter);
    }

    @Override
    public void performAction() {
        this.adapter.doCreate();
    }
}
