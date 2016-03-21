package org.alfaseo.notforgetix.adapter;

import android.support.v7.widget.RecyclerView;

import org.alfaseo.notforgetix.model.Item;

import java.util.List;

/**
 * Created by Gre on 21.03.2016.
 */
public abstract class TaskAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    List<Item> items;


}
