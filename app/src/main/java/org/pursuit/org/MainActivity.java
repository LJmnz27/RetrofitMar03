package org.pursuit.org;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.pursuit.org.models.Numbers;
import org.pursuit.org.models.NumbersService;
import org.pursuit.org.models.RetrofitSingleton;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class MainActivity extends AppCompatActivity {
    final Retrofit retrofit = RetrofitSingleton.getInstance();
    final NumbersService numbersService = retrofit.create(NumbersService.class);
    private static TextView textView;
    private static EditText editText;
    private static Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      getNumbers();

    }

    private void getNumbers() {
        numbersService.getNumbers().enqueue(new Callback<Numbers>() {
            @Override
            public void onResponse(Call<Numbers> call, Response<Numbers> response) {

            }

            @Override
            public void onFailure(Call<Numbers> call, Throwable t) {

            }
        });
    }
}
