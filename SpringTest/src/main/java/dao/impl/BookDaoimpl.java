package dao.impl;

import dao.BookDao;

public class BookDaoimpl implements BookDao {
    private int conn;
    private String database;

//    public void setConn(int conn) {
//        this.conn = conn;
//    }
//
//    public void setDatabase(String database) {
//        this.database = database;
//    }


    public BookDaoimpl(int conn, String database) {
        this.conn = conn;
        this.database = database;
    }

    public void print() {
        System.out.println("BookDaoimpl"+database+","+conn);
    }
}
