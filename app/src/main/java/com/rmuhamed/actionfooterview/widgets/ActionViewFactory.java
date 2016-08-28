package com.rmuhamed.actionfooterview.widgets;

import android.content.Context;

import com.rmuhamed.actionfooterview.listeners.AbstractAction;

/**
 * Created by rmuhamed on sábado.
 */
public final class ActionViewFactory {

    public static ActionView create(ActionViewType actionViewType, Context context, AbstractAction anAbstractAction) {
        ActionView anActionView = null;

        if (actionViewType.getValue().equals(ActionViewType.BUTTON.getValue())) {
            anActionView = new ActionButtonView(context, anAbstractAction);
        }

        return anActionView;
    }
}
