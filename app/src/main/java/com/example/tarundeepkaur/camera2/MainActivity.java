package com.example.tarundeepkaur.camera2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.graphics.Bitmap;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {




            static final int REQUEST_IMAGE_CAPTURE = 1000;
            static final int RESULT_LOAD_IMAGE = 10;
            private static Button fromCamera;
            private static Button fromGallery;
    ImageView pic;

            @Override
            protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_main);
                pic = findViewById(R.id.cameraPicture);
                fromCamera = findViewById(R.id.camera);
                fromGallery = findViewById(R.id.Gallery);
                setListeners();
            }

            private void setListeners() {
                fromCamera.setOnClickListener(this);
                fromGallery.setOnClickListener(this);
            }

            @Override
            public void onClick(View view) {
                switch (view.getId()) {
                    case R.id.Gallery:

                        Intent i = new Intent(
                                Intent.ACTION_PICK,
                                android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI);

                        startActivityForResult(i, RESULT_LOAD_IMAGE);

                        break;
                    case R.id.camera:
                        takePicturesCamera();

                }
            }


    private void takePicturesCamera() {
                Intent takePictureIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                if (takePictureIntent.resolveActivity(getPackageManager()) != null) {
                    startActivityForResult(takePictureIntent, REQUEST_IMAGE_CAPTURE);
                }
            }


            @Override
            protected void onActivityResult(int requestCode, int resultCode, Intent data) {
                if (requestCode == REQUEST_IMAGE_CAPTURE && resultCode == RESULT_OK) {
                    Bundle extras = data.getExtras();
                    assert extras != null;
                    Bitmap imageBitmap = (Bitmap) extras.get("data");
                    ImageView mImageView = findViewById(R.id.cameraPicture);
                    mImageView.setImageBitmap(imageBitmap);


                }


            }

}