package com.example.nguyenhoangtrongnghia.weathercity.models;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import com.example.nguyenhoangtrongnghia.weathercity.MainActivity;
import com.example.nguyenhoangtrongnghia.weathercity.R;
import com.example.nguyenhoangtrongnghia.weathercity.Utils.Constant;
import com.example.nguyenhoangtrongnghia.weathercity.Utils.Utils;
import com.example.nguyenhoangtrongnghia.weathercity.adapter.CityListAdapter;

import java.util.ArrayList;
import java.util.List;

import butterknife.InjectView;

/**
 * Created by nguyenhoangtrongnghia on 7/11/17.
 */

public class HomeFragment extends Fragment {

    @InjectView(R.id.city_recycler_view)
    RecyclerView recyclerView;
    private LinearLayoutManager layoutMgr = null;

    private List<CityModel> mDataList = null;
    private CityListAdapter mAdapter = null;

    private MainActivity mainNavigationDrawer;
    public HomeFragment(MainActivity mainNavi) {
        this.mainNavigationDrawer = mainNavi;
    }
    public HomeFragment(){

    }
    public static Fragment newInstance(Context context) {
        HomeFragment f = new HomeFragment();
        return f;
    }
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(
                R.layout.content_main, container, false);
        if(Utils.checkNetwork(getActivity())){
            Toast.makeText(getContext(),"Network connected",Toast.LENGTH_LONG);
        }
        else
            Toast.makeText(getContext(),"Network not connect",Toast.LENGTH_LONG);
        return view;
    }

    public void getData(){
        mDataList = new ArrayList<>();

        CityModel city = new CityModel() ;
    }

//    GardensFragment fragment = new GardensFragment();
//
//    public void getViewData(){
//        mAdapter = new ControlGardensAdapter(getActivity(), mDataList);
//        gridView.setAdapter(mAdapter);
//        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                Toast.makeText(getContext(), "You Clicked at " +mDataList.get(position).getNameGarden(), Toast.LENGTH_SHORT).show();
//                getActivity().getSupportFragmentManager().beginTransaction()
//                        .replace(R.id.frame_content_navigation, Fragment.instantiate(getContext(), Constant.FragmentGardens))
//                        .addToBackStack(Constant.FragmentControlGardens)
//                        .commit();
//            }
//        });
//    }
}
