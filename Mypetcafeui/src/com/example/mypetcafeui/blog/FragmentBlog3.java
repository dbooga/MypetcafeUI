package com.example.mypetcafeui.blog;

import com.example.mypetcafeui.R;
import com.example.mypetcafeui.R.layout;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
 
public class FragmentBlog3 extends Fragment {
 
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
 
        View rootView = inflater.inflate(R.layout.fragment_blog3, container, false);
         
        return rootView;
    }
}