package vistula.jk.soundboardboy;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

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
        //MediaPlayer

        final MediaPlayer IgoMeow = MediaPlayer.create(this, R.raw.go_meow);
        final MediaPlayer Pedro = MediaPlayer.create(this, R.raw.pedro);
        final MediaPlayer Fart = MediaPlayer.create(this, R.raw.explosive_diarrhoea_sound);
        final MediaPlayer Freddy = MediaPlayer.create(this, R.raw.freddy_fasbear);
        final MediaPlayer Skibidi = MediaPlayer.create(this, R.raw.skibidi);
        final MediaPlayer WylaczTo = MediaPlayer.create(this, R.raw.wylacz_to);
        final MediaPlayer SmiechJasper = MediaPlayer.create(this, R.raw.smiech_jasper);
        final MediaPlayer Kabel = MediaPlayer.create(this, R.raw.cholerny_kabel);
        final MediaPlayer DoDupy = MediaPlayer.create(this, R.raw.do_dupy);
        final MediaPlayer EpicWin = MediaPlayer.create(this, R.raw.epic_win);
        final MediaPlayer MetalPipe = MediaPlayer.create(this, R.raw.metal_pipe);
        final MediaPlayer HeeHeeHeeHaw = MediaPlayer.create(this, R.raw.hee_hee_hee_haw);
        final MediaPlayer Sonar = MediaPlayer.create(this, R.raw.sonar);
        final MediaPlayer Amogus = MediaPlayer.create(this, R.raw.amogus_sound_effect);
        final MediaPlayer PanieBoze = MediaPlayer.create(this, R.raw.panie_boze);
        final MediaPlayer ProszeNiePrzeklinac = MediaPlayer.create(this, R.raw.prosze_nie_przeklinac);
        final MediaPlayer MajorKrzyczy = MediaPlayer.create(this, R.raw.major_krzyki);
        final MediaPlayer JuzZaczynasz = MediaPlayer.create(this, R.raw.juz_zaczynasz);
        //guziki findViewById

        Button btnIgoMeow = (Button) findViewById(R.id.btnIgoMeow);
        Button btnPedro = (Button) findViewById(R.id.btnPedro);
        Button btnFart = (Button) findViewById(R.id.btnExplosive);
        Button btnFreddy = (Button) findViewById(R.id.btnFreddy);
        Button btnSkibidi = (Button) findViewById(R.id.btnSkibidi);
        Button btnWylaczTo = (Button) findViewById(R.id.btnWylaczTo);
        Button btnSmiechJasper = (Button) findViewById(R.id.btnSmiechJasper);
        Button btnKabel = (Button) findViewById(R.id.btnKabel);
        Button btnDoDupy = (Button) findViewById(R.id.btnDoDupy);
        Button btnEpicWin = (Button) findViewById(R.id.btnEpicWin);
        Button btnMetalPipe = (Button) findViewById(R.id.btnMetalPipe);
        Button btnHeeHeeHeeHaw = (Button) findViewById(R.id.btnHeeHeeHeeHaw);
        Button btnSonar = (Button) findViewById(R.id.btnSonar);
        Button btnAmogus = (Button) findViewById(R.id.btnAmogus);
        Button btnPanieBoze = (Button) findViewById(R.id.btnPanieBozy);
        Button btnProszeNiePrzeklinac = (Button) findViewById(R.id.btnProszeNiePrzeklinac);
        Button btnMajorKrzyczy = (Button) findViewById(R.id.btnMajorKrzyczy);
        Button btnJuzZaczynasz = (Button) findViewById(R.id.btnJuzZaczynasz);
        //Listenery

        btnIgoMeow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                IgoMeow.start();
            }
        });
        btnPedro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Pedro.start();
            }
        });
        btnFart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fart.start();
            }
        });
        btnFreddy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Freddy.start();
            }
        });
        btnSkibidi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Skibidi.start();
            }
        });
        btnWylaczTo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                WylaczTo.start();
            }
        });
        btnSmiechJasper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SmiechJasper.start();
            }
        });
        btnKabel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Kabel.start();
            }
        });
        btnDoDupy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DoDupy.start();
            }
        });
        btnEpicWin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EpicWin.start();
            }
        });
        btnMetalPipe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MetalPipe.start();
            }
        });
        btnHeeHeeHeeHaw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                HeeHeeHeeHaw.start();
            }
        });
        btnSonar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sonar.start();
            }
        });
        btnAmogus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Amogus.start();
            }
        });
        btnPanieBoze.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PanieBoze.start();
            }
        });
        btnProszeNiePrzeklinac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ProszeNiePrzeklinac.start();
            }
        });
        btnMajorKrzyczy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MajorKrzyczy.start();
            }
        });
        btnJuzZaczynasz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                JuzZaczynasz.start();
            }
        });
        }
    }
