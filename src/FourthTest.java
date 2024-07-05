import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class FourthTest {
    public void DoQueries() {
        String url = "jdbc:mysql://localhost:3306/base1";
        String user = "root";
        String password = "1234";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection conn = DriverManager.getConnection(url, user, password);
            Statement stmt = conn.createStatement();

            String findQuery = "SELECT customer_id, first_name, last_name, email " +
                    "FROM customers " +
                    "WHERE last_name = 'Smith' " +
                    "AND YEAR(created_at) = 2023";

            ResultSet rs = stmt.executeQuery(findQuery);
            
            while (rs.next()) {
                int customerId = rs.getInt("customer_id");
                String firstName = rs.getString("first_name");
                String lastName = rs.getString("last_name");
                String email = rs.getString("email");
                System.out.printf("Customer ID: %d, First Name: %s, Last Name: %s, Email: %s%n",
                        customerId, firstName, lastName, email);
            }

            String insertQuery = "INSERT INTO customers (first_name, last_name, email) " +
                    "VALUES ('Pilar', 'Rosa', 'pilar_rosa@email.com')";

            int rowsInserted = stmt.executeUpdate(insertQuery);

            if (rowsInserted > 0) {
                System.out.println("New customer inserted successfully!");
            }

            conn.close();
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}
