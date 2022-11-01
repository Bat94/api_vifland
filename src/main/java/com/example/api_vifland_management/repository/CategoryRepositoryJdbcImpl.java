package com.example.api_vifland_management.repository;

import com.example.api_vifland_management.entity.Category;
import org.springframework.stereotype.Repository;

import java.sql.*;
@Repository
public class CategoryRepositoryJdbcImpl implements CategoryRepositoryJdbc {
    static final String DB_URL = "jdbc:mysql://localhost/api_vifland_management";
    static final String USER = "root";
    static final String PASS = "123456";
    static final String QUERY = "SELECT id, first, last, age FROM Employees";


    public Connection getConnection() throws SQLException {
        // Open a connection
        Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);

        return conn;

    }


    @Override
    public Category findOneById(int cateId) {
        Connection connection = null;
        try {
            connection = getConnection();
            String s = "SELECT * FROM Category WHERE id = ?";
            PreparedStatement statement = connection.prepareStatement(s);
            statement.setInt(1, cateId);
            ResultSet resultSet = statement.executeQuery();
            statement.executeUpdate();
            Category category = new Category();
            category.setId(resultSet.getInt(1));
            category.setName(resultSet.getString(2));
            return category;
        } catch (SQLException throwable) {
            throwable.printStackTrace();
        }
        return null;
    }

    @Override
    public void insert(Category category) {
        Connection connection = null;
        try {
            connection = getConnection();
            String s = "INSERT INTO CATEGORY ( ID,PARENT_ID, NAME, LANGUAGE ) VALUES (?,?,?,?)";

            PreparedStatement statement = connection.prepareStatement(s);
//            ResultSet resultSet = statement.executeQuery();

            statement.setInt(1,category.getId());
            statement.setInt(2, category.getParentId());
            statement.setString(3, category.getName());
            statement.setString(4, category.getLanguage());
            //Set continue
            statement.executeUpdate();

        } catch (SQLException throwable) {
            throwable.printStackTrace();
        }
    }


}
