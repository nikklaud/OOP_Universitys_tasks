package db;

import model.Student;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Queries {
    public static void printConnectionStatus() {
        try (Connection conn = DBConnection.getConnection()) {
            if (conn != null) {
                System.out.println("Соединение с базой данных установлено успешно.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static List<Student> getTop10StudentsSorted() {
        List<Student> students = new ArrayList<>();
        String sql = "SELECT student_id, student_name FROM students ORDER BY student_name LIMIT 10";

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                String id = rs.getString("student_id");
                String name = rs.getString("student_name");
                students.add(new Student(id, name));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return students;
    }

    public static void getTranscriptForOliverJones() {
        String sql = "SELECT * FROM transcript WHERE student_id = '123456789'";

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            System.out.println("\nТранскрипт для Oliver Jones:");
            while (rs.next()) {
                System.out.println("Course: " + rs.getString("course_id") + ", Grade: " + rs.getString("grade"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void insertSampleData() {
        try (Connection conn = DBConnection.getConnection()) {
            conn.setAutoCommit(false);

            try (
                    Statement stmt = conn.createStatement()
            ) {
                for (int i = 1; i <= 5; i++) {
                    stmt.addBatch("INSERT INTO students (student_id, student_name) VALUES ('S00" + i + "', 'Student " + i + "')");
                    stmt.addBatch("INSERT INTO courses (course_id, course_name) VALUES ('C00" + i + "', 'Course " + i + "')");
                    stmt.addBatch("INSERT INTO dept (dept_id, dept_name) VALUES ('D00" + i + "', 'Department " + i + "')");
                }

                stmt.executeBatch();
                conn.commit();
                System.out.println("\n5 записей успешно добавлены в таблицы students, courses и dept.");
            } catch (SQLException e) {
                conn.rollback();
                throw e;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
