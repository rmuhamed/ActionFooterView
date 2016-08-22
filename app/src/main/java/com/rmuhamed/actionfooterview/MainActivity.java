package com.rmuhamed.actionfooterview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.LinearLayout;

import com.rmuhamed.actionfooterview.adapters.MockAdapter;
import com.rmuhamed.actionfooterview.listeners.CreateAction;
import com.rmuhamed.actionfooterview.listeners.RemoveAction;
import com.rmuhamed.actionfooterview.listeners.UpdateAction;
import com.rmuhamed.actionfooterview.utils.MockGenerator;
import com.rmuhamed.actionfooterview.widgets.ActionFooterView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.recycler)
    public RecyclerView recyclerView;

    @BindView(R.id.root)
    public LinearLayout rootView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        MockAdapter adapter = new MockAdapter(MockGenerator.generate());

        this.recyclerView.setAdapter(adapter);
        this.recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, true));

        adapter.addObservedEvent(new UpdateAction(adapter));
        adapter.addObservedEvent(new RemoveAction(adapter));
        adapter.addObservedEvent(new CreateAction(adapter));

        this.rootView.addView(new ActionFooterView(this, adapter.getObservedEvents()));
    }
}
