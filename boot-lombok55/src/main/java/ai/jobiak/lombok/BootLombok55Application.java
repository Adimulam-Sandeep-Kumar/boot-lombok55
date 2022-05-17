package ai.jobiak.lombok;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ai.jobiak.lombok.model.Customer;

@SpringBootApplication
public class BootLombok55Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(BootLombok55Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Customer c = new Customer();
		c.setCusId(1);
		c.setName("John Doe");
		c.setBalance(2000);
		
		System.out.println(c.getBalance());
		System.out.println(c.getName());
		System.out.println(c.getCusId());
				
		System.out.println(c);
	}
	
}
