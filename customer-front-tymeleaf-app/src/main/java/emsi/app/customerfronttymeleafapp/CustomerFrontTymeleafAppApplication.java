package emsi.app.customerfronttymeleafapp;

import emsi.app.customerfronttymeleafapp.entity.Customer;
import emsi.app.customerfronttymeleafapp.repo.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CustomerFrontTymeleafAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomerFrontTymeleafAppApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(CustomerRepository customerRepository){
        return args -> {
            customerRepository.save(Customer.builder().name("Othmane").email("otozy@gmail.com").build());
            customerRepository.save(Customer.builder().name("mohamed").email("elmohamed@gmail.com").build());
            customerRepository.save(Customer.builder().name("hafsae").email("shafsae@gmail.com").build());
        };
    }
}
