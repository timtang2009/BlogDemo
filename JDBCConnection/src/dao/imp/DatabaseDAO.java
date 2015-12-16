package dao.imp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseDAO {
	private Connection conn = null;

	public Connection getConnection() throws ClassNotFoundException,
			SQLException {
		Connection conn = null;
		Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/community";
		// ���ݿ��û���
		String username = "root";
		// ���ݿ�����
		String password = "1234";
		conn = DriverManager.getConnection(url, username, password);
		System.out.println("Connection Created!");
		return conn;
	}

	public void releaseConnection() throws SQLException {
		this.conn.close();
		this.conn = null;
	}

	public ResultSet getResultSet(String querySQL) throws SQLException,
			ClassNotFoundException {
		if (conn == null) {
			this.conn = getConnection();
		}
		Statement stm = conn.createStatement();
		ResultSet thisRST = stm.executeQuery(querySQL);
		return thisRST;
	}

	public void executeSQL(String SQL) throws SQLException,
			ClassNotFoundException {
		if (conn == null) {
			this.conn = getConnection();
		}
		Statement stm = conn.createStatement();
		stm.executeUpdate(SQL);
		this.conn.close();
		this.conn = null;
	}
	
	public void connectToDb() {
		try {
			// �������ݿ�������ע�ᵽ����������
			Class.forName("com.mysql.jdbc.Driver");
			// ���ݿ������ַ���
			String url = "jdbc:mysql://localhost:3306/community";
			// ���ݿ��û���
			String username = "root";
			// ���ݿ�����
			String password = "1234";
			// ����Connection����
			Connection conn = DriverManager.getConnection(url, username,
					password);
			// �ж� ���ݿ������Ƿ�Ϊ��
			Statement statement = conn.createStatement();
			//String insertSQL = "INSERT INTO diary(title, content, authorName, time)"
				//	+ "VALUES('��ƪ�ռ�','����ƪ����', 'java������3', NOW())";
			String insertSQL = "INSERT INTO testcase(id, title, content, authorName)"
					+ "VALUES(21, '21-Fourth Diary', '21-The content of Fourth Diary', '21-JavaLearner4')";
			int count = statement.executeUpdate(insertSQL);
			System.out.println("�ɹ�������" + count + "������");
			statement.close();
			conn.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		DatabaseDAO myDb = new DatabaseDAO();
		myDb.connectToDb();
	}
}
