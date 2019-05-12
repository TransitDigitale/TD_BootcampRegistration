package com.td.transitiondigitale;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.synnapps.carouselview.CarouselView;
import com.synnapps.carouselview.ImageListener;

public class HomeActivity extends AppCompatActivity {

    CarouselView carouselView;
    Dialog myDialog;
    RelativeLayout coordinatorLayout;

    int[] sampleImages = {R.drawable.rl1, R.drawable.rl2, R.drawable.rl3};
    //int NUMBER_OF_PAGES = 5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        //SliderCarousel
        carouselView = (CarouselView) findViewById(R.id.carouselView);
        carouselView.setPageCount(sampleImages.length);
        carouselView.setImageListener(imageListener);

        //PopUp
        myDialog = new Dialog(this);

        //snackbar
        coordinatorLayout = (RelativeLayout) findViewById(R.id.home);
    }

    ImageListener imageListener = new ImageListener() {
        @Override
        public void setImageForPosition(int position, ImageView imageView) {
            imageView.setImageResource(sampleImages[position]);
        }
    };


    public void onAndroid(View view) {

        TextView tvLinkAndroid;
        Button btnRegisterAndroid;
        Button btnShareAndroid;
        myDialog.setContentView(R.layout.popupandroid);
        //myDialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        //txtclose =(TextView) myDialog.findViewById(R.id.txtclose);
        //txtclose.setText("M");
        btnRegisterAndroid = (Button) myDialog.findViewById(R.id.btnRegisterAndroid);
        btnRegisterAndroid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent i = new Intent(LoginActivity.this,Register.class);
                String url = "https://apply.codepath.com/cohorts/haiti-androidbootcamp-summer-2019/versions/student/";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
                myDialog.dismiss();
            }
        });

        btnShareAndroid = (Button) myDialog.findViewById(R.id.btnShareAndroid);
        btnShareAndroid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String shareBody = "https://apply.codepath.com/cohorts/haiti-androidbootcamp-summer-2019/versions/student/";
                Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
                sharingIntent.setType("text/plain");
                sharingIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, "ANDROID BOOTCAMP");
                sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, shareBody);
                startActivity(Intent.createChooser(sharingIntent, getResources().getString(R.string.share_using)));
                myDialog.dismiss();
            }
        });

        myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        myDialog.show();
    }


    public void onIos(View view) {

        TextView tvLinkAndroid;
        Button btnRegisterAndroid;
        Button btnShareAndroid;
        myDialog.setContentView(R.layout.popupios);
        //myDialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        //txtclose =(TextView) myDialog.findViewById(R.id.txtclose);
        //txtclose.setText("M");
        btnRegisterAndroid = (Button) myDialog.findViewById(R.id.btnRegisterAndroid);
        btnRegisterAndroid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent i = new Intent(LoginActivity.this,Register.class);
                String url = "https://apply.codepath.com/cohorts/haiti-ios-bootcamp-summer-2019/versions/student/";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
                myDialog.dismiss();
            }
        });

        btnShareAndroid = (Button) myDialog.findViewById(R.id.btnShareAndroid);
        btnShareAndroid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String shareBody = "https://apply.codepath.com/cohorts/haiti-ios-bootcamp-summer-2019/versions/student/";
                Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
                sharingIntent.setType("text/plain");
                sharingIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, "iOS BOOTCAMP");
                sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, shareBody);
                startActivity(Intent.createChooser(sharingIntent, getResources().getString(R.string.share_using)));
                myDialog.dismiss();
            }
        });

        myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        myDialog.show();



    }

    public void onHftic(View view) {

        TextView tvLinkAndroid;
        Button btnRegisterAndroid;
        Button btnShareAndroid;
        myDialog.setContentView(R.layout.popuphftic);
        //myDialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        //txtclose =(TextView) myDialog.findViewById(R.id.txtclose);
        //txtclose.setText("M");
        btnRegisterAndroid = (Button) myDialog.findViewById(R.id.btnRegisterAndroid);
        btnRegisterAndroid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent i = new Intent(LoginActivity.this,Register.class);
                String url = "https://apply.codepath.com/cohorts/haiti-androidbootcampforwomen-summer-2019/versions/student/";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
                myDialog.dismiss();
            }
        });

        btnShareAndroid = (Button) myDialog.findViewById(R.id.btnShareAndroid);
        btnShareAndroid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String shareBody = "https://apply.codepath.com/cohorts/haiti-androidbootcampforwomen-summer-2019/versions/student/";
                Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
                sharingIntent.setType("text/plain");
                sharingIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, "WOMEN ANDROID BOOTCAMP");
                sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, shareBody);
                startActivity(Intent.createChooser(sharingIntent, getResources().getString(R.string.share_using)));
                myDialog.dismiss();
            }
        });

        myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        myDialog.show();


    }

    public void onHistory(View view) {

        Snackbar snackbar = Snackbar
                .make(coordinatorLayout, "Coming Soon", Snackbar.LENGTH_LONG)
                .setAction("Visit our Website", new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        String url = "https://transitiondigitalehaiti.com/";
                        Intent i = new Intent(Intent.ACTION_VIEW);
                        i.setData(Uri.parse(url));
                        startActivity(i);

                    }
                });
        snackbar.setActionTextColor(Color.BLUE);
        View sbView = snackbar.getView();
        TextView textView = (TextView) sbView.findViewById(android.support.design.R.id.snackbar_text);
        textView.setTextColor(Color.MAGENTA);
        snackbar.show();

    }
}
