package com.rmuhamed.actionfooterview.widgets;

import android.content.Context;
import android.view.View;
import android.widget.Button;

import com.rmuhamed.actionfooterview.listeners.AbstractAction;

/**
 * Created by rmuhamed on sábado.
 */
public class ActionButtonView extends Button implements View.OnClickListener {
    private final AbstractAction abstractAction;

    public ActionButtonView(Context context, AbstractAction listener) {
        super(context);
        this.abstractAction = listener;

        this.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        this.abstractAction.performAction();
    }
}
