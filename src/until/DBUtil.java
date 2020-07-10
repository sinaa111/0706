package until;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
    public static Connection getConnection(String DB, String URL, String USER, String PASSWORD)
            throws SQLException {
        return DriverManager.getConnection(URL + "?user=" + USER + "&password=" + PASSWORD);
    }

    public static Connection getConnection(String URL, String USER, String PASSWORD) throws SQLException {
        HikariConfig config = new HikariConfig();
        config.setJdbcUrl(URL);
        config.setUsername(USER);
        config.setPassword(PASSWORD);
        config.addDataSourceProperty("cachePrepStmts", "true");
        config.addDataSourceProperty("prepStmtCacheSize", "250");
        config.addDataSourceProperty("prepStmtCacheSqlLimit", "2048");

        HikariDataSource ds = new HikariDataSource(config);
        return ds.getConnection();
    }

    public static Connection getConnection(String url) throws SQLException {
        return DriverManager.getConnection(url);
    }}
