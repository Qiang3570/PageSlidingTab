package com.johnny.pageslidingtab.ui.fragment;

import android.os.SystemClock;
import android.view.View;
import android.widget.TextView;

import com.johnny.pageslidingtab.utils.CommonUtil;

public class OneFragment extends BaseFragment {

    @Override
    protected View getSuccessView() {
        TextView textView = new TextView(getActivity());
        textView.setText("第一页");
        return textView;
    }

    @Override
    protected Object requestData() {
        SystemClock.sleep(1000);/*模拟请求服务器的延时过程*/
        return "";/*加载成功*/
    }
}
