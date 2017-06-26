package com.example.nguyenhoangtrongnghia.weathercity.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import com.example.nguyenhoangtrongnghia.weathercity.R;
import com.example.nguyenhoangtrongnghia.weathercity.models.CityModel;

import java.util.List;

import butterknife.ButterKnife;
import butterknife.InjectView;

/**
 * Created by nguyenhoangtrongn/21/17.
 */

public class CityListAdapter extends RecyclerView.Adapter<CityListAdapter.ViewHolder>{
    @InjectView(R.id.cityName)
    TextView txtCityName;
    private List<CityModel> cityList;

    public static class ViewHolder extends RecyclerView.ViewHolder {

        public ViewHolder(View itemView) {
            super(itemView);
            ButterKnife.inject(this,itemView);
        }
    }

    public CityListAdapter(List<CityModel> cityList) {
        this.cityList = cityList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.city_list_item, parent, false);

        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return cityList.size();
    }

}
