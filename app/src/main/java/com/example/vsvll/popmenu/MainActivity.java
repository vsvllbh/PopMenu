package com.example.vsvll.popmenu;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.PopupMenu;

public class MainActivity extends AppCompatActivity {

    LinearLayout linearLayout;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        linearLayout = findViewById(R.id.LinearLayout);
        button = findViewById(R.id.Button);
    }

    public void PopUpMenu(View view) {

        PopupMenu popupMenu = new PopupMenu(this, button);

        popupMenu.getMenuInflater().inflate(R.menu.main_menu, popupMenu.getMenu());

        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.Blue:
                        linearLayout.setBackgroundColor(Color.BLUE);
                        break;
                    case R.id.Green:
                        linearLayout.setBackgroundColor(Color.GREEN);
                        break;
                    case R.id.Yellow:
                        linearLayout.setBackgroundColor(Color.YELLOW);
                        break;
                }


                return true;
            }
        });
        popupMenu.show();
    }

}
