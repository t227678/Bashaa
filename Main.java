package com.example.accountingapp;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper {
    public static final String DATABASE_NAME = "AccountingApp.db";

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        // جدول الأصناف
        db.execSQL("CREATE TABLE items (id INTEGER PRIMARY KEY AUTOINCREMENT, name TEXT, quantity INTEGER, price REAL)");

        // جدول العملاء
        db.execSQL("CREATE TABLE customers (id INTEGER PRIMARY KEY AUTOINCREMENT, name TEXT, phone TEXT)");

        // جدول فواتير المشتريات
        db.execSQL("CREATE TABLE purchase_invoices (id INTEGER PRIMARY KEY AUTOINCREMENT, item_id INTEGER, quantity INTEGER, total REAL, date TEXT)");

        // جدول فواتير المبيعات
        db.execSQL("CREATE TABLE sales_invoices (id INTEGER PRIMARY KEY AUTOINCREMENT, customer_id INTEGER, total REAL, date TEXT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS items");
        db.execSQL("DROP TABLE IF EXISTS customers");
        db.execSQL("DROP TABLE IF EXISTS purchase_invoices");
        db.execSQL("DROP TABLE IF EXISTS sales_invoices");
        onCreate(db);
    }
}

public class Main {
    
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
    
}