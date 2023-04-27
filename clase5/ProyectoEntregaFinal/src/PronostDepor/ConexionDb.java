package PronostDepor;

public class ConexionDb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.jdbc.Driver");	
		}catch(Exception e){
		System.out.println("Error de conectiion");
		}
	}
}
