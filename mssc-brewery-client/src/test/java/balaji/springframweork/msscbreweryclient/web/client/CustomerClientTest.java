package balaji.springframweork.msscbreweryclient.web.client;

import balaji.springframweork.msscbreweryclient.web.model.CustomerDTO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CustomerClientTest {

    @Autowired
    private CustomerClient customerClient;

    @Test
    void getCustomerById() {
        assertNotNull(customerClient.getCustomerById(UUID.randomUUID()));
    }

    @Test
    void createCustomer() {
        CustomerDTO customerDTO = CustomerDTO.builder()
                .name("Test")
                .build();

        assertNotNull(customerClient.createCustomer(customerDTO));
    }

    @Test
    void updateCustomer() {
        CustomerDTO customerDTO = CustomerDTO.builder()
                .name("Test")
                .build();

        customerClient.updateCustomer(UUID.randomUUID(), customerDTO);
    }

    @Test
    void deleteCustomer() {
        customerClient.deleteCustomer(UUID.randomUUID());
    }
}