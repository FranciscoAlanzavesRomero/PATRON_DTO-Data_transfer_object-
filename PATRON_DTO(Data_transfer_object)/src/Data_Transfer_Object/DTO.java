package Data_Transfer_Object;

import Business_Object.ClienteBO;
import Value_object.ClienteVO;

public class DTO {

	public static void main(String[] args) {
		// objeto business object
		ClienteBO clienteBusinessObject = new ClienteBO();

		// obtiene todos los clientes
		clienteBusinessObject.obtenerClientes().forEach(System.out::println);

		// actualiza un cliente
		System.out.println("****");
		ClienteVO cliente = clienteBusinessObject.obtenerCliente(0);
		cliente.setNombre("Luis");
		clienteBusinessObject.actualizarCliente(cliente);

		// obtiene un cliente
		System.out.println("****");
		cliente = clienteBusinessObject.obtenerCliente(0);
		System.out.println(cliente);

		// elimina un cliente
		System.out.println("****");
		cliente = clienteBusinessObject.obtenerCliente(0);
		clienteBusinessObject.eliminarCliente(cliente);
	}
}
