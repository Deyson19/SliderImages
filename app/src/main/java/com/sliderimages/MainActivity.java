package com.sliderimages;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageSlider imageSlider = findViewById(R.id.slider);

        List<SlideModel> slideModels = new ArrayList<>();
        slideModels.add(new SlideModel("https://cdn.pixabay.com/photo/2019/10/29/14/46/landscape-4587079_960_720.jpg","Image 1"));
        slideModels.add(new SlideModel("https://cdn.pixabay.com/photo/2019/11/01/11/08/landscape-4593909__340.jpg","Image 2"));
        slideModels.add(new SlideModel("https://cdn.pixabay.com/photo/2020/06/30/22/34/dog-5357794__340.jpg","Image 3"));
        slideModels.add(new SlideModel("https://cdn.pixabay.com/photo/2020/07/02/17/29/landscape-5363681__340.jpg","Image 4"));
        slideModels.add(new SlideModel("https://cdn.pixabay.com/photo/2020/07/02/10/25/moonlight-5362539__340.jpg","Image 5"));
        slideModels.add(new SlideModel("https://cdn.pixabay.com/photo/2020/06/30/11/11/landscape-5356009__340.jpg","Image 6"));
        imageSlider.setImageList(slideModels,true);

    }
}