package vn.edu.usth.weather;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class ForecastFragment extends Fragment {

    @Override
    public View onCreateView(android.view.LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Create a vertical LinearLayout
        LinearLayout layout = new LinearLayout(getActivity());
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setGravity(Gravity.CENTER);
        layout.setBackgroundColor(Color.parseColor("#20FF0000")); // just to see area

        // Create TextView
        TextView textView = new TextView(getActivity());
        textView.setText("Thursday");
        textView.setTextSize(24);
        textView.setTextColor(Color.BLACK);
        textView.setGravity(Gravity.CENTER);

        // Create ImageView
        ImageView imageView = new ImageView(getActivity());
        imageView.setImageResource(R.drawable.weathericon); // one of your icons
        LinearLayout.LayoutParams imgParams = new LinearLayout.LayoutParams(
                200, 200); // size in px
        imgParams.gravity = Gravity.CENTER;
        imageView.setLayoutParams(imgParams);

        // Add views to layout
        layout.addView(textView);
        layout.addView(imageView);

        return layout;
    }
}
