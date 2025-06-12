import java.util.Date;

import entities.Order;
import entities.enums.OrderStatus;

public class Aula120 {

	public static void main(String[] args) {
		// Enumerações
		// É um tipo especial que serve para especificar de forma literal um conjunto de constantes relacionadas
		// palavra chave em Java: enum
		
		Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);
		
		System.out.println(order);
		
		OrderStatus os1 = OrderStatus.DELIVERED;
		
		OrderStatus os2 = OrderStatus.valueOf("DELIVERED");
		
		System.out.println(os1);
		System.out.println(os2);
		
		System.out.println(order.getStatus());
		
		order.setStatus(os2);
		
		System.out.println(order.getStatus());
		
		System.out.println(order);
	}

}
