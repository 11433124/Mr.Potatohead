/*
* Jordy Hierck
* Minor Programmeren
* Native App Studio - Android
*
* Mister Potatohead
*
* Java file to control what the checkboxes in xml file.
 */

package com.example.jordy.mrpotatohead;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.CheckBox;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void setImage(View view)
    {
        // check if box is checked
        switch(view.getId())
        {
            // search if body part is clicked then set to visible and vice versa
            case R.id.eyes:
                ImageView eyes = (ImageView) findViewById(R.id.eyespic);
                if (((CheckBox) view).isChecked())
                    eyes.setVisibility(View.VISIBLE);
                else
                    eyes.setVisibility(View.INVISIBLE);
                break;
            case R.id.nose:
                ImageView nose = (ImageView) findViewById(R.id.nosepic);
                if (((CheckBox) view).isChecked())
                    nose.setVisibility(View.VISIBLE);
                else
                    nose.setVisibility(View.INVISIBLE);
                break;
            case R.id.eyebrows:
                ImageView eyebrows = (ImageView) findViewById(R.id.eyebrowspic);
                if (((CheckBox) view).isChecked())
                    eyebrows.setVisibility(View.VISIBLE);
                else
                    eyebrows.setVisibility(View.INVISIBLE);
                break;
            case R.id.ears:
                ImageView ears = (ImageView) findViewById(R.id.earspic);
                if (((CheckBox) view).isChecked())
                    ears.setVisibility(View.VISIBLE);
                else
                    ears.setVisibility(View.INVISIBLE);
                break;
            case R.id.mouth:
                ImageView mouth = (ImageView) findViewById(R.id.mouthpic);
                if (((CheckBox) view).isChecked())
                    mouth.setVisibility(View.VISIBLE);
                else
                    mouth.setVisibility(View.INVISIBLE);
                break;
            case R.id.mustache:
                ImageView mustache = (ImageView) findViewById(R.id.mustachepic);
                if (((CheckBox) view).isChecked())
                    mustache.setVisibility(View.VISIBLE);
                else
                    mustache.setVisibility(View.INVISIBLE);
                break;
            case R.id.arms:
                ImageView arms = (ImageView) findViewById(R.id.armspic);
                if (((CheckBox) view).isChecked())
                    arms.setVisibility(View.VISIBLE);
                else
                    arms.setVisibility(View.INVISIBLE);
                break;
            case R.id.shoes:
                ImageView shoes = (ImageView) findViewById(R.id.shoespic);
                if (((CheckBox) view).isChecked())
                    shoes.setVisibility(View.VISIBLE);
                else
                    shoes.setVisibility(View.INVISIBLE);
                break;
            case R.id.glasses:
                ImageView glasses = (ImageView) findViewById(R.id.glassespic);
                if (((CheckBox) view).isChecked())
                    glasses.setVisibility(View.VISIBLE);
                else
                    glasses.setVisibility(View.INVISIBLE);
                break;
            case R.id.hat:
                ImageView hat = (ImageView) findViewById(R.id.hatpic);
                if (((CheckBox) view).isChecked())
                    hat.setVisibility(View.VISIBLE);
                else
                    hat.setVisibility(View.INVISIBLE);
                break;
        }
    }
}
