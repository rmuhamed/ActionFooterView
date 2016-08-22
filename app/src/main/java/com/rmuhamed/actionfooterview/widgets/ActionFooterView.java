package com.rmuhamed.actionfooterview.widgets;

import android.content.Context;
import android.support.v7.widget.LinearLayoutCompat;
import android.util.AttributeSet;
import android.view.Gravity;
import android.widget.LinearLayout;

import com.rmuhamed.actionfooterview.listeners.AbstractAction;

import java.util.List;
import java.util.Locale;

/**
 * Created by rmuhamed on sábado.
 */
public class ActionFooterView extends LinearLayout {
    public static final int DEFAULT_CHILD_COUNT = 3;

    public ActionFooterView(Context context, List<AbstractAction> listeners) {
        super(context);

        this.prepareView(context, listeners, DEFAULT_CHILD_COUNT);
    }

    private void prepareView(Context context, List<AbstractAction> actions, int childCount) {
        this.setLayoutParams(new LinearLayoutCompat.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        this.setOrientation(LinearLayout.HORIZONTAL);

        this.setGravity(Gravity.CENTER_HORIZONTAL);

        this.addChildViews(context, actions, childCount);
    }

    private void addChildViews(Context c, List<AbstractAction> actions, int n) {
        for (int i = 0; i < n; i++) {
            ActionButtonView b = new ActionButtonView(c, actions.get(i));
            b.setText(String.format(Locale.getDefault(), "Action %d", i));
            this.addView(b);
        }
    }
}
