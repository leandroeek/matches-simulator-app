package me.dio.simulator.ui;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import me.dio.simulator.databinding.ActivityMainBinding;
import me.dio.simulator.domain.Team;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setupMatchesList();
        setupMatchesRefresh();
        setupFloatingActionButton();

    }

    private void setupMatchesList() {
        //TODO: Listar as partidas, consumindo nossa API.
    }

    private void setupMatchesRefresh() {
        //TODO: Atualizar as portidas na ação de swipe
    }

    private void setupFloatingActionButton() {
        //TODO: Criar evento de clique e simulação de partidas.
    }
}
