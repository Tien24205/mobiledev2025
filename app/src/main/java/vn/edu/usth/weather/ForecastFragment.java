package vn.edu.usth.weather;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class ForecastFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate layout từ XML
        View root = inflater.inflate(R.layout.fragment_forecast, container, false);

        // Lấy các view từ XML
        TextView textView = root.findViewById(R.id.forecast_day);
        ImageView imageView = root.findViewById(R.id.forecast_icon);

        // Set nội dung
        textView.setText("Thursday");
        imageView.setImageResource(R.drawable.weathericon);

        return root;
    }
}
