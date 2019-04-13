package sidikmilati1998gmail.com;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.input_nama)
    EditText inputNama;
    @BindView(R.id.input_nim)
    EditText inputNim;
    @BindView(R.id.input_jurusan)
    EditText inputJurusan;
    @BindView(R.id.simpan_button)
    Button simpan_button;
    @BindView(R.id.hasil_nama)
    TextView hasilNama;
    @BindView(R.id.hasil_nim)
    TextView hasilNim;
    @BindView(R.id.hasil_jurusan)
    TextView hasilJurusan;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.simpan_button)
    public void btnClicked() {
        String nama = inputNama.getText().toString();
        hasilNama.setText(nama);
        String nim = inputNim.getText().toString();
        hasilNim.setText(nim);
        String jurusan = inputJurusan.getText().toString();
        hasilJurusan.setText(jurusan);


    }

    public void submit(View view) {
    }
}