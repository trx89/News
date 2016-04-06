package com.trx.news.pager;

import android.app.Activity;
import android.view.View;
import android.widget.TextView;

import com.trx.news.R;
import com.trx.news.base.BaseMenuDetailPager;
import com.trx.news.domain.NewsMenuData;

public class InteractMenuDetailPager extends BaseMenuDetailPager{

	public InteractMenuDetailPager(Activity activity) {
		// TODO Auto-generated constructor stub
		super(activity);
	}
	
	@Override
	public View initView() {
		// TODO Auto-generated method stub
		TextView tvView = new TextView(mActivity);
		tvView.setText("互动");
		return tvView;
	}

	@Override
	public void initData() {
		// TODO Auto-generated method stub
		super.initData();
	}

}
