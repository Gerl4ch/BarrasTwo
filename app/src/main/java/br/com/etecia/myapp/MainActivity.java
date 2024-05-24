package br.com.etecia.myapp;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {
    BottomNavigationView bottomNavView;
    MaterialToolbar idTopBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        //Apresentando o XML para o JAVA
        bottomNavView = findViewById(R.id.bottomNavView);
        idTopBar = findViewById(R.id.idTopBar);

        //Criando o evento de clique na TopBar
        idTopBar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                if (item.getItemId() == R.id.mFav) {
                    Toast.makeText(getApplicationContext(),
                            "Favoritei", Toast.LENGTH_SHORT).show();
                }
                if (item.getItemId() == R.id.mExplore) {
                    Toast.makeText(getApplicationContext(),
                            "Cliquei em Explorar", Toast.LENGTH_SHORT).show();
                }
                if (item.getItemId() == R.id.mSearch) {
                    Toast.makeText(getApplicationContext(),
                            "Cliquei em Pesquisar", Toast.LENGTH_SHORT).show();
                }
                if (item.getItemId() == R.id.mCloud) {
                    Toast.makeText(getApplicationContext(),
                            "Cliquei na Nuvem", Toast.LENGTH_SHORT).show();
                }
                if (item.getItemId() == R.id.mLocation) {
                    Toast.makeText(getApplicationContext(),
                            "Cliquei na Localização", Toast.LENGTH_SHORT).show();
                }
                if (item.getItemId() == R.id.mShare) {
                    Toast.makeText(getApplicationContext(),
                            "CLiquei em Compartilhar", Toast.LENGTH_SHORT).show();
                }
                return false;
            }
        });

        //Criando evento de click nos itens de menu
        bottomNavView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                if (menuItem.getItemId() == R.id.mNews) {
                    Toast.makeText(getApplicationContext(),
                            "Cliquei em News", Toast.LENGTH_SHORT).show();
                }
                if (menuItem.getItemId() == R.id.mGlobal) {
                    Toast.makeText(getApplicationContext(),
                            "Cliquei em Global", Toast.LENGTH_SHORT).show();
                }
                if (menuItem.getItemId() == R.id.mForYou) {
                    Toast.makeText(getApplicationContext(),
                            "Cliquei em For You", Toast.LENGTH_SHORT).show();
                }
                if (menuItem.getItemId() == R.id.mTrending) {
                    Toast.makeText(getApplicationContext(),
                            "Cliquei em Trending", Toast.LENGTH_SHORT).show();
                }
                return false;
            }
        });
    }
}