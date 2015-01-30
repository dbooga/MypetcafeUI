package com.example.mypetcafeui.blog;

import com.example.mypetcafeui.R;
import com.example.mypetcafeui.R.layout;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
 
public class FragmentBlog1 extends Fragment {
 
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
 
        View rootView = inflater.inflate(R.layout.fragment_blog1, container, false);
		ListView blogList = (ListView) rootView.findViewById(R.id.bloglist);
		
        return rootView;
    }
}