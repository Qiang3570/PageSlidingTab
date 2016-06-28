package com.johnny.pageslidingtab.ui.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public abstract class BaseFragment extends Fragment {
    protected ContentPage contentPage;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        contentPage = new ContentPage(getActivity()) {
            @Override
            public Object loadData() {
                return requestData();
            }

            @Override
            public View createSuccessView() {
                return getSuccessView();
            }
        };
        return contentPage;
    }

    /**
     * 每个子fragment去实现对应的成功View
     * @return
     */
    protected abstract View getSuccessView();

    /**
     * 每个子fragment去实现请求数据的过程
     * @return
     */
    protected abstract Object requestData();
}