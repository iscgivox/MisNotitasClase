package net.ivanvega.misnotitas.modelo;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by SERVIDOR on 25/10/2016.
 */

public class ADAdapter extends SQLiteOpenHelper {
    private final String  SCRIPT_DB = "create table NotaTarea (" +
            "_id integer primary key, titulo text not null," +
            "descripcion text, tipo integer, " +
            "fecha-hora text," +
            "fecha-hora-vencimineto integer); " +
            "create table multimedia (" +
            "_idNotaTarea  integer references NotaTarea(_id), " +
            "titulo text, " +
            "tipo integer not null, " +
            "uri text not null" +
            ");" +
            "create table recordatorios (_idNotaTarea integer reference NotaTarea(_id)," +
            "fecha-hora) text  not null";

    public ADAdapter(Context context, int version) {
        super(context, "db", null, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(SCRIPT_DB);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
