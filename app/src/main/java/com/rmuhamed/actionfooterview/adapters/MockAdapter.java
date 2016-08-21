package com.rmuhamed.actionfooterview.adapters;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.rmuhamed.actionfooterview.R;
import com.rmuhamed.actionfooterview.listeners.AbstractAction;
import com.rmuhamed.actionfooterview.model.MockObject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rmuhamed on sábado.
 */
public class MockAdapter extends RecyclerView.Adapter<MockViewHolder> {
    public static final String LOG_TAG = MockAdapter.class.getSimpleName();

    private final List<MockObject> items;
    private List<AbstractAction> actions;

    public MockAdapter(List<MockObject> items) {
        this.items = items;
        this.actions = new ArrayList<>();
    }

    @Override
    public MockViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_item, null);

        return new MockViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MockViewHolder holder, int position) {
        MockObject aMockObject = this.items.get(position);
        holder.label.setText(aMockObject.getText());
    }

    @Override
    public int getItemCount() {
        return (null != this.items ? this.items.size() : 0);
    }

    public void doUpdate() {
        Log.d(LOG_TAG, "UPDATE ACTION");
    }

    public void doDelete() {
        Log.d(LOG_TAG, "DELETE ACTION");
    }

    public void doCreate() {
        Log.d(LOG_TAG, "CREATE ACTION");
    }

    public void addObservedEvent(AbstractAction action) {
        this.actions.add(action);
    }

    public List<AbstractAction> getObservedEvents() {
        return this.actions;
    }
}
