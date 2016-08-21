package com.rmuhamed.actionfooterview.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;

import com.rmuhamed.actionfooterview.listeners.AbstractAction;

import java.util.List;
import java.util.Locale;

/**
 * Created by rmuhamed on sábado.
 */
public class ActionFooterView extends LinearLayout {

    private List<AbstractAction> actionListeners;

    public ActionFooterView(Context context, List<AbstractAction> listeners) {
        super(context);

        this.actionListeners = listeners;

        this.addChildViews(context, 3);
    }

    public ActionFooterView(Context context, AttributeSet attrs, int numberOfViews) {
        super(context, attrs);

        this.addChildViews(context, numberOfViews);
    }

    private void addChildViews(Context c, int n) {
        for (int i = 0; i < n; i++) {
            ActionButtonView b = new ActionButtonView(c, this.actionListeners.get(i));
            b.setText(String.format(Locale.getDefault(), "Action %d", i));
            this.addView(b);
        }
    }
}
