package com.example.wednesday1.util;

import com.example.wednesday1.interf.RowMap;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JdbcUtil {

    private static final String URL = "jdbc:hive2://192.168.62.171:10000/nanjing_house";

    static {
        try {
            Class.forName("org.apache.hive.jdbc.HiveDriver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

    public static Connection getConnection() {

        Connection connection = null;

        try {
            connection = DriverManager.getConnection(URL);
        }catch (SQLException e) {
            e.printStackTrace();
        }

        return connection;
    }

    public static <T> List<T> executeQuery(String sql, RowMap<T> rowMap, Object... objects) {

        Connection connection = getConnection();
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        List<T> list = new ArrayList<>();

        try {
            preparedStatement = connection.prepareStatement(sql);
            if (objects != null) {
                for (int i = 0; i < objects.length; i++) {
                    preparedStatement.setObject(i + 1, objects[i]);
                }
            }
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                T t = rowMap.rowMapping(resultSet);
                list.add(t);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close(resultSet, preparedStatement, connection);
        }

        return list;

    }

    public static void close(ResultSet resultSet, PreparedStatement preparedStatement, Connection connection) {

        try {
            if (resultSet != null) {
                resultSet.close();
            }
            if (preparedStatement != null) {
                preparedStatement.close();
            }
            if (connection != null) {
                connection.close();
            }
        }catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public static boolean hiveBasicOperation (String sql) {

        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            connection = getConnection();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.execute();
        }catch (SQLException sqlException){
            sqlException.printStackTrace();
        }finally {
            close(null, preparedStatement, connection);
        }

        return true;

    }

}
