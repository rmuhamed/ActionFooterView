package com.rmuhamed.actionfooterview.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.rmuhamed.actionfooterview.R;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by rmuhamed on sábado.
 */
public class MockViewHolder extends RecyclerView.ViewHolder {
    @BindView(R.id.item_label)
    public TextView label;

    public MockViewHolder(View itemView) {
        super(itemView);

        ButterKnife.bind(this, itemView);
    }
}
