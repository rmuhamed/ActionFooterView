package com.rmuhamed.actionfooterview.widgets;

import android.content.Context;
import android.view.View;
import android.widget.Button;

import com.rmuhamed.actionfooterview.listeners.ActionListener;

/**
 * Created by rmuhamed on sábado.
 */
public class ActionButtonView extends Button implements View.OnClickListener {
    private final ActionListener actionListener;

    public ActionButtonView(Context context, ActionListener listener) {
        super(context);
        this.actionListener = listener;

        this.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        this.actionListener.performAction();
    }
}
