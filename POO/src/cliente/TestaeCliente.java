package cliente;

public class TestaeCliente {

	public static void main(String[] args) {

		Cliente cliente1 = new Cliente(1, "Ray", "Rua T", 20, 00002222, 998745612);
		cliente1.visualizar();

		Cliente cliente2 = new Cliente(2, "Ane", "Rua C", 22, 88885555, 944525874);
		cliente2.visualizar();
	}
}