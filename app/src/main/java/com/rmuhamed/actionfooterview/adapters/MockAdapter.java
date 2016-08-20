package com.rmuhamed.actionfooterview.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import com.rmuhamed.actionfooterview.model.MockObject;

import java.util.List;

/**
 * Created by rmuhamed on sábado.
 */
public class MockAdapter extends RecyclerView.Adapter<MockViewHolder>{
    private final List<MockObject> items;

    public MockAdapter(List<MockObject> items) {
        this.items = items;
    }

    @Override
    public MockViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(MockViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
