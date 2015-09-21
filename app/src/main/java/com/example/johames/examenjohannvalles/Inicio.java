package com.example.johames.examenjohannvalles;

import android.app.ListActivity;
import android.content.Intent;
import android.database.MatrixCursor;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class Inicio extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_inicio);
        String[] columnas = new String[]{"_id", "imagen", "textoSuperior", "textoInferior"};
        MatrixCursor cursor = new MatrixCursor(columnas);
        cursor.addRow(new Object[]{"0", R.drawable.p1, "Jesús de Nasaret", "La vida de Jesús desde su nacimiento a su muerte"});
        cursor.addRow(new Object[]{"1", R.drawable.p2, "A Prueba de Fuego", "La historia de un hombre que lucho hasta el final"});
        cursor.addRow(new Object[]{"2", R.drawable.p3, "Dios no Está Muerto", "La historia de la fe de un joven"});
        cursor.addRow(new Object[]{"3", R.drawable.p4, "La Historia de Jesús", "La vida de Jesús para niños"});
        cursor.addRow(new Object[]{"4", R.drawable.p5, "La Pasión de Cristo", "La pasión, Muerte y Resurrección de Jesús"});
        cursor.addRow(new Object[]{"5", R.drawable.p6, "La Última Batalla", "Los sucesos que acontecerán en el final de los tiempos"});
        cursor.addRow(new Object[]{"6", R.drawable.p7, "Noé", "La historia de Noé en el diluvio"});


        String[] desdeEstasColumnas = {"imagen", "textoSuperior", "textoInferior"};
        int[] aEstasViews = {R.id.imageView_imagen, R.id.textView_superior, R.id.textView_inferior};
        SimpleCursorAdapter adapter = new SimpleCursorAdapter(this, R.layout.activity_inicio, cursor, desdeEstasColumnas, aEstasViews, 0);

        ListView listado = getListView();
        listado.setAdapter(adapter);

       listado.setOnItemClickListener(new AdapterView.OnItemClickListener() {
           @Override
           public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
               switch (position) {
                   case 0:
                       Intent p1 = new Intent(Inicio.this, Detalles.class);
                       startActivity(p1);
                       Toast.makeText(getApplicationContext(), "Cargando Detalles", Toast.LENGTH_SHORT).show();
                       break;
                   case 1:
                       Intent p2 = new Intent(Inicio.this, Detallep2.class);
                       startActivity(p2);
                       Toast.makeText(getApplicationContext(), "Cargando Detalles", Toast.LENGTH_SHORT).show();
                       break;
                   case 2:
                       Intent p3 = new Intent(Inicio.this, Detallesp3.class);
                       startActivity(p3);
                       Toast.makeText(getApplicationContext(), "Cargando Detalles", Toast.LENGTH_SHORT).show();
                       break;
                   case 3:
                       Intent p4 = new Intent(Inicio.this, Detalles.class);
                       startActivity(p4);
                       Toast.makeText(getApplicationContext(), "Cargando Detalles", Toast.LENGTH_SHORT).show();
                       break;
                   case 4:
                       Intent p5 = new Intent(Inicio.this, Detalles.class);
                       startActivity(p5);
                       Toast.makeText(getApplicationContext(), "Cargando Detalles", Toast.LENGTH_SHORT).show();
                       break;
                   case 5:
                       Intent p6 = new Intent(Inicio.this, Detalles.class);
                       startActivity(p6);
                       Toast.makeText(getApplicationContext(), "Cargando Detalles", Toast.LENGTH_SHORT).show();
                       break;
                   case 6:
                       Intent p7 = new Intent(Inicio.this, Detalles.class);
                       startActivity(p7);
                       Toast.makeText(getApplicationContext(), "Cargando Detalles", Toast.LENGTH_SHORT).show();
                       break;
               }
           }
       });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_inicio, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}