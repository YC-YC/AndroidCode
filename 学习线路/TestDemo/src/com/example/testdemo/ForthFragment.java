package com.example.testdemo;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.arcmenu.ArmMenuActivity;
import com.example.customerview.CustomActivity;
import com.example.list.ListActivity;
import com.example.slidingMenu.SlidingActivity;
import com.example.testdemo.second.base.DynamicFragmentActivity;
import com.example.testdemo.second.base.StaticFragmentActivity;

public class ForthFragment extends Fragment implements OnClickListener{

	private Button for_button1;
	private Button for_button2;
	private Button for_button3;
	private Button for_button4;
	private Button for_button5;
	private Button for_button6;
	private View mView;
	
	private Context mContext;
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		
		mView = inflater.inflate(R.layout.forth_main, null);
		mContext = mView.getContext();
		initView();
		return mView;
	}
	private void initView() {
		for_button1 = (Button) mView.findViewById(R.id.for_button1);
		for_button1.setOnClickListener(this);

		for_button2 = (Button) mView.findViewById(R.id.for_button2);
		for_button2.setOnClickListener(this);
		
		for_button3 = (Button) mView.findViewById(R.id.for_button3);
		for_button3.setOnClickListener(this);

		for_button4 = (Button) mView.findViewById(R.id.for_button4);
		for_button4.setOnClickListener(this);
		
		for_button5 = (Button) mView.findViewById(R.id.for_button5);
		for_button5.setOnClickListener(this);
		
		for_button6 = (Button) mView.findViewById(R.id.for_button6);
		for_button6.setOnClickListener(this);
		
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.for_button1:
			startActivity(new Intent(mContext, ListActivity.class));
			break;
		case R.id.for_button2:
			startActivity(new Intent(mContext, CustomActivity.class));
			break;
		case R.id.for_button3:
			startActivity(new Intent(mContext, SlidingActivity.class));
			break;
		case R.id.for_button4:
			startActivity(new Intent(mContext, ArmMenuActivity.class));
			break;
		case R.id.for_button5:
			startActivity(new Intent(mContext, StaticFragmentActivity.class));
			break;
		case R.id.for_button6:
			startActivity(new Intent(mContext, DynamicFragmentActivity.class));
			break;
		default:
			break;
		}
	}
}
