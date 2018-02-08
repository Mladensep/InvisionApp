package com.example.invisionapp.activity.activity.adapter;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.invisionapp.R;
import com.example.invisionapp.activity.activity.activity.ContactDetailPageActivity;
import com.example.invisionapp.activity.activity.activity.NewNavigationActivity;
import com.example.invisionapp.activity.activity.model.Landscape;

import java.util.List;


public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.MyViewHolder> {
	List<Landscape> mData;
	private LayoutInflater inflater;
	private Context context;
	long highScore;



	public RecyclerAdapter(Context context, List<Landscape> data) {
		inflater = LayoutInflater.from(context);
		this.mData = data;
	}

	@Override
	public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
		View view = inflater.inflate(R.layout.activity_main_list_item, parent, false);
		MyViewHolder holder = new MyViewHolder(view);
		return holder;
	}

	@Override
	public void onBindViewHolder(MyViewHolder holder, final int position) {
		Landscape current = mData.get(position);
		holder.setData(current, position);
		holder.setListeners();

		SharedPreferences sharedPref5 = context.getSharedPreferences("naziv1", Context.MODE_PRIVATE);
		highScore = sharedPref5.getInt("edit1", 7);

		holder.mRootView.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {

				if (position == 1 && highScore == 5) {
					final Intent intent;
					intent = new Intent(context, ContactDetailPageActivity.class);
					context.startActivity(intent);
				}
			}
		});
	}

	@Override
	public int getItemCount() {
		return mData.size();
	}

	public void removeItem(int position) {
		mData.remove(position);
		notifyItemRemoved(position);
		notifyItemRangeChanged(position, mData.size());
	}

	public void addItem(int position, Landscape landscape) {
		mData.add(position, landscape);
		notifyItemInserted(position);
		notifyItemRangeChanged(position, mData.size());
	}

	class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
		TextView title;
		ImageView imgThumb, imgDelete, imgAdd;
		int position;
		Landscape current;

		protected View mRootView;

		public MyViewHolder(View itemView) {
			super(itemView);

			context = itemView.getContext();

			title       = (TextView)  itemView.findViewById(R.id.tvTitle);
			imgThumb    = (ImageView) itemView.findViewById(R.id.img_row);

			mRootView = itemView;
		}

		public void setData(Landscape current, int position) {
			this.title.setText(current.getTitle());
			this.imgThumb.setImageResource(current.getImageID());
			this.position = position;
			this.current = current;
		}

		public void setListeners() {}

		@Override
		public void onClick(View view) {

		}
	}
}
