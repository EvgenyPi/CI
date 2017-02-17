package com.evgeny.criminalintent;

import android.app.Dialog;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;

import java.io.File;


public class PhotoFragment extends DialogFragment {

    private static final String ARG_URI = "uri";

    private String mUri;
    private ImageView mImageView;


    public static PhotoFragment newInstance(String uri) {

        Bundle args = new Bundle();
        args.putString(ARG_URI, uri);

        PhotoFragment f = new PhotoFragment();
        f.setArguments(args);

        return f;
    }


    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        mUri = getArguments().getString(ARG_URI);

        View v = LayoutInflater.from(getActivity())
                .inflate(R.layout.full_photo, null);
        mImageView = (ImageView) v.findViewById(R.id.iv_full_photo);


        File imgFile = new File(mUri);

        if(imgFile.exists()){

            Bitmap myBitmap = BitmapFactory.decodeFile(imgFile.getAbsolutePath());
            mImageView.setImageBitmap(myBitmap);

        }

        final Dialog dialog = new Dialog(getActivity());
        dialog.setContentView(v);
        dialog.show();

        return dialog;

    }
}
