package com.tunahan.nightmodechangejava;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;

import com.tunahan.nightmodechangejava.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

  //  SharedPreferences sharedPreferences = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        /*
        sharedPreferences = getSharedPreferences("night",0);
        boolean booleanValue = sharedPreferences.getBoolean("night_mode",true);

        if (booleanValue){
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
            binding.switch1.setChecked(true);
            binding.imageView.setImageResource(R.drawable.ic_red_circle);

        }
 */

        binding.switch1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b){
                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);

                  /*  binding.switch1.setChecked(true);
                    binding.imageView.setImageResource(R.drawable.ic_red_circle);
                    SharedPreferences.Editor editor = sharedPreferences.edit();
                    editor.putBoolean("night_mode",true);
                    editor.apply();

                */

                }else{

                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);

                   /*

                   binding.switch1.setChecked(false);
                  binding.imageView.setImageResource(R.drawable.ic_red_circle);
                  SharedPreferences.Editor editor = sharedPreferences.edit();
                    editor.putBoolean("night_mode",false);
                    editor.apply();

                   */
                }
            }
        });




    }
}