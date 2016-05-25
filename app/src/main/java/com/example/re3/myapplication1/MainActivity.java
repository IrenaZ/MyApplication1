package com.example.re3.myapplication1;



        import android.os.Bundle;
        import android.support.v7.app.AppCompatActivity;
        import android.view.Menu;
        import android.view.MenuItem;

        import android.content.Intent;
        import android.widget.EditText;
        import android.view.View;

public class MainActivity extends AppCompatActivity {

    public final static String EXTRA_MESSAGE ="com.example.re3.myapplication1";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    /** Метод обработки нажатия на кнопку*/
    public void sendMessage(View view) {
        // действия, совершаемые после нажатия на кнопку
        // Создаем объект Intent для вызова новой Activity
        Intent intent = new Intent(this, DisplayMessageActivity.class);
// Получаем текстовое поле в текущей Activity
        EditText editText = (EditText) findViewById(R.id.edit_message);
// Получае текст данного текстового поля
        String message = editText.getText().toString();
// Добавляем с помощью свойства putExtra объект - первый параметр - ключ,
// второй параметр - значение этого объекта
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);





    }

}