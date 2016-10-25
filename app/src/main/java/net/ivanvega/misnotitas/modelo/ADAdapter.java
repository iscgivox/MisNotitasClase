package net.ivanvega.misnotitas.modelo;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by SERVIDOR on 25/10/2016.
 */

public class ADAdapter extends SQLiteOpenHelper {
    String SCRIPT_DB = "create table NotaTarea (" +
            "_id Integer primarykey not null, Titulo text not null," +
            " descripion text, tipo enum (tarea, nota), " +
            "Fecha-hora datetime); create ";

    public ADAdapter(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
